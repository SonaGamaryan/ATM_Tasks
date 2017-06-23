import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/21/2017.
 */
public class LogoutPageTest extends BaseTest{

    @Test
    public void logoutTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillGmailAccountInput("epam0333").hitNextbutton().fillPasswordInput("epam1234.");
        InboxPage inboxPage = loginPage.clickNextButton();
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.clickSignoutButton1().clickSignoutButton2();
        Assert.assertTrue(inboxPage.isElementClickable(driver,logoutPage.forgotPasswordLink ));

    }

}
