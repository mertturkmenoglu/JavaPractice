
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screenshot implements Runnable {
    @Override
    synchronized public void run() {
        BufferedImage image = null;
        try {
            image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (AWTException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                ImageIO.write(image, "png", new File("/c:\\Users\\Cagdas\\Desktop\\ss\\ss.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
