
import java.io.File;
import java.text.SimpleDateFormat;

public class fileRead implements Runnable {
    @Override
    synchronized public void run() {
        while (true) {
            File file = new File("c:\\Users\\Cagdas\\Desktop\\ss\\ss.png");
            System.out.println(file);
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
            String date = sdf.format(file.lastModified());
            System.out.println(date);
            String[] dates = date.split( " ");
            for (String temp : dates) {
                System.out.println(temp);
            }
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
