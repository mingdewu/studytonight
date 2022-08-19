
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IntoFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("outfile.txt");
        OutputStream os = new FileOutputStream("abc.txt");
        Files.copy(path, os);
    }
}
