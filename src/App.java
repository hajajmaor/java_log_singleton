
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("creating singleton");
        MyLogger log = MyLogger.getInstance();
        log._logger.info(App.class.getName() + " logger created.");
    }
}
