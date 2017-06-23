import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public abstract class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public Page() {
    }

    public boolean isElementPresent(WebDriver driver, By locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        try {

            WebElement myDynamicElement = (driverWait)
                    .until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch(Exception e){
            return false;
        }

        return true;
    }


    public boolean isElementClickable(WebDriver driver, WebElement locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 60);
        try {
            WebElement myDynamicElement = (driverWait)
                    .until(ExpectedConditions.elementToBeClickable(locator));
        } catch(Exception e){
            return false;
        }

        return true;
    }

    public boolean isElementClickable(WebDriver driver, By locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        try {
            WebElement myDynamicElement = (driverWait)
                    .until(ExpectedConditions.elementToBeClickable(locator));
        } catch(Exception e){
            return false;
        }

        return true;
    }

    public boolean isElementVisible(WebDriver driver, By locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        try {
            WebElement myDynamicElement = (driverWait)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        catch (Exception e){
            return false;
        }

        return true;
    }
}
