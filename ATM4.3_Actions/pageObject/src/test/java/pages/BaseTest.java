package pages;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.WebDriverSingleton;

import java.net.MalformedURLException;

/**
 * Created by Sona_Gamaryan on 6/22/2017.
 */
public abstract class BaseTest {
    //WebDriver driver;
    protected String URL;//= "http://www.gmail.com";
    protected LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void gmailTestsInit(){
        URL = System.getProperty("URLproperty");
        try{
            loginPage = new LoginPage(URL);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void closeDriver(){
        WebDriverSingleton.kill();

    }
}