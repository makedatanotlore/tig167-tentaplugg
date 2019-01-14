package addibro;

/**
 * ObjectLoading
 */
public class ObjectLoader extends Loader {

    private String name;
    private int n;
    private Object obj;

    static {
        System.out.println("static block in ObjectLoader");
    }

    public ObjectLoader(String name, int n, Object obj) {
        super(name, n);
        System.out.println("back from super() in ObjectLoader constructor");
        this.obj = obj;
    }
}

/**
 * Loader
 */
class Loader {
    private String name;
    private int n;

    static {
        System.out.println("static block in Loader");
    }

    public Loader(String name, int n) {
        System.out.println("Loader constructor");
        this.name = name;
        this.n = n;
    }
}