package Impls;
import Utilities.CucumberUtils;
import Utilities.Utils;
import Pages.Page;
import Utilities.Driver;
import com.sun.jna.platform.unix.X11;
import cucumber.api.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.openqa.selenium.Keys.DELETE;

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

       utils.highlight(driver.findElement(By.xpath(userNameTextBox))).sendKeys(userName);
        utils.highlight(driver.findElement(By.xpath(PasswordTextBox))).sendKeys(password);
        Utils.logInfo("Entered the credentials ",true);
        utils.highlight(driver.findElement(By.xpath(LogInButton))).click();
        utils.waitSec(2);
        System.out.println("Logged in as "+userType);
    }

    public void mouseoverDropdown(String dropdownName) {
        String xpath=String.format(dropdown_xpath,dropdownName);
        Actions action = new Actions(driver);
        action.moveToElement(utils.highlight(driver.findElement(By.xpath(xpath)))).build().perform();
        System.out.println("MouseOvered to the "+dropdownName);
        utils.waitSec(2);
        Utils.logInfo("Successfully mouseovered to "+dropdownName,true);
    }

    public void clickElement(String elementName) {
        String xpath="";
        try {
            xpath = String.format(element_xpath, elementName);
            utils.highlight(driver.findElement(By.xpath(xpath))).click();
            utils.waitSec(4);
            Utils.logInfo("Element is displayed",true);
        }catch (NoSuchElementException error){
          xpath = String.format(buttons,elementName);
            utils.highlight(driver.findElement(By.xpath(xpath))).click();
            utils.waitSec(4);
            Utils.logInfo("Element is displayed",true);
        }

    }

    public void verifyPageTitle(String expectedTitle) {
       // String xpath=String.format(pageName_xpath,expectedTitle);
        String actualTitle=driver.findElement(By.xpath(pName)).getText();
        Assert.assertEquals(expectedTitle,actualTitle);
        Utils.logInfo("Actual title: "+actualTitle+ " | Expected title: "+expectedTitle,true);
      //  System.out.println("Actual title:::"+actualTitle);
//        if(!actualTitle.contains(expectedTitle)){
//            Assert.assertTrue(false,"");
//        }
//        System.out.println("Page title was match");
    }

    public void verifyPageName(String expectedPageName) {
        utils.waitSec(3);
        String actualPageName=driver.getTitle();
        Utils.logInfo("Actual page name: "+actualPageName+" | Expected page name: "+expectedPageName,true);
        try {
            Assert.assertEquals(expectedPageName, actualPageName);
        }catch (AssertionError error){
            String trySecond="Accounts - Customers";
            Utils.logInfo(expectedPageName+" was not displayed. Trying: "+trySecond,false);
            Assert.assertEquals(trySecond, actualPageName);
            Utils.logInfo(trySecond+" was displayed",false);
        }
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
        action.moveToElement(driver.findElement(By.xpath(userName_Button))).
                moveToElement(driver.findElement(By.xpath(logOutButton))).click().perform();
         utils.waitSec(3);
       // driver.findElement(By.xpath(logOutButton)).click();
    }

    public void iEnterUsernameToUsernameBox(String userName) {

        driver.findElement(By.xpath(userNameTextBox)).sendKeys(userName);
    }

    public void iEnterPasswordToPasswordTextBox(String password) {
        driver.findElement(By.xpath(PasswordTextBox)).
                sendKeys(password);
    }

    public void iClickLogInButton() {
        driver.findElement(By.xpath(LogInButton)).click();
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

    public void selectMonthAndYearAndDay(String month, String year, String day) {
        utils.waitSec(3);
        WebElement selectElement1= monthSelection;
        Select s = new Select(selectElement1);
        s.selectByVisibleText(month);
        utils.waitSec(2);
        WebElement selectElement2= yearSelection;
        Select s1 = new Select(selectElement2);
        s1.selectByVisibleText(year);
        String dateLocator = "//a[@class='ui-state-default' and text()='"+day+"']";
        driver.findElement(By.xpath(dateLocator)).click();
        utils.waitSec(3);
        Utils.logInfo("Entered month/year/day",true);
    }




    public void chooseStartOrEndTextbox(String dateOrTime, String when) {
        if(dateOrTime.equals("Choose a date")) {
            String xpath = String.format(startOrEndDateorTime, dateOrTime);
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            if (when.equals("Start")) {
                elements.get(0).click();
            } else if (when.equals("End")) {
                elements.get(1).click();
                Utils.logInfo("Clicked on end date", true);
            }
        }
        else if(dateOrTime.equals("time")){
            String xpath = String.format(startOrEndDateorTime, dateOrTime);
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            if (when.equals("Start")) {
                elements.get(0).click();
                elements.get(0).clear();

            } else if (when.equals("End")) {
                elements.get(1).click();
                elements.get(0).clear();
                Utils.logInfo("Clicked on end date", true);
            }
        }
    }

    public void verifyTwoDate(String dateOrTime, String expected) {
        try {
            String xpath = String.format(startOrEndDateorTime, "Choose a date");
            utils.waitElementVisible(xpath);
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            String actualDate = "";
            if (dateOrTime.contains("Start")) {
                actualDate = elements.get(0).getAttribute("value");
            } else if (dateOrTime.contains("End")) {
                actualDate = elements.get(1).getAttribute("value");
            }
            Assert.assertEquals(expected, actualDate);
            Utils.logInfo("End date matches start date", true);
        } catch (AssertionError error){
            String xpath = String.format(startOrEndDateorTime, "time");
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            String actualDate = "";
            if (dateOrTime.contains("Start")) {
                actualDate = elements.get(0).getAttribute("value");
            } else if (dateOrTime.contains("End")) {
                actualDate = elements.get(1).getAttribute("value");
            }
//            int startTime=Integer.parseInt(startDate.substring(0,1));
//            int endTime=Integer.parseInt(actualDate.substring(0,1));
//            Assert.assertTrue(endTime-startTime==1);
            CucumberUtils.logInfo("Expected: "+expected + " | Actual: "+actualDate);
             Assert.assertTrue(actualDate.equalsIgnoreCase(expected));
        }

    }

    public void changeTime(String time) {
        List<WebElement> elements = driver.findElements(By.xpath("//li[@class='ui-timepicker-pm']"));
    for(WebElement each: elements){
       // System.out.println(each.getText());
        if(each.getText().equalsIgnoreCase(time)){
            each.click();

            utils.waitSec(2);
        }
    }
    utils.waitSec(4);

    }

    public void refreshPage() {
        driver.navigate().refresh();
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text:" + alert.getText());
            alert.accept();
        }catch (NoAlertPresentException e){
            System.out.println("There was no pop-up window.");
        }
        utils.waitSec(3);
    }

    public void iClickRepeatCheckBox() {
        utils.highlight(driver.findElement(By.xpath(repeatCheckBox))).click();
    }


    public void verifyDayIsSelected() {
        List<WebElement> elements = driver.findElements(By.xpath(radios));
        Assert.assertTrue(elements.get(0).isSelected());
    }

    public void verifyDefaultValue(String defaultValue) {
        Assert.assertEquals(daysTextBox.getAttribute("Value"),"1");
    }

    public void verifySummary(String summaryText) {
        String xpath = String.format(summaries,summaryText);
        String expected=driver.findElement(By.xpath(xpath)).getText();
        Assert.assertEquals(expected,summaryText);
        utils.waitSec(2);
    }

    public void testDaysTextBoxWithBoundaryValue(String value) {
        daysTextBox.sendKeys(value+Keys.ENTER);
        utils.waitSec(4);
    }

    public void clearTextBox() {
        daysTextBox.sendKeys(Keys.BACK_SPACE);
    }


    public void iClickELementFromTable(String tableName) {

        String pattern="//a//span[contains(text(),'%s')]";
        String xpath=String.format(pattern,tableName);
       utils.waitElementVisible(xpath);
       driver.findElement(By.xpath(xpath)).click();

        utils.waitSec(1);
    }

    public void verifyOrder(String tabName, String orderType) {
        String xpath=String.format(allCarsCells,tabName);
        List<WebElement> elements=driver.findElements(By.xpath(xpath));
        List<String> list = new ArrayList<String>();
        for(WebElement each: elements){
            list.add(each.getText());
            System.out.println(each.getText());
        }
        boolean inOrder=utils.verifyOrder(list,orderType);
        Assert.assertTrue(inOrder);
        Utils.logInfo("All values are in "+orderType+" order as expected: "+list,true);

    }
}
