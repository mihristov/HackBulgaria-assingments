import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PicturePlayer extends FilePlayer {

    private static BufferedImage img = null;

    static int getAvgIntensityForBlock(int x, int y, int blockLength) {
        int allIntensity = 0;
        final int countPixels = blockLength * blockLength;
        for (int i = x; i < x + blockLength; i++) {
            for (int j = y; j < y + blockLength; j++) {
                if (i < img.getWidth() && j < img.getHeight()) {
                    allIntensity += getIntensity(i, j);
                }
            }
        }
        return allIntensity / countPixels;
    }

    static int getIntensity(int x, int y) {
        final int clr = img.getRGB(x, y);
        final Color color = new Color(clr, false);
        final int intensity = (color.getRed() + color.getBlue() + color.getGreen()) / 3;
        return intensity;
    }

    public PicturePlayer(File fileName) {
        super(fileName);
        try {
            img = ImageIO.read(fileName);
        } catch (final IOException e) {
        }
    }

    @Override
    public void play() throws IOException {
        this.printScaledImage();
    }

    public void printScaledImage() throws IOException {
        final int consoleColumns = 165;

        final int blockSize = (img.getHeight() / consoleColumns) + 1;

        for (int y = 0; y < img.getHeight(); y += blockSize) {
            for (int x = 0; x < img.getWidth(); x += blockSize) {
                final int intensity = getAvgIntensityForBlock(x, y, blockSize);
                if (intensity > 240) {
                    System.out.print(" ");
                }
                if (intensity > 200 && intensity < 240) {
                    System.out.print(".");
                }
                if (intensity > 160 && intensity < 200) {
                    System.out.print("*");
                }
                if (intensity > 120 && intensity < 160) {
                    System.out.print("+");
                }
                if (intensity > 80 && intensity < 120) {
                    System.out.print("x");
                }
                if (intensity > 40 && intensity < 80) {
                    System.out.print("%");
                }
                if (intensity > 0 && intensity < 40) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
