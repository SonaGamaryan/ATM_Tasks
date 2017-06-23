import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public class InboxPage extends Page{

    protected static final By COMPOSE_BUTTON_LOCATOR = By.xpath("//div[@role='button'][contains(text(), 'COMPOSE')]" );
    protected static final By TO_LABEL_LOCATOR = By.xpath("//div/textarea[@aria-label='To']");
    protected static final By SUBJECT_LOCATOR = By.xpath("//div/input[@placeholder='Subject']");
    protected static final By MESSAGE_BODY_LOCATOR = By.xpath("//div/div[@aria-label='Message Body']");
    protected static final By SAVE_AND_CLOSE_BUTTON_LOCATOR = By.xpath("//img[@data-tooltip='Save & Close']");
    protected static final By DRAFT_LOCATOR = By.xpath("//div/span/a[contains(text(),'Drafts')]");
    protected static final By EMAIL_SUBJECT_LOCATOR = By.xpath("//div/span[contains(text(),'MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA')]");
    protected static final By DRAFT_EMAIL_SUBJECT_LOCATOR = By.xpath("//div/span[contains(text(),'BaseTest: MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA')]");

    @FindBy(xpath = "//div[@role='button'][contains(text(), 'COMPOSE')]")
    WebElement composeButton;
    @FindBy(xpath = "//div/textarea[@aria-label='To']" )
    WebElement toInput;
    @FindBy(xpath = "//div/input[@placeholder='Subject']")
    WebElement subjectInput;
    @FindBy(xpath = "//div/div[@aria-label='Message Body']")
    WebElement messageBodyInput;
    @FindBy(xpath = "//img[@data-tooltip='Save & Close']")
    WebElement saveCloseButton;
    @FindBy(xpath = "//div/span/a[contains(text(),'Drafts')]")
    WebElement draftEmails;
    @FindBy(xpath = "//div/span[contains(text(),'MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA')]")
    WebElement draftEmailSubject;
    @FindBy(xpath = "//div[@role='button'][contains(text(),'Send')]")
    WebElement sendButton;
    @FindBy(xpath = "//div/span/a[contains(text(),'Sent Mail')]")
    WebElement sentMail;
    @FindBy (xpath = "//div/span[contains(text(),'MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA')]")
    WebElement sentEmailSubject;


    public InboxPage(WebDriver driver){
        super(driver);
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
        isElementClickable(driver, messageBodyInput);
        messageBodyInput.sendKeys(body);
        return this;
    }

    public InboxPage clickSaveDraft(){
        //TODO: wait for presents
        isElementClickable(driver,saveCloseButton);
        saveCloseButton.click();
        return this;
    }

    public InboxPage clickDraft(){
        //TODO: wait for presents
        isElementClickable(driver, draftEmails);
        draftEmails.click();
        return this;
    }

    public InboxPage openDraftEmail(){
        isElementClickable(driver, draftEmailSubject);
        draftEmailSubject.click();
        return this;
    }

    public InboxPage sendDraftEmail(){
        isElementClickable(driver, sendButton);
        sendButton.click();
        return this;

    }

    public InboxPage openSentMail(){
        isElementClickable(driver, sentMail);
        sentMail.click();
        isElementPresent(driver, EMAIL_SUBJECT_LOCATOR );
        return this;
    }

}
