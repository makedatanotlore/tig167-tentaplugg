package addibro;

/**
 * NumberUtil
 */
public class NumberUtils {
    public static void printNumber(int i, Base base) {
        switch (base) {
            case BINARY:
                System.out.println(Integer.toBinaryString(i));
                break;
            case OCTAL:
                System.out.println(Integer.toOctalString(i));
                break;
            case DECIMAL:
                System.out.println(i);
                break;
            case HEX:
                System.out.println(Integer.toHexString(i));
                break;
            default:
                System.err.println("No such base");
        }
    }
}