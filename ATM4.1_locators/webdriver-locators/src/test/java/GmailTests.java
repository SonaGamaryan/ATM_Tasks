import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sona_Gamaryan on 6/9/2017.
 */
public class GmailTests {
    private WebDriver driver;
    private String baseURL = "https://gmail.com";


    @BeforeMethod
    public void gmailTestsInit(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterMethod
    public void gmailTestsAfter(){
        driver.close();
        driver.quit();

    }


    @Test
    public void userCanLogin(){
      // System.setProperty("webdriver.gecko.driver","C:\\Users\\Sona_Gamaryan\\workspace\\geckodriver.exe");


        login();
        Assert.assertTrue(isElementClickable(driver, "//div[@role='button'][contains(text(), 'COMPOSE')]"));

        signOut();
    }

    @Test
    public void userCanCreateNewEmail(){

        login();
        sendNewEmail();
        Assert.assertEquals(true,isElementPresent(driver,"//div/span/a[contains(text(),'Sent Mail')]"));
        driver.findElement(By.xpath("//div/span/a[contains(text(),'Sent Mail')]")).click();
        Assert.assertEquals(true, isElementPresent(driver,"//div/span[contains(text(),'Test: MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA')]"));//
        signOut();
        Assert.assertEquals(true, isElementClickable(driver, "//div/a[@id='gb_71']"));

    }

    @Test
    public void uerCanLogOff(){

        login();
        signOut();
        driver.findElement(By.xpath("//div/a[@id='gb_71']")).click();
        driver.findElement(By.cssSelector("div#passwordNext"));

    }

    public void login(){
        driver.findElement(By.id("identifierId")).sendKeys("epam0333");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("epam1234.");
        isElementClickable(driver, "//span[text()='Next']");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
    }

    public void sendNewEmail(){
        isElementClickable(driver, "//div[@role='button'][contains(text(), 'COMPOSE')]" );
        driver.findElement(By.xpath("//div[@role='button'][contains(text(), 'COMPOSE')]")).click();

        isElementClickable(driver, "//div/textarea[@aria-label='To']");
        driver.findElement(By.xpath("//div/textarea[@aria-label='To']")).sendKeys("Andranik_Chorokhyan@epam.com");

        driver.findElement(By.xpath("//div/input[@placeholder='Subject']")).sendKeys("Test: MODULE 4.1");
        driver.findElement(By.xpath("//div/div[@aria-label='Message Body']")).sendKeys("Test: MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA");
        driver.findElement(By.xpath("//img[@data-tooltip='Save & Close']")).click();
        driver.findElement(By.xpath("//div/span/a[contains(text(),'Drafts')]")).click();
        isElementClickable(driver,"//div/span[contains(text(),'MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA')]");
        driver.findElement(By.xpath("//div/span[contains(text(),'MODULE 4.1: WEBDRIVER BASICS + LOCATORS FOR JAVA')]")).click();
        driver.findElement(By.xpath("//div[@role='button'][contains(text(),'Send')]")).click();
    }

    public void signOut(){
        driver.findElement(By.xpath("//div/a[@role='button'][@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']")).click();
    }

    public static boolean isElementClickable(WebDriver driver, String locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        try {
            WebElement myDynamicElement = (driverWait)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        } catch(Exception e){
            return false;
        }

        return true;
    }

    public static boolean isElementVisible(WebDriver driver, String locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        try {
            WebElement myDynamicElement = (driverWait)
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        }
        catch (Exception e){
            return false;
        }

        return true;
    }


    public static boolean isElementPresent(WebDriver driver, String locator){
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        try {
            WebElement myDynamicElement = (driverWait)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        }
        catch (Exception e){
            return false;
        }

        return true;
    }

}
