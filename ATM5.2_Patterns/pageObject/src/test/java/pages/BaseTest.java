package pages;
import driver.WebDriverSingleton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Sona_Gamaryan on 6/22/2017.
 */
public abstract class BaseTest {
    //WebDriver driver;
    protected String URL = "http://www.gmail.com";
    protected LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void gmailTestsInit(){
       // URL = System.getProperty("URLproperty");
            loginPage = new LoginPage(URL);
    }

    @AfterMethod
    public void closeDriver(){
        WebDriverSingleton.kill();

    }
}