import java.nio.file.Path;

public class RedusePath {
    public static Path reduce_file_path(Path path) {
        return path.normalize();
    }
}
