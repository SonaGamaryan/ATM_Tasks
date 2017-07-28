package factoryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

/**
 * Created by Sona_Gamaryan on 7/20/2017.
 */
public class ChromeDriverCreator extends WebDriverCreator {

    public WebDriver FactoryMethod() {
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(
                new File("./utilities/chromedriver.exe")).build();
        try{
            service.start();
        } catch (IOException e){
            e.printStackTrace();
        }

        driver = new ChromeDriver(service);
        return driver;
    }
}
