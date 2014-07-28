import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.FileChannelWrapper;

public class VideoPlayer extends SequencePlayer {
    private static BufferedImage img = null;

    public VideoPlayer(File fileName) {
        super(fileName);
    }

    @Override
    public void play() throws IOException, JCodecException, InterruptedException {
        final FileInputStream fileInputStream = new FileInputStream(this.fileName);
        final FileChannelWrapper wrapper = new FileChannelWrapper(fileInputStream.getChannel());
        final FrameGrab frameGrab = new FrameGrab(wrapper);
        final int delay = 100;
        while ((img = frameGrab.getFrame()) != null) {
            final File newImg = new File("Resources/temp.jpg");
            ImageIO.write(img, "jpg", newImg);
            final PicturePlayer pic = new PicturePlayer(newImg);
            pic.play();
            Files.delete(Paths.get("Resources/temp.jpg"));
            Thread.sleep(delay);
        }
        fileInputStream.close();
    }

}
