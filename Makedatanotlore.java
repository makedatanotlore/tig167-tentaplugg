import makedatanotlore.*;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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
        System.out.println("--- Testing IO ---");
        System.out.println("--- listing files ending with specified string ---");
        try{
            IO.listFiles(".sh");
        } catch(IOException ioe){
            System.out.println("ERROR: IOException when listing files");
        }
        System.out.println("--- IO: OK ---");
        System.out.println("---------");

        System.out.println("--- Testing Time ---");
        System.out.println(Time.daysUntilChristmas());
        System.out.println("--- Time: OK ---");
        System.out.println("---------");


        System.out.println("--- Testing Lambda ---");
        System.out.println("--- list of unsorted items ---");
        List<String> list = new ArrayList<>();
        list.add("mammy bammy");
        list.add("mammy");
        list.add("wammy");
        list.add("saaaaa");
        list.forEach(System.out::println);

        Collections.sort(list, StreamsAndLambdas.stringLengthComparator());
        System.out.println("--- list of sorted items ---");
        list.forEach(System.out::println);
        System.out.println("--- Lambdas: OK ---");
        System.out.println("---------");


    }
}
