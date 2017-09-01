package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Screenshoter;

import java.net.MalformedURLException;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public class InboxPageTest extends BaseTest {

    @Test
    public void userCanCreateNewEmail() throws MalformedURLException{
       InboxPage inboxPage = loginPage.fillGmailAccountInput("epam0333").hitNextbutton().fillPasswordInput("epam1234.").clickNextButton();
        String subjectName = "TEST" + System.nanoTime();
       inboxPage.clickComposeButton().fillToField("sona_gamaryan@epam.com").fillSubjectField(subjectName).fillBodyField(subjectName).clickSaveDraft().clickDraft();
       Assert.assertTrue(inboxPage.isElementClickable(inboxPage.draftEmailSubject));
      //clean draft emails
       inboxPage.openDraftEmail(subjectName).sendDraftEmail().openSentMail();

    }

    @Test
    public void userCanSendDaft(){
        InboxPage inboxPage = null;
        try {
            inboxPage = loginPage
                    .fillGmailAccountInput("epam0333")
                    .hitNextbutton()
                    .fillPasswordInput("epam1234.")
                    .clickNextButton();
        } catch(Exception e) {
            e.printStackTrace();
        }
        String subjectName = "TEST" + System.nanoTime();
        inboxPage.clickComposeButton().fillToField("sona_gamaryan@epam.com").fillSubjectField(subjectName).fillBodyField("MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA").clickSaveDraft().clickDraft();
        inboxPage.openDraftEmail(subjectName).sendDraftEmail().openSentMail();
        String emailSubjectLocator = "//div/span[contains(text()," + subjectName + ")]";
        By EMAIL_SUBJECT_LOCATOR2 = By.xpath(emailSubjectLocator);//("//div/span[contains(text(),subjectName)]");
        Assert.assertTrue(inboxPage.isElementPresent(EMAIL_SUBJECT_LOCATOR2 ));

    }

    @Test
    public void dragNdrop() throws MalformedURLException {
        InboxPage inboxPage = null;

            inboxPage = loginPage
                    .fillGmailAccountInput("epam0333")
                    .hitNextbutton()
                    .fillPasswordInput("epam1234.")
                    .clickNextButton();

        String subjectName = "TEST" + System.nanoTime();
        inboxPage.clickComposeButton().fillToField("sona_gamaryan@epam.com").fillSubjectField(subjectName).fillBodyField("MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA").clickSaveDraft().clickDraft();
        inboxPage.openDraftEmail(subjectName);
        Screenshoter.takeScreenshot();
        inboxPage.dragNdrop();
        Screenshoter.takeScreenshot();

    }

    @Test
    public void clickAndHold() throws MalformedURLException{
        InboxPage inboxPage = null;
        inboxPage = loginPage
                .fillGmailAccountInput("epam0333")
                .hitNextbutton()
                .fillPasswordInput("epam1234.")
                .clickNextButton();

        String subjectName = "TEST" + System.nanoTime();
        inboxPage.clickComposeButton().fillToField("sona_gamaryan@epam.com").fillSubjectField(subjectName).fillBodyField("MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA").clickSaveDraft().clickDraft();
        inboxPage.highightDraftEmailSubject(subjectName);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
        Screenshoter.takeScreenshot();
        } catch (MalformedURLException e){
            e.printStackTrace();
        }

        inboxPage.clickAndHold();
        try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
