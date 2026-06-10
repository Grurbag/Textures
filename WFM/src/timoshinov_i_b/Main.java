package timoshinov_i_b;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            BufferedImage img1 = ImageIO.read(new File("C:\\users\\timos\\4.png"));
            BufferedImage img2 = ImageIO.read(new File("C:\\users\\timos\\4.png"));

            BufferedImage image = new BufferedImage(1024, 512, BufferedImage.TYPE_INT_ARGB);
            image.getGraphics().drawImage(img1, 0, 0, null);    //2 и 3 параметр - координаты помещаемого изображения
            image.getGraphics().drawImage(img2, 512, 0, null); //(верхний левый угол изображения будет иметь эти

            Graphics g = image.getGraphics();
            g.setFont(g.getFont().deriveFont(30f));
            g.drawString("ПИСКА!", 512, 256);
            g.dispose();

            ImageIO.write(image, "png", new File("C:\\users\\timos\\test.png"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}