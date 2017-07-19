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
       // User user=new User();
        loginPage.fillGmailAccountInput().hitNextbutton().fillPasswordInput();
        InboxPage inboxPage = loginPage.clickNextButton();
        Assert.assertTrue(inboxPage.isElementClickable(inboxPage.composeButton ));

    }


}
