package Impls;
import Utilities.Utils;
import Pages.Page;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CommonImpls extends Page {

    WebDriver driver= Driver.getDriver();
    Utils utils=new Utils();


    public void loginUser(String userType){
        String userName="";
        String password="";
        if(userType.equalsIgnoreCase("Driver")){
            userName=Utils.configReader("driverUserName");
            password=Utils.configReader("driverPassword");
        }else if(userType.equalsIgnoreCase("Store manager")){
            userName=Utils.configReader("storeManagerUserName");
            password=Utils.configReader("storeManagerPassword");
        }else if(userType.equalsIgnoreCase("Sales manager")){
            userName=Utils.configReader("salesManagerUserName");
            password=Utils.configReader("salesManagerPassword");
        }

        userNameTextBox.sendKeys(userName);
        PasswordTextBox.sendKeys(password);
        LogInButton.click();
        utils.waitSec(2);
        System.out.println("Logged in as "+userType);
    }

    public void mouseoverDropdown(String dropdownName) {
        String xpath=String.format(dropdown_xpath,dropdownName);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
        System.out.println("MouseOvered to the "+dropdownName);
        utils.waitSec(2);
    }

    public void clickElement(String elementName) {
        String xpath=String.format(element_xpath,elementName);
        driver.findElement(By.xpath(xpath)).click();
        System.out.println("Clicked "+elementName);
        utils.waitSec(4);
    }

    public void verifyPageTitle(String expectedTitle) {
        String actualTitle=driver.getTitle();
        System.out.println("Actual title:::"+actualTitle);
        if(!actualTitle.contains(expectedTitle)){
            Assert.assertTrue(false,"");
        }
        System.out.println("Page title was match");
    }

    public void verifyPageName(String expectedPageName) {
        utils.waitSec(3);
        Assert.assertEquals(expectedPageName,driver.getTitle());
    }

    public void verifyUserNameIsDisplayed(String expectedUserName) {
        String xpath=String.format(userName_xpath,expectedUserName);
        String actual = driver.findElement(By.xpath(xpath)).getText();
        Assert.assertEquals(expectedUserName,actual);
    }

    public void verifyPageNameIsDisplayed(String expectedPageName) {
        String xpath=String.format(pageName_xpath,expectedPageName);
        String actualPageName=driver.findElement(By.xpath(xpath)).getText();
        Assert.assertEquals(expectedPageName,actualPageName);
    }

    public void clickLogOutButton() {
        Actions action = new Actions(driver);
        action.moveToElement(userName_Button).
                moveToElement(driver.findElement(By.xpath(logOutButton))).click().perform();
         utils.waitSec(3);

    }

    public void iEnterUsernameToUsernameBox(String userName) {
        userNameTextBox.sendKeys(userName);
    }

    public void iEnterPasswordToPasswordTextBox(String password) {
        PasswordTextBox.sendKeys(password);
    }

    public void iClickLogInButton() {
        LogInButton.click();
    }

    public void iShouldSeeErrorMessage(String errorMessage) {
        Assert.assertTrue(driver.findElement(By.xpath(ErrorMessage)).isDisplayed());
    }

    public void iVerifyTitle(String expectedTitle) {
        String xpath = String.format(title_Xpath,expectedTitle);
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public void verifyUrl(String expectedURL) {
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualUrl);
    }

}
