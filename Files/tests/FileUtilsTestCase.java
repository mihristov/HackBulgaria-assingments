import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FileUtilsTestCase {

    private static final Path filePath = Paths.get("/home/mihristov/workspace/Files/src/text1");
    private final String contents = "aaaaaabbcdf";
    @Before
    public void setUp() throws Exception {
        filePath.toFile().createNewFile();
        Files.write(filePath, this.contents.getBytes(StandardCharsets.UTF_8), StandardOpenOption.WRITE);
    }

    @Test
    public void standartTest() throws IOException {
        final File file = new File("/home/mihristov/workspace/Files/src/text");
        FileUtils.writeTo(file, "aaaaaabbcdf");
        assertEquals(FileUtils.readFrom(filePath), FileUtils.readFrom(file));;
    }

    @After
    public void tearDown() throws Exception {
        Files.deleteIfExists(filePath);
    }

}
