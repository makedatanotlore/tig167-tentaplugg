package addibro;
/**
 * Factory
 */
public class Factory {

    public static Type getFactory(Fac fac) {
        switch (fac) {
            case BITCH:
                return new BitchType();
            case BLYAT:
                return new BlyatType();
            default:
                return null;
        }
    }

    static enum Fac {
        BITCH,
        BLYAT
    }
}