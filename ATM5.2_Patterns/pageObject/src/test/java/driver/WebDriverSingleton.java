package driver;

import decorator.CustomDriverDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sona_Gamaryan on 6/27/2017.
 */
public class WebDriverSingleton {
    private static WebDriver instance;

    private WebDriverSingleton(){
    }

    public static WebDriver getWebDriverInstance(){
        if (instance != null){
            return instance;
        }

       // return instance = init("chrome");
        return instance = init();
    }


    private static WebDriver init(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      //  driver = new ChromeDriver(capabilities);
        driver = new CustomDriverDecorator(driver);
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
