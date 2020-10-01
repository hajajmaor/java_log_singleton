
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("creating singleton");
        Logger log = MyLogger.getInstance().log;
        log.info("Application Started");
        System.out.println("\n\nnow let's develop somthing great!!!!\n\n");

        /**
         * end of main :
         */
        log.info("Application Ended");
    }
}
