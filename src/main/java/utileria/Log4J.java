package utileria;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J {

    private static final Logger logger = LogManager.getLogger(Log4J.class.getName());


    private Log4J() {
    }

    public static void startTestCase(String sTestCaseName) {
        logger.info("****************************************************************************************");
        logger.info("$$$$$$$$$$$$$$$$$$$$$$$$$$$$      " + sTestCaseName + "      $$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        logger.info("****************************************************************************************");
    }

    public static void endTestCase() {
        logger.info("XXXXXXXXXXXXXXXXXXXXXXX           " + "-E---N---D-" + "           XXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }
}
