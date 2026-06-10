package timoshinov_i_b;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
public class Main {

    public static final String IMG = "test.png";

    public static void main(String[] args) throws IOException {

    BufferedImage img;
        img = ImageIO.read(new File(IMG));
        int[][] zabor = new int[img.getHeight()][img.getWidth()];

        int[] rgb;

        int counter = 0;
        for(int i = 0; i < img.getHeight(); i++){
            for(int j = 0; j < img.getWidth(); j++) {
                rgb = getPixelData(img, i, j);
                if (rgb[0] == 255 && rgb[1] == 0 && rgb[2] == 0) {
                    zabor[i][j] = 1;
                }
            }
        }

        for (int[] ints : zabor) {
            System.out.println();
            for (int j = 0; j < zabor.length; j++) {
                System.out.print(ints[j] + " ");
            }
        }
    }

    private static int[] getPixelData(BufferedImage img, int x, int y) {
        int argb = img.getRGB(x, y);

        int rgb[] = new int[] {
                (argb >> 16) & 0xff, //red
                (argb >>  8) & 0xff, //green
                (argb      ) & 0xff  //blue
        };

        System.out.println("rgb: " + rgb[0] + " " + rgb[1] + " " + rgb[2]);
        return rgb;
    }
}