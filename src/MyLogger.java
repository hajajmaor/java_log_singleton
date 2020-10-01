
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Paths;
import java.util.logging.*;

/**
 * {@link MyLogger}
 * <p>
 * using the Singleton pattern to ensure only one log will be used in the
 * application. this way, developers can use the single logger to address all
 * the needs in their app.
 */
public class MyLogger {
    static private MyLogger instance;
    final Logger log = Logger.getLogger("app_main_log");

    // private constructor to avoid client applications to use constructor
    private MyLogger() {
        try {
            final var dir = "logs";
            final var fileName = "log_file.log";
            final String filepath = String.format("%s/%s", dir, fileName);

            try {
                // create new dir
                Path path = Paths.get(dir + "/");
                Files.createDirectory(path);

            } catch (FileAlreadyExistsException e) {

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                // create new dir
                Path path = Paths.get(filepath);
                Files.createFile(path);

            } catch (FileAlreadyExistsException e) {
                // if the file exists, great
            } catch (Exception e) {
                e.printStackTrace();
            }

            // log file full path

            // sysout the file full path
            // System.out.println("file path: " + filepath);

            FileHandler fh;
            /**
             * logger listen to all messages
             */
            log.setLevel(Level.ALL);

            // file handler will handle the log, true is for appending the log messages
            fh = new FileHandler(filepath, true);
            log.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
