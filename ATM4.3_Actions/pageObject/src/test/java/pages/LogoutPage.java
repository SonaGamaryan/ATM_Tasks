package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

/**
 * Created by Sona_Gamaryan on 6/21/2017.
 */
public class LogoutPage extends Page {
    @FindBy(xpath = "//div/a[@role='button'][@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']")
    protected WebElement signoutButton1;
    @FindBy(xpath = "//div/a[@id='gb_71']")
    protected WebElement signoutButton2;
    @FindBy(xpath = "//div[text()='Forgot password?']")
    protected WebElement forgotPasswordLink;

    public LogoutPage() throws MalformedURLException {
        PageFactory.initElements(this.driver, this);
        isPageOpen("Gmail");
    }

    public LogoutPage clickSignoutButton1() {
        isElementClickable(signoutButton1);
        signoutButton1.click();
        return this;
    }

    public LogoutPage clickSignoutButton2(){
        //TODO: wait for presents
        isElementClickable(signoutButton2);
        signoutButton2.click();
        return this;
    }

    public LogoutPage clickPasswordNextButton(){
        //TODO: wait for presents
        isElementClickable(forgotPasswordLink);
        forgotPasswordLink.click();
        return this;
    }
}
