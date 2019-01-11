package makedatanotlore;

import java.lang.Enum;

public class Enums {
    public static enum Base {
        BINARY,
        OCTAL,
        DECIMAL,
        HEX;
    }
    
    public static void printNumber(int number, Base base){
        switch(base){
            case BINARY:
                System.out.println(Integer.toBinaryString(number));
                break;
            case OCTAL:
                System.out.println(Integer.toOctalString(number));
                break;
            case DECIMAL:
                System.out.println(number);
                break;
            case HEX:
                System.out.println(Integer.toHexString(number));
                break;
            default:
                break;
        }
    }
}
