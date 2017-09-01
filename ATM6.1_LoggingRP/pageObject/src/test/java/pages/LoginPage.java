package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public class LoginPage extends Page{
    @FindBy(id = "identifierId")
    protected WebElement accountNameInput;
    @FindBy(xpath = "//span[text()='Next']")
    protected WebElement nextButton;
    @FindBy(xpath = "//div/input[@name='password']")
    protected WebElement passwordInput;




    public LoginPage(String url) throws MalformedURLException {
       // super(driver);
        driver.get(url);
        PageFactory.initElements(driver, this);

        isPageOpen("Gmail");
    }

    public LoginPage fillGmailAccountInput(String account){
        //TODO: wait for presents
        isElementClickable(accountNameInput);
        accountNameInput.sendKeys(account);
        return this;

    }

    public LoginPage hitNextbutton(){
        //TODO: wait for presents
        isElementClickable(nextButton);
        nextButton.click();
        return this;
    }

    public LoginPage fillPasswordInput(String password){
        passwordInput.sendKeys(password);
        return this;
    }

    public InboxPage clickNextButton() throws MalformedURLException{
        isElementClickable(nextButton);
        nextButton.click();
        return new InboxPage();
    }

}
