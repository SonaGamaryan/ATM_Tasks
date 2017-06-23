import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public class LoginPageTest extends BaseTest{

   // WebDriver driver;
   // protected String URL;// = System.getProperty("URLproperty");



    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillGmailAccountInput("epam0333").hitNextbutton().fillPasswordInput("epam1234.");
        InboxPage inboxPage = loginPage.clickNextButton();
        Assert.assertTrue(inboxPage.isElementClickable(driver,inboxPage.composeButton ));

    }


}
