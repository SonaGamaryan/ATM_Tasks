package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public class InboxPage extends Page{

    protected static final By EMAIL_SUBJECT_LOCATOR = By.xpath("//div/span[contains(text(),'MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA')]");
    protected static final By DISCARD_EMAIL_LOCATOR = By.xpath("//div[contains(text(), 'Discard drafts')]");


    @FindBy(xpath = "//div[@role='button'][contains(text(), 'COMPOSE')]")
    protected WebElement composeButton;
    @FindBy(xpath = "//div/textarea[@aria-label='To']" )
    protected WebElement toInput;
    @FindBy(xpath = "//div/input[@placeholder='Subject']")
    protected WebElement subjectInput;
    @FindBy(xpath = "//div/div[@aria-label='Message Body']")
    protected WebElement messageBodyInput;
    @FindBy(xpath = "//img[@data-tooltip='Save & Close']")
    protected WebElement saveCloseButton;
    @FindBy(xpath = "//div/span/a[contains(text(),'Drafts')]")
    protected WebElement draftEmails;
    @FindBy(xpath = "//div/span[contains(text(),'MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA')]")
    protected WebElement draftEmailSubject;
    @FindBy(xpath = "//div[@role='button'][contains(text(),'Send')]")
    protected WebElement sendButton;
    @FindBy(xpath = "//div/span/a[contains(text(),'Sent Mail')]")
    protected WebElement sentMail;



    public InboxPage(){
        PageFactory.initElements(driver, this);
        isPageOpen("Inbox");
    }

    public InboxPage clickComposeButton(){
        //TODO: wait for presents
        composeButton.click();
        return this;

    }

    public InboxPage fillToField(String to){
        //TODO: wait for presents
        toInput.sendKeys(to);
        return this;
    }

    public InboxPage fillSubjectField(String subject){
        //TODO: wait for presents
        subjectInput.sendKeys(subject);
        return this;
    }

    public InboxPage fillBodyField(String body){
        //TODO: wait for presents
        isElementClickable(messageBodyInput);
        messageBodyInput.sendKeys(body);
        return this;
    }

    public InboxPage clickSaveDraft(){
        //TODO: wait for presents
        isElementClickable(saveCloseButton);
        saveCloseButton.click();
        return this;
    }

    public InboxPage clickDraft(){
        //TODO: wait for presents
        isElementClickable(draftEmails);
        draftEmails.click();
        return this;
    }

    public InboxPage openDraftEmail(String subjectName){
        String draftEmailSubjectLocator = "//div/span[contains(text()," + subjectName + ")]";
        By elementXpath = By.xpath(draftEmailSubjectLocator);
        isElementClickable(elementXpath);
        draftEmailSubject.click();
        return this;
    }

    public InboxPage clickDraftEmailJSExcecutor(String subjectName){
        String draftEmailSubjectLocator = "//div/span[contains(text()," + subjectName + ")]";
        By elementXpath = By.xpath(draftEmailSubjectLocator);
        isElementClickable( elementXpath);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", draftEmailSubject);
        return this;
    }

    public InboxPage sendDraftEmail(){
        isElementClickable( sendButton);
        sendButton.click();
        return this;

    }

    public InboxPage openSentMail(){
        isElementClickable( sentMail);
        sentMail.click();
        isElementPresent(EMAIL_SUBJECT_LOCATOR );
        return this;
    }

    public InboxPage dragNdrop(){
        isElementVisible(EMAIL_SUBJECT_LOCATOR);
        isElementVisible(DISCARD_EMAIL_LOCATOR);
        WebElement element = driver.findElement(EMAIL_SUBJECT_LOCATOR);
        WebElement target = driver.findElement(DISCARD_EMAIL_LOCATOR);
        new Actions(driver).dragAndDrop(element, target).build().perform();
        return this;
    }

    public InboxPage clickAndHold(){
        isElementVisible(EMAIL_SUBJECT_LOCATOR);
        isElementVisible(DISCARD_EMAIL_LOCATOR);
        WebElement element = driver.findElement(EMAIL_SUBJECT_LOCATOR);
        new Actions(driver).clickAndHold(element).moveByOffset(250,200).release(element).build().perform();
        return this;

    }

    public InboxPage highightDraftEmailSubject(String subjectName){
        String draftEmailSubjectLocator = "//div/span[contains(text(),'" + subjectName + "')]";
        By elementXpath = By.xpath(draftEmailSubjectLocator);
        highlightElement(elementXpath);
        return this;
    }


    public InboxPage unhighightDraftEmailSubject(String subjectName){
        String draftEmailSubjectLocator = "//div/span[contains(text(),'" + subjectName + "')]";
        By elementXpath = By.xpath(draftEmailSubjectLocator);
        // isElementClickable(elementXpath);
        //unhighlightElement(elementXpath);
        return this;
    }

}
