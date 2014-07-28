import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public abstract class SequencePlayer extends FilePlayer {

    public SequencePlayer(File fileName) {
        super(fileName);
    }

    public List<BufferedImage> getSequence() {
        return null;
    }

}
