import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    public static void main(String[] args) throws IOException {
        final File file = new File("/home/mihristov/workspace/Files/src/text");
        FileUtils.writeTo(file.toPath(), "mmm");
    }

    public static String readFrom(File file) throws IOException {
        final String text = new String(Files.readAllBytes(Paths.get(file.toString())), Charset.defaultCharset());
        return text;
    }


    public static String readFrom(Path path) throws IOException {
        return FileUtils.readFrom(path.toFile());
    }

    public static void writeTo(File file, String str) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        final FileWriter fw = new FileWriter(file.getAbsoluteFile());
        final BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        bw.close();
    }

    public static void writeTo(Path path, String str) throws IOException {
        writeTo(path.toFile(), str);
    }

    private FileUtils() {
    }
}
