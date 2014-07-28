import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.jcodec.api.JCodecException;

public class Main {
    public static void main(String[] args) throws IOException, JCodecException, InterruptedException {
        // final VideoPlayer vp = new VideoPlayer(new
        // File("Resources/pussinboot_gdbm61Pa.mp4"));
        // vp.play();
        final Scanner sc = new Scanner(new File("Resources/asd"));
        System.out.println(sc.nextInt());
    }

}
