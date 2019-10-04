import java.io.File;
import java.text.SimpleDateFormat;

public class FileRead implements Runnable {
    @Override
    public void run() {
        while (true) {
            File file = new File("c:\\Users\\Cagdas\\Desktop\\ss\\ss.png");
            System.out.println(file);

            SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
            String date = formatter.format(file.lastModified());
            System.out.println(date);

            String[] dates = date.split("\\s+");

            for (String temp : dates) {
                System.out.println(temp);
            }

            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
