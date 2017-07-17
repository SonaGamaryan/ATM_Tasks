package utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sona_Gamaryan on 6/27/2017.
 */
public class WebDriverSingleton {
    private static WebDriver instance;

    private WebDriverSingleton(){
    }

    public static WebDriver getWebDriverInstance() throws MalformedURLException{
        if (instance != null){
            return instance;
        }

        return instance = init("chrome");
    }

    private static WebDriver init(String browser) throws MalformedURLException {
        WebDriver driver = null;
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-extensions");
            DesiredCapabilities caps = new DesiredCapabilities().chrome();
            caps.setCapability(ChromeOptions.CAPABILITY, options);
            driver =
                    new RemoteWebDriver(new URL("http://127.0.0.1:9876/wd/hub"), caps);

        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.firefox.marionette", "${project.basedir}\\webdrivers\\geckodriver.exe");
            DesiredCapabilities capsFF = DesiredCapabilities.firefox();



            capsFF.setBrowserName("firefox");
            capsFF.setPlatform(Platform.WIN10);
            capsFF.setCapability("platformName", "Windows");
            driver =
                    new RemoteWebDriver(new URL("http://127.0.0.1:9876/wd/hub"), capsFF);
        }

        if(driver != null) {
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void kill(){
        if(instance != null)
            try{
                instance.quit();
            }catch(Exception e){
                System.out.println(e);
            } finally {
                instance = null;
            }
    }

}
