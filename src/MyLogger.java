import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.*;

/**
 * MyLogger
 */
public class MyLogger {
    final Logger _logger = Logger.getLogger("test app");
    static private MyLogger instance;

    // private constructor to avoid client applications to use constructor
    private MyLogger() {
        try {

            var currentDir = MyLogger.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
            int lastIndex = currentDir.lastIndexOf("/");
            System.out.println("currentDir: " + currentDir);
            currentDir = currentDir.substring(0, lastIndex);
            System.out.println("update currentDir: " + currentDir);
            final String filepath = currentDir + "/logs/MyLogFile.log";

            FileHandler fh;

            File myObj = new File(filepath);
            _logger.setLevel(Level.ALL);

            if (myObj.createNewFile())
                System.out.println("log file created!!");
            // else
            // System.out.println("file already existed");
            fh = new FileHandler(filepath, true);
            _logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static MyLogger getInstance() {
        if (instance == null) {
            instance = new MyLogger();
        }
        return instance;
    }
}
