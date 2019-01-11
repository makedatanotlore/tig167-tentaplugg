package addibro;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class Main{
    public static void main(String[] args) throws IOException {
        Type factory = Factory.getFactory(Factory.Fac.BITCH);

        System.out.println("=== BUILDER ===");
        ClassToBuild ctb = new ClassToBuild.Builder().with(b -> {
            b.field = "Hello";
            b.field2 = 12;
        }).build();

        System.out.println(ctb);

        System.out.println("=== PATH ===");


        // current directory of where you compile and run this file
        Path currentRelativeDir = Paths.get("addibro");

        // chained dirs
        Path foobartest = Paths.get("addibro/foo/bar/test");
        
        // one dir
        Path test = Paths.get("addibro/test");
        
        // file
        Path testtxt = Paths.get("addibro/file1.txt");

        // this file
        Path main = Paths.get("addibro/Main.java");
        
        if (!test.toFile().exists() && !testtxt.toFile().exists()) { 
            Path file = Files.createFile(testtxt); // will throw exception if dir already exists
            Path dir = Files.createDirectory(test); // will throw exception if dir already exists
        }
        
        Path dirs = Files.createDirectories(foobartest); // will not throw exception if dirs already exist

        // output all files/dirs in currentRelativeDir
        // try (DirectoryStream<Path> files = Files.newDirectoryStream(currentRelativeDir, "*.sh")) {
            // files.forEach(System.out::println);
        // } catch (IOException ex) {
            // System.out.println(ex);
        // }

        // Files.newDirectoryStream(currentRelativeDir, "*.sh").forEach(System.out::println);
        ListFiles.listFiles(currentRelativeDir, "sh");


        // output the content of this file
        String content = new String(Files.readAllBytes(main), StandardCharsets.UTF_8);
        // System.out.println(content);

        // output the content of this file line by line
        // for (String line : Files.readAllLines(path)) {
            // System.out.println(line);
        // }

        Path file1 = Paths.get("addibro/file1.txt");
        // write something to the file
        List<String> lines = new ArrayList<>();
        lines.add("new line");
        lines.add("another line");
        Files.write(file1, lines, StandardCharsets.UTF_8, StandardOpenOption.APPEND); // append to end of file1

        Files.delete(Paths.get("addibro/file2.txt"));

        // copy source: file1 to target: file2
        Files.copy(file1, Paths.get("addibro/file2.txt"));

        Timez.dagarTillJulafton();
    }
}
