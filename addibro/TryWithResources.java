package addibro;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.*;

/**
 * TryWithResources
 */
public class TryWithResources {
    public static void printFiles(Path path) {
        try (DirectoryStream<Path> directory = Files.newDirectoryStream(path)) {
            directory.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    
}