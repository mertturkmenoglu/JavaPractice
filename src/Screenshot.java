import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screenshot implements Runnable {
    @Override
    public void run() {
        BufferedImage image = null;

        try {
            image = (new Robot()).createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (AWTException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                if (image != null) {
                    ImageIO.write(image, "png", new File("/c:\\Users\\Cagdas\\Desktop\\ss\\ss.png"));
                }
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
