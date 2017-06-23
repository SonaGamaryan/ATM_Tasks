import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public class LoginPage extends Page{
    @FindBy(id = "identifierId")
    WebElement accountNameInput;
    @FindBy(xpath = "//span[text()='Next']")
    WebElement nextButton;
    @FindBy(xpath = "//div/input[@name='password']")
    WebElement passwordInput;




    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public LoginPage fillGmailAccountInput(String account){
        //TODO: wait for presents
        isElementClickable(driver,accountNameInput);
        accountNameInput.sendKeys(account);
        return this;

    }

    public LoginPage hitNextbutton(){
        //TODO: wait for presents
        isElementClickable(driver,nextButton);
        nextButton.click();
        return this;
    }

    public LoginPage fillPasswordInput(String password){
        passwordInput.sendKeys(password);
        return this;
    }

    public InboxPage clickNextButton(){
        isElementClickable(driver,nextButton);
        nextButton.click();
        return new InboxPage(driver);
    }

}
