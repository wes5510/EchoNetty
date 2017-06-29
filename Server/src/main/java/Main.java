import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by WES on 2017-06-28.
 */
public class Main {
   private static final Logger logger = LogManager.getLogger(Main.class);
   public static void main(String args[])
   {
      logger.info("Start Server");
      new Server().start();
   }
}
