package utils;

import driver.WebDriverSingleton;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Sona_Gamaryan on 6/27/2017.
 */
public class Screenshoter {
    private static final String SCREENSHOT_NAME_TPL = "scr/screenshots";

    public static void takeScreenshot () {
        WebDriver driver = WebDriverSingleton.getWebDriverInstance();
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            String screenshotName = SCREENSHOT_NAME_TPL + System.nanoTime();
            File copy = new File (screenshotName + ".png");
            FileUtils.copyFile(screenshot, copy);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
