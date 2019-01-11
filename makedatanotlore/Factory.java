/**
 * Factory
 */
public class Factory {

    public static Factory getFactory(Fac fac) {
        switch (fac) {
            case BITCH:
                return new BitchFactory();
            case BLYAT:
                return new BlyatFactory();
            default:
                return null;
        }
    }

    static enum Fac {
        BITCH,
        BLYAT
    }
}