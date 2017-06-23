import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public class InboxPageTest extends BaseTest {

    //WebDriver driver;
    //protected final String URL = "https://gmail.com";

    @Test
    public void userCanCreateNewEmail(){
       InboxPage inboxPage = new LoginPage(driver).fillGmailAccountInput("epam0333").hitNextbutton().fillPasswordInput("epam1234.").clickNextButton();
       inboxPage.clickComposeButton().fillToField("sona_gamaryan@epam.com").fillSubjectField("MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA").fillBodyField("MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA").clickSaveDraft().clickDraft();
       Assert.assertTrue(inboxPage.isElementClickable(driver, inboxPage.draftEmailSubject));
      //clean draft emails
       inboxPage.openDraftEmail().sendDraftEmail().openSentMail();

    }

    @Test
    public void userCanSendDaft(){
        InboxPage inboxPage = null;
        try {
            inboxPage = new LoginPage(driver)
                    .fillGmailAccountInput("epam0333")
                    .hitNextbutton()
                    .fillPasswordInput("epam1234.")
                    .clickNextButton();
        } catch(Exception e) {
            e.printStackTrace();
        }
        inboxPage.clickComposeButton().fillToField("sona_gamaryan@epam.com").fillSubjectField("MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA").fillBodyField("MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA").clickSaveDraft().clickDraft();
        inboxPage.openDraftEmail().sendDraftEmail().openSentMail();
        Assert.assertTrue(inboxPage.isElementPresent(driver,inboxPage.EMAIL_SUBJECT_LOCATOR ));

    }
}
