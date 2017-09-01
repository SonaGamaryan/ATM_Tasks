package listeners;

import Logging.Logging;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.Screenshoter;

import java.net.MalformedURLException;

import static Logging.Logging.errorLogger;

public class TestNGListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // result.()
        Logging.infoLogger();
    }

    @Override
    public void onTestFailure(ITestResult result) {

        try {
            Screenshoter.takeScreenshot();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        errorLogger();

        System.out.println("error***");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("1111111111111111111111111111111111");
        try {
            //Screenshoter.takeScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        errorLogger();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        Logging.infoLogger();
    }
}

