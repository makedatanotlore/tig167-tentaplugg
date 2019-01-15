package addibro;

/**
 * NumberUtil
 */
public class NumberUtils {
    public static String printNumber(int i, Base base) {
        switch (base) {
            case BINARY:
                return Integer.toBinaryString(i);
            case OCTAL:
                return Integer.toOctalString(i);
            case DECIMAL:
                return i + "";
            case HEX:
                return Integer.toHexString(i);
            default:
                System.err.println("No such base");
                return null;
        }
    }
}