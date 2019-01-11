import makedatanotlore.*;

public class Makedatanotlore{
    public static void main(String[] args) {
        System.out.println("--- Testing Singleton ---");
        assert Singleton.instance() != null : "- ERROR: singleton cannot be null!";
        System.out.println("--- Singleton: OK ---");
        System.out.println("---------");


        System.out.println("--- Testing Builder ---");
        Builder.BuilderBuilder bb = new Builder.BuilderBuilder()
            .name("glenn")
            .city("göteborg")
            .street("gatvägen 1");

        Builder glenn = bb.build();
        assert glenn.name().equals("glenn") : "- ERROR: glenn is not glenn!";

        bb.name("sven");
        Builder sven = bb.build();
        assert sven.name().equals("sven") : "- ERROR: sven is not sven!";

        System.out.println("--- Builder: OK ---");
        System.out.println("---------");
    }
}
