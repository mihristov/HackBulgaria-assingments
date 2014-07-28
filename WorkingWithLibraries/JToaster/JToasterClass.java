import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.nitido.utils.toaster.Toaster;

public class JToasterClass {
    public static void main(String[] args) throws InterruptedException {
        final Toaster jt = new Toaster();
        while (true) {
            jt.setToasterHeight(600);
            jt.setToasterWidth(800);
            jt.setMessageColor(Color.WHITE);

            Image img = null;
            try {
                img = ImageIO.read(new File("Resources/fox.jpg"));
            } catch (final IOException e) {
            }

            jt.setBackgroundImage(img);
            jt.setStep(10);
            jt.showToaster("Get up and go away!");
            Thread.sleep(2700000);
        }
    }
}
