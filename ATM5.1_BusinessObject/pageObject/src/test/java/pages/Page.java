package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driver.WebDriverSingleton;

import java.net.MalformedURLException;

/**
 * Created by Sona_Gamaryan on 6/19/2017.
 */
public abstract class Page {
    protected WebDriver driver;

    public Page() throws MalformedURLException{
        this.driver = WebDriverSingleton.getWebDriverInstance();
        PageFactory.initElements(this.driver, this);
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public boolean isElementPresent(By locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        try {

            WebElement myDynamicElement = (driverWait)
                    .until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch(Exception e){
            return false;
        }

        return true;
    }


    public boolean isElementClickable(WebElement locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 60);
        try {
            WebElement myDynamicElement = (driverWait)
                    .until(ExpectedConditions.elementToBeClickable(locator));
        } catch(Exception e){
            return false;
        }

        return true;
    }

    public boolean isElementClickable(By locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        try {
            WebElement myDynamicElement = (driverWait)
                    .until(ExpectedConditions.elementToBeClickable(locator));
        } catch(Exception e){
            return false;
        }

        return true;
    }

    public boolean isElementVisible(By locator){
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

   public void highlightElement(By locator){
       ((JavascriptExecutor)driver).executeScript("arguments[0].style.backgroundColor ='red';", driver.findElement(locator));
   }

    public boolean isPageOpen(String title) {
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        try {
            boolean result = (driverWait)
                    .until(ExpectedConditions.titleContains(title));
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}
