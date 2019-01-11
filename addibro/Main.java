package addibro;

public class Main{
    public static void main(String[] args) {
        Type factory = Factory.getFactory(Factory.Fac.BITCH);

        System.out.println("=== BUILDER ===");
        ClassToBuild ctb = new ClassToBuild.Builder().with(b -> {
            b.field = "Hello";
            b.field2 = 12;
        }).build();

        System.out.println(ctb);
    }
}
