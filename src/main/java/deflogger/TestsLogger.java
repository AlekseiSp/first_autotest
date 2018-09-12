package deflogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestsLogger {

    protected static Logger Log = LogManager.getLogger();

    public static void startTestCase(String  testCase) {
        Log.info("**********************************");
        Log.info(String.format("TEST CASE %s STARTED", testCase));
        Log.info("**********************************");


    }
}
