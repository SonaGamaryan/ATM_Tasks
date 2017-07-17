package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public class LoginPageTest extends BaseTest {

   // WebDriver driver;
   // protected String URL;// = System.getProperty("URLproperty");



    @Test
    public void loginTest() throws MalformedURLException{
        //LoginPage loginPage = new LoginPage();
        loginPage.fillGmailAccountInput("epam0333").hitNextbutton().fillPasswordInput("epam1234.");
        InboxPage inboxPage = loginPage.clickNextButton();
        Assert.assertTrue(inboxPage.isElementClickable(inboxPage.composeButton ));

    }


}
