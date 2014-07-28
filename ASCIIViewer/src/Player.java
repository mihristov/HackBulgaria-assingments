import java.io.IOException;

import org.jcodec.api.JCodecException;

public interface Player {
    public void play() throws IOException, JCodecException, InterruptedException;
}
