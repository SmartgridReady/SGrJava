package communicator.modbus.integrationtest;

import communicator.common.api.Int16UValue;
import communicator.common.api.Value;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.util.Scanner;

public class WagoTestsystemManualTest extends TestsystemBase {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args) throws Exception {
        init();
        handleMainMenu();
    }

    private static void handleMainMenu() {

        String menuText = "Press 'b' to go back to the previous menu.\n"
                + "Press 'q' to quit the program.\n\n"
                + "Please select an action:\n"
                + "'1' Set Digital OUT register\n";

        System.out.printf(menuText);

        String selection = scanInput("Your selection: ");
        switch (selection.trim().toLowerCase()) {
            case "1":
                handleSetDigitalOutMenu();
                break;
            case "b":
                return;
            case "q":
                System.exit(0);
            default:
                errorMenu("Invalid input. Please select 1 or 2",
                        WagoTestsystemManualTest::handleMainMenu);
                break;
        }
    }

    private static void handleSetDigitalOutMenu() {

        String value = scanInput("Enter a hexadecimal value (00 - FF):");
        if ("q".equalsIgnoreCase(value.trim())) {
            System.exit(0);
        }

        if ("b".equalsIgnoreCase(value.trim())) {
            return;
        }

        try {
            sendToRegisterAndReadBack(value);
            handleSetDigitalOutMenu();
        } catch (DecoderException e) {
            errorMenu("Error: Please enter a valid hexadecimal value (00 - FF)",
                    WagoTestsystemManualTest::handleSetDigitalOutMenu);
        }
    }

    private static void errorMenu(String errorText, Runnable callingMenuFunction) {

        String menuText = errorText + "\nPress Enter to continue.";
        String selection = scanInput(menuText);
        if ("q".equalsIgnoreCase(selection.trim())) {
            System.exit(0);
        } else {
            callingMenuFunction.run();
        }
    }

    private static String scanInput(String message, Object ... args) {
        System.out.printf(message, args);
        return scanner.nextLine();
    }

    private static void sendToRegisterAndReadBack(String value) throws DecoderException {
        if (value.trim().length() < 2) {
            throw new DecoderException("At least 2 characters required");
        }

        byte[] bytes = Hex.decodeHex(value);
        Value registerValue = Int16UValue.of(bytes[bytes.length -1]);

        try {
            getTestSystem().setVal("RegisterDigital_OUT", "Register1", registerValue);
        } catch (Exception e) {
            System.out.println("Sending to register command failed: " + e.getMessage());
        }
    }
}
