package addibro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ListFiles
 */
public class ListFiles {

    public static void listFiles(Path path, String fileType) throws IOException {
        Files.newDirectoryStream(path, "*." + fileType).forEach(System.out::println);
    }

    public static void listFiles(Path path) throws IOException {
        Files.newDirectoryStream(path).forEach(System.out::println);
    }
}