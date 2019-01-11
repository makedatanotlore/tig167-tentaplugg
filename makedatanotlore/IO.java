package makedatanotlore;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class IO{
    public static void listFiles(String fileEnding) throws IOException {
        Files.newDirectoryStream(Paths.get("./makedatanotlore"),
            (path -> path.toString().endsWith(fileEnding))).
            forEach(System.out::println);
    }
}
