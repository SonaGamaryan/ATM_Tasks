package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public class LoginPageTest extends BaseTest {


    @Test
    public void loginTest(){
        loginPage.fillGmailAccountInput().hitNextbutton().fillPasswordInput();
        InboxPage inboxPage = loginPage.clickNextButton();
        Assert.assertTrue(inboxPage.isElementClickable(inboxPage.composeButton ));

    }


}
