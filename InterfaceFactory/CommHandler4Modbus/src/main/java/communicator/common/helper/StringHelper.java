package communicator.common.helper;

public class StringHelper {
    
    // hide constructor
    private StringHelper() {}

    public static boolean isNotEmpty(String str) {
        return (str != null) && !str.isEmpty();
    }
}
