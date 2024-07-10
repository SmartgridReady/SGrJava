package utils;

public class StringUtil {
    
    private StringUtil() {}

    public static boolean isNotEmpty(String str) {
        return (str != null) && !str.isEmpty();
    }
}
