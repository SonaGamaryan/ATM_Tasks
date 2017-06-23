import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sona_Gamaryan on 6/22/2017.
 */
public abstract class BaseTest {
    WebDriver driver;
    protected String URL;// = "http://www.gmail.com";
    private void Test(){

    }

    @BeforeMethod(alwaysRun = true)
    public void gmailTestsInit(){
        URL = System.getProperty("URLproperty");
        this.driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterMethod
    public void closeDriver(){
        driver.close();
        driver.quit();
    }
}
