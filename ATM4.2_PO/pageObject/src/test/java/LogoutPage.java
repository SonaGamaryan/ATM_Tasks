import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sona_Gamaryan on 6/21/2017.
 */
public class LogoutPage extends Page {
    @FindBy(xpath = "//div/a[@role='button'][@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']")
    WebElement signoutButton1;
    @FindBy(xpath = "//div/a[@id='gb_71']")
    WebElement signoutButton2;
    @FindBy(xpath = "//div[text()='Forgot password?']")
    WebElement forgotPasswordLink;

    public LogoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public LogoutPage clickSignoutButton1() {
        isElementClickable(driver, signoutButton1);
        signoutButton1.click();
        return this;
    }

    public LogoutPage clickSignoutButton2(){
        //TODO: wait for presents
        isElementClickable(driver,signoutButton2);
        signoutButton2.click();
        return this;
    }

    public LogoutPage clickPasswordNextButton(){
        //TODO: wait for presents
        isElementClickable(driver,forgotPasswordLink);
        forgotPasswordLink.click();
        return this;
    }
}
