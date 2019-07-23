package Step_definition;

import Impls.CommonImpls;

import Utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class MyStepdefs<user> extends Driver {
WebDriver driver;
    CommonImpls commonImpls=new CommonImpls();

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) {
        driver=getDriver();
        driver.get(url);
    }

    @Given("^I enter \"([^\"]*)\" credentials to userName and Password textbox$")
    public void iEnterCredentialsToUserNameAndPasswordTextbox(String user) {
    commonImpls.loginUser(user); }


    @Given("^I mouseover \"([^\"]*)\" dropdown$")
    public void iMouseoverDropdown(String dropdownName) {
        commonImpls.mouseoverDropdown(dropdownName);
    }

    @Given("^I click \"([^\"]*)\" option$")
    public void iClickOption(String elementName) {
        commonImpls.clickElement(elementName);
    }

    @Given("^I verify the page name of \"([^\"]*)\"$")
    public void iVerifyThePageTitleOf(String expectedTitle) {
        commonImpls.verifyPageTitle(expectedTitle);
    }

    @Then("^I verify the page title of \"([^\"]*)\"$")
    public void iVerifyThePageNameOf(String expectedPageName) {
    commonImpls.verifyPageName(expectedPageName);
    }


    @And("^I verify \"([^\"]*)\" is displayed on top right$")
    public void iVerifyIsDisplayedOnTopRight(String userName) {
        commonImpls.verifyUserNameIsDisplayed(userName);
    }

    @And("^I verify \"([^\"]*)\" page is open$")
    public void iVerifyPageIsOpen(String expectedPageName) {
        commonImpls.verifyPageNameIsDisplayed(expectedPageName);
    }

    @And("^I log out")
    public void iLogOut() {
        commonImpls.clickLogOutButton();
    }

    @And("^I enter \"([^\"]*)\" to usernameTextBox$")
    public void iEnterToUsernameTextBox(String userName) {
        commonImpls.iEnterUsernameToUsernameBox(userName);
    }

    @And("^I enter \"([^\"]*)\" to passwordTextBox$")
    public void iEnterToPasswordTextBox(String password) {
        commonImpls.iEnterPasswordToPasswordTextBox(password);
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        commonImpls.iClickLogInButton();
    }

    @And("^I should see \"([^\"]*)\" message$")
    public void iShouldSeeMessage(String errorMessage) {
        commonImpls.iShouldSeeErrorMessage(errorMessage);
    }

    @And("^I verify \"([^\"]*)\" title$")
    public void iVerifyTitle(String expectedTitle) {
        commonImpls.iVerifyTitle(expectedTitle);
    }

    @And("^I verify \"([^\"]*)\" url$")
    public void iVerifyUrl(String expectedURL) {
        commonImpls.verifyUrl(expectedURL);
    }

    @And("^i chooce \"([^\"]*)\"$")
    public void iChooce(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
