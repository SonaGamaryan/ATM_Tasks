package pages;

import entities.User;
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
    protected User user = new User();



    public LoginPage(String url) throws MalformedURLException {
       // super(driver);
        driver.get(url);
        PageFactory.initElements(driver, this);

        isPageOpen("Gmail");
    }

    public LoginPage fillGmailAccountInput(){
        //TODO: wait for presents
        isElementClickable(accountNameInput);
        accountNameInput.sendKeys(user.getLogin());
        return this;

    }

    public LoginPage hitNextbutton(){
        //TODO: wait for presents
        isElementClickable(nextButton);
        nextButton.click();
        return this;
    }

    public LoginPage fillPasswordInput(){
        passwordInput.sendKeys(user.getPassword());
        return this;
    }

    public InboxPage clickNextButton() throws MalformedURLException{
        isElementClickable(nextButton);
        nextButton.click();
        return new InboxPage();
    }

}
