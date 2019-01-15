package addibro;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class Main{
    public static void main(String[] args) throws IOException {

        System.out.println("=== Factory ===");
        Type type = Factory.getFactory(Factory.Fac.BITCH); // simple factory
        TypeFactory btf = new BitchTypeFactory(); // factory method
        TypeFactory blyattf = new BlyatTypeFactory();
        Type bitch = btf.createType();
        Type blyat = blyattf.createType();

        System.out.println("\n=== BUILDER ===");
        ClassToBuild ctb = new ClassToBuild.Builder().with(b -> {
            b.field = "Hello";
            b.field2 = 12;
        }).build();

        System.out.println(ctb);

        System.out.println("\n=== PATH ===");


        
        List<String> stringPaths = new ArrayList<>();
        // current directory of where you compile and run this file
        Path currentRelativeDir = Paths.get("addibro");
        stringPaths.add(currentRelativeDir.toString());
        
        // chained dirs
        Path foobartest = Paths.get("addibro/foo/bar/test");
        stringPaths.add("foobartest");
        
        // one dir
        Path test = Paths.get("addibro/test");
        stringPaths.add("test");
        
        Path siblingToTest = test.resolveSibling("test-sibling");
        stringPaths.add("siblingToTest");
        
        // file
        Path file1 = Paths.get("addibro/file1.txt");
        stringPaths.add("file1");
        
        // this file
        Path main = Paths.get("addibro/Main.java");
        stringPaths.add("main");
        
        
        Map<String, Path> paths = stringPaths.stream()
            .collect(Collectors.toMap(p -> p, p -> Paths.get(p)));

        Path dirs = Files.createDirectories(foobartest); // will not throw exception if dirs already exist

        paths.values().stream()
        .filter(p -> !p.toFile().exists()) // will throw exception if dir already exists
        .forEach(p -> {
            try {
                if (p.toFile().isDirectory()) 
                Files.createDirectory(p); 
                else
                Files.createFile(p);
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        });        
        
        Files.list(currentRelativeDir).forEach(System.out::println);
        BufferedReader br =  Files.newBufferedReader(main);
        Stream<String> mainLines = br.lines();


        // output all files/dirs in currentRelativeDir
        // try (DirectoryStream<Path> files = Files.newDirectoryStream(currentRelativeDir, "*.sh")) {
            // files.forEach(System.out::println);
        // } catch (IOException ex) {
            // System.out.println(ex);
        // }

        // Files.newDirectoryStream(currentRelativeDir, "*.sh").forEach(System.out::println);
        // ListFiles.listFiles(currentRelativeDir, "sh");
        
        // TryWithResources.printFiles(Paths.get("addibro"));

        // output the content of this file
        String content = new String(Files.readAllBytes(main), StandardCharsets.UTF_8);
        // System.out.println(content);

        // write something to the file
        List<String> lines = new ArrayList<>();
        lines.add("new line");
        lines.add("another line");
        Files.write(file1, lines, StandardCharsets.UTF_8, StandardOpenOption.APPEND); // append to end of file1

        Files.delete(Paths.get("addibro/file2.txt"));

        // copy source: file1 to target: file2
        Files.copy(file1, Paths.get("addibro/file2.txt"));


        System.out.println("\n=== LocalDate ===");
        Timez.dagarTillJulafton();
        
        DaysToDate.calculate(Month.MAY, 18);


        System.out.println("\n=== Collection ===");
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");

        Collection<String> linkedList = new LinkedList<>();
        ((LinkedList) linkedList).addFirst("first");
        ((LinkedList) linkedList).addFirst("second");
        ((LinkedList) linkedList).addFirst("third");

        Collection<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("what's");
        hashSet.add("up");

        Collection<String> treeSet = new TreeSet<>();
        treeSet.add("hello");
        treeSet.add("world");
        treeSet.add("hello");
        treeSet.add("world");
        treeSet.add("what's");
        treeSet.add("up");

        // arraylist simply adds elements to the beginning of the list
        new Collectionz().printCollection(arrayList);
        // with a linkedlist you can add elements to the end and beginning of the list
        new Collectionz().printCollection(linkedList);
        // a hashset will not sort the unique elements 
        new Collectionz().printCollection(hashSet);
        // treeSet will sort on natural order
        new Collectionz().printCollection(treeSet);

        Map<Integer, String> leaderBoard = new HashMap<>();
        IntStream.range(1, 5)
            .forEach(i -> leaderBoard.put(i, "string-" + NumberUtils.printNumber(i, Base.BINARY)));;
        System.out.println(leaderBoard);


        System.out.println("\n=== Enum and binary ===");

        String base = NumberUtils.printNumber(15, Base.BINARY);
        System.out.println(base);
        // 15 in decimal is 1111 in binary
        // octal takes three bits 

        System.out.println("\n=== Class loading ===");
        ObjectLoader obl = new ObjectLoader("name", 1, new int[]{});


        System.out.println("\n=== Streams ===");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("David", 14, "lillkuken@gmail.com"));
        persons.add(new Person("Mats", 68));
        persons.add(new Person("Maggan", 4));
        persons.add(new Person("Ludvig", 24));
        persons.add(new Person("Andre", 24));
        persons.add(new Person("Mormor", 88));
        persons.add(new Person("Anna", 58));
        persons.add(new Person("Jesper", 38));
        persons.add(new Person("Håkan", 17));

        IntStream.range(1, 5)
            .forEach(i -> persons.add(new Person("Person-" + i, i)));;

        persons.forEach(p -> IntStream.range(1, 5)
            .forEach(i -> p.addThing(new Thing("thing-" + i))));

        // persons.stream()
            // .flatMap(p -> p.getThings().stream())
            // .forEach(System.out::println);


        // IntStream.range(1, 5)
        //     .mapToObj(i -> new Person("Person-", i))
        //     .peek(p -> IntStream.range(1, 5)
        //         .mapToObj(i -> new Thing("thing-" + i))
        //         .forEach(t -> p.addThing(t)))
        //     .flatMap(p -> p.getThings().stream())
        //     .forEach(t -> System.out.println("Thing: " + t));

        double averageAge = Streamz.averageAge(persons);
        averageAge = Streamz.averageAge2(persons);

        System.out.println("Average age: " + averageAge);

        // Streamz.printPersonAge(persons);

        Map<Integer, List<Person>> personByAge = Streamz.groupByAge(persons);
        System.out.println(personByAge);
        
        System.out.println(Streamz.legalAgePhrase(persons));
    }
}