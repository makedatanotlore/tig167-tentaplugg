public class Main{
    public static void main(String[] args) {
        System.out.println("--- Testing Singleton ---");
        assert Singleton.instance() != null : "- ERROR: singleton cannot be null!";

        System.out.println("--- Testing Builder ---");
        BuilderBuilder bb = new Builder.BuilderBuilder()
            .name("glenn")
            .city("göteborg")
            .street("gatvägen 1");

        Builder glenn = bb.get();
        assert glenn.name().equals("glenn") : "- ERROR: glenn is not glenn!";

        bb.name("sven");
        Builder sven = bb.get();
        assert sven.name().equals("sven") : "- ERROR: sven is not sven!";
    }
}
