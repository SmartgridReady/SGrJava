package communicator.common.api;

import com.smartgridready.ns.v0.BitmapEntryProduct;
import com.smartgridready.ns.v0.BitmapProduct;
import com.smartgridready.ns.v0.V0Factory;
import communicator.common.api.values.BitmapValue;
import communicator.common.api.values.Value;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BitmapValueTest {


    private static final Map<String, Boolean> EXPECTED_BITMAP_RECORDS = new LinkedHashMap<>();
    static {
        EXPECTED_BITMAP_RECORDS.put("BIT_0", true);
        EXPECTED_BITMAP_RECORDS.put("BIT_1", true);
        EXPECTED_BITMAP_RECORDS.put("BIT_2", false);
        EXPECTED_BITMAP_RECORDS.put("BIT_3", false);
        EXPECTED_BITMAP_RECORDS.put("BIT_4", false);
        EXPECTED_BITMAP_RECORDS.put("BIT_5", true);
        EXPECTED_BITMAP_RECORDS.put("BIT_6", false);
        EXPECTED_BITMAP_RECORDS.put("BIT_7", true);
        EXPECTED_BITMAP_RECORDS.put("BIT_8", true);
        EXPECTED_BITMAP_RECORDS.put("BIT_16", false);
        EXPECTED_BITMAP_RECORDS.put("BIT_17", true);
        EXPECTED_BITMAP_RECORDS.put("BIT_18", true);
    }

    private static final int[] EXPECTED_REGISTER_VALUE = new int[]{0x00000006, 0x000001A3};
    private static final int EXPECTED_VALUE_AS_NUMBER = 393635;

    @Test
    void factoryMethodBitmapFromModbusRegisters() {

        Value resVal = BitmapValue.of(EXPECTED_REGISTER_VALUE, createBitmap());
        assertEquals(EXPECTED_BITMAP_RECORDS.size(), resVal.getBitmap().size());
        resVal.getBitmap().forEach( (recordLiteral, recordValue) -> assertEquals(EXPECTED_BITMAP_RECORDS.get(recordLiteral), recordValue));
    }

    @Test
    void toModbusRegisters() {

        BitmapValue testVal = BitmapValue.of(EXPECTED_BITMAP_RECORDS);

        int[] modbusRegisters = testVal.toModbusRegisters(2, createBitmap());
        assertArrayEquals(EXPECTED_REGISTER_VALUE, modbusRegisters);
    }

    @Test
    void toModbusRegisters_InvalidLiteral() {

        Map<String, Boolean> invalidMapping = new HashMap<>();
        invalidMapping.put("BIT_128", true);
        BitmapValue bitmapValue = BitmapValue.of(invalidMapping);

        BitmapProduct bitmapDef = createBitmap();
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> bitmapValue.toModbusRegisters(2, bitmapDef));
        assertEquals("Literal BIT_128 is invalid for the given data point.", ex.getMessage());
    }

    @Test
    void getString() {

        BitmapValue testVal = BitmapValue.of(EXPECTED_BITMAP_RECORDS);
        assertEquals(
                "{BIT_0=true, BIT_1=true, BIT_2=false, BIT_3=false, BIT_4=false, BIT_5=true, BIT_6=false, BIT_7=true, BIT_8=true, " +
                "BIT_16=false, BIT_17=true, BIT_18=true}", testVal.getString());
    }

    @Test
    void checkToString() {
        BitmapValue testVal = BitmapValue.of(EXPECTED_REGISTER_VALUE, createBitmap());
        assertEquals(
                "{BIT_0=true : Description of BIT_0; BIT_1=true : Description of BIT_1; BIT_2=false : Description of BIT_2; " +
                        "BIT_3=false : Description of BIT_3; BIT_4=false : Description of BIT_4; BIT_5=true : Description of BIT_5; " +
                        "BIT_6=false : Description of BIT_6; BIT_7=true : Description of BIT_7; BIT_8=true : Description of BIT_8; " +
                        "BIT_16=false : Description of BIT_16; BIT_17=true : Description of BIT_17; BIT_18=true : Description of BIT_18}",
                testVal.toString());
    }

    @Test
    void checkReadAsNumberValue() {

        Value value = BitmapValue.of(EXPECTED_REGISTER_VALUE, createBitmap());

        checkThrowsNumberOutOfRange(value::getInt8);
        checkThrowsNumberOutOfRange(value::getInt8U);
        checkThrowsNumberOutOfRange(value::getInt16);
        checkThrowsNumberOutOfRange(value::getInt16U);

        checkCorrectNumberValue(value::getInt32);
        checkCorrectNumberValue(value::getInt32U);
        checkCorrectNumberValue(value::getInt64);
        checkCorrectNumberValue(value::getInt64U);
    }

    private void checkThrowsNumberOutOfRange(Supplier<Number> getFunction) {
        assertThrows(IllegalArgumentException.class, getFunction::get);
    }

    private void checkCorrectNumberValue(Supplier<Number> getFunction) {
        assertEquals(EXPECTED_VALUE_AS_NUMBER, getFunction.get().intValue());
    }


    private static BitmapProduct createBitmap() {

        BitmapProduct bitmap = V0Factory.eINSTANCE.createBitmapProduct();

        EList<BitmapEntryProduct> bitmapEntries = bitmap.getBitmapEntry();
        bitmapEntries.add(createBitmapEntry("BIT_0", new byte[]{1}));
        bitmapEntries.add(createBitmapEntry("BIT_1", new byte[]{2}));
        bitmapEntries.add(createBitmapEntry("BIT_2", new byte[]{4}));
        bitmapEntries.add(createBitmapEntry("BIT_3", new byte[]{8}));
        bitmapEntries.add(createBitmapEntry("BIT_4", new byte[]{16}));
        bitmapEntries.add(createBitmapEntry("BIT_5", new byte[]{32}));
        bitmapEntries.add(createBitmapEntry("BIT_6", new byte[]{64}));
        bitmapEntries.add(createBitmapEntry("BIT_7", new byte[]{(byte)128}));

        bitmapEntries.add(createBitmapEntry("BIT_8",  new byte[]{0x01, 0x00}));
        bitmapEntries.add(createBitmapEntry("BIT_16", new byte[]{0x01, 0x00, 0x00}));
        bitmapEntries.add(createBitmapEntry("BIT_17", new byte[]{0x02, 0x00, 0x00}));
        bitmapEntries.add(createBitmapEntry("BIT_18", new byte[]{0x04, 0x00, 0x00}));

        return bitmap;
    }

    private static BitmapEntryProduct createBitmapEntry(String name, byte[] hexMask) {
        BitmapEntryProduct entry = V0Factory.eINSTANCE.createBitmapEntryProduct();
        entry.setLiteral(name);
        entry.setHexMask(hexMask);
        entry.setDescription("Description of " + name);
        return entry;
    }
}
