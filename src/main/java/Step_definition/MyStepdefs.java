package Step_definition;

import Impls.CommonImpls;

import Utilities.Driver;

import Utilities.Utils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class MyStepdefs extends Driver {
WebDriver driver;
    CommonImpls commonImpls=new CommonImpls();

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) {
        driver=getDriver();
        driver.get(url);
        Utils.logInfo("Successfully navigated to "+url,true);
    }


    @And("^I login as \"([^\"]*)\"$")
    public void iLoginAs(String user) {
        commonImpls.loginUser(user);
    }

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



    @And("^I change date to \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iChangeStartDateTo(String month, String year, String day) {
        commonImpls.selectMonthAndYearAndDay(month,year,day);

    }

//    @And("^I choose \"([^\"]*)\" option from \"([^\"]*)\"$")
//    public void iChooseOptionFrom(String dateOrTime, String startOrEnd) {
//        commonImpls.chooseDateOrTime(dateOrTime, startOrEnd);
//    }


    @And("^I choose \"([^\"]*)\" textBox from \"([^\"]*)\"$")
    public void iChooseTextBoxFrom(String dateOrTime, String when)  {
        commonImpls.chooseStartOrEndTextbox(dateOrTime, when);
    }


    @And("^I verify \"([^\"]*)\" is \"([^\"]*)\"$")
    public void iVerifyIs(String endDate, String expected) {
       commonImpls.verifyTwoDate(endDate,expected);
    }

    @And("^I change time to \"([^\"]*)\"$")
    public void iChangeTimeTo(String time){
       commonImpls.changeTime(time);
    }

    @And("^I refresh the page$")
    public void iRefreshThePage() {
        commonImpls.refreshPage();
    }

    @And("^I click repeat checkbox$")
    public void iClickRepeatCheckbox() {
        commonImpls.iClickRepeatCheckBox();
    }

    @And("^I verify \"([^\"]*)\" is selected by default$")
    public void iVerifyIsSelectedByDefault(String defaultValue) {
       commonImpls.verifyDefaultValue(defaultValue);
    }

    @And("^I verify day\\(s\\) checkbox is selected$")
    public void iVerifyDaySCheckboxIsSelected() {
        commonImpls.verifyDayIsSelected();
    }

    @And("^I verify default value  is \"([^\"]*)\"$")
    public void iVerifyDefaultValueIs(String defaultValue) {
        commonImpls.verifyDefaultValue(defaultValue);
    }

    @And("^I verify summary says \"([^\"]*)\"$")
    public void iVerifySummarySays(String summaryText) {
        commonImpls.verifySummary(summaryText);
    }


    @And("^I enter \"([^\"]*)\" to day\\(s\\) textbox$")
    public void iEnterToDaySTextbox(String value){
        commonImpls.testDaysTextBoxWithBoundaryValue(value);
    }

    @And("^I clear the textBox$")
    public void iClearTheTextBox() {
        commonImpls.clearTextBox();
    }


    @And("^I click \"([^\"]*)\" from all cars table$")
    public void iClickFromAllCarsTable(String tableName){
       commonImpls.iClickELementFromTable(tableName);
    }


    @And("^I verify all records in \"([^\"]*)\" in \"([^\"]*)\" order$")
    public void iVerifyAllRecordsInInOrder(String tabName, String orderType) {
     commonImpls.verifyOrder(tabName,orderType);
    }

    @When("^I login as <userType>$")
    public void iLoginAsUserType() {
    }

    @Then("^I validate that i am in the homepage$")
    public void iValidateThatIAmInTheHomepage() {
        try {
            for (int i = 0; i < 3; i++) {
                driver.findElement(By.xpath("xpath")).click();
            }
        }catch (StaleElementReferenceException e){

        }


    }
}
