package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.WebDriverSingleton;
import org.testng.Assert;
import pages.InboxPage;
import pages.LoginPage;

import java.util.List;

/**
 * Created by Sona_Gamaryan on 8/1/2017.
 */
public class GmailLoginStepDefs {
    private LoginPage loginPage;
    private InboxPage inboxPage;

    @Given("^user navigate to gmail home page$")
    public void userNavigateToGmailHomePage() throws Throwable {

        // Write code here that turns the phrase above into concrete actions
         String URL = "http://www.gmail.com";

        loginPage = new LoginPage(URL);

    }

    @When("^enters accountName$")
    public void entersAccountName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @And("^click next button$")
    public void clickNextButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();
        loginPage.hitNextbutton();
    }

    @And("^enters password$")
    public void entersPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();
        loginPage.fillPasswordInput();
    }

    @Then("^gmail_inbox is displayed$")
    public void gmail_inboxBageIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();

        Assert.assertTrue(inboxPage.isElementClickable(inboxPage.composeButton ));
        WebDriverSingleton.kill();
    }

    @When("^enters accountName as \"([^\"]*)\"$")
    public void entersAccountNameAs(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Name is " + username);
        loginPage.fillGmailAccountInput();

    }

    @And("^enters password as \"([^\"]*)\"$")
    public void entersPasswordAs(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println();
        System.out.println("Password is " + password);
        loginPage.fillPasswordInput();
    }

    @And("^enters the following as password$")
    public void entersTheFollowingAsPassword(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        List<List<String>> data = table.raw();

        System.out.println( data.get(1).get(0).toString());
        loginPage.fillPasswordInput();
    }

    @And("^click Compose button$")
    public void clickComposeButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^enter ([^\"]*)$")
    public void enterEmail(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();

        System.out.println("This is to test scenario outline: " + email);
    }

    @And("^click next button and go to Inbox page$")
    public void clickNextButtonAndGoToInboxPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        inboxPage = loginPage.clickNextButton();
    }
}
