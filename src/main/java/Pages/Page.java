package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page {
    public Page(){
     PageFactory.initElements(Driver.getDriver(), this);
    }


//    @FindBy (id="prependedInput")
//    public WebElement userNameTextBox;
//
//    @FindBy(id="prependedInput2")
//    public WebElement PasswordTextBox;
//
//    @FindBy(id="_submit")
//    public WebElement LogInButton;
//
//    @FindBy(className="dropdown user-menu-dropdown")
//    public WebElement userName_Button ;

    public String userNameTextBox="//input[@id='prependedInput']";
    public String PasswordTextBox="//input[@id='prependedInput2']";
    public String LogInButton="//button[@id='_submit']";
    public String userName_Button="//li[@class='dropdown user-menu-dropdown']";
    public String logOutButton="//li[@class='last']/a[@href='/user/logout']";
    public String pageName_xpath="//h1[@class='oro-subtitle' and contains(text(), '%s')]";
    public String pName="//h1[@class='oro-subtitle']";
    public String ErrorMessage="//div[@class='alert alert-error']/div";
    public String dropdown_xpath = "//span[@class='title title-level-1' and contains(text(), '%s')]";
    public String element_xpath = "//span[@class='title title-level-2' and contains(text(), '%s')]";
    public String userName_xpath ="//a[@class='dropdown-toggle' and contains(text(), '%s')]";
    public String title_Xpath="//h2[@class='title' and contains(text(), '%s')]";

//    @FindBy(xpath="//input[@placeholder='%s']")
//    public List<WebElement> startOrEndDateorTime;

    public String startOrEndDateorTime="//input[@placeholder='%s']";
    @FindBy(xpath="//select[@data-handler='selectMonth']")
    public WebElement monthSelection;
    @FindBy(xpath = "//select[@class='recurrence-repeats__select']")
    public WebElement repeatsSelection;

    @FindBy(xpath="//select[@data-handler='selectYear']")
    public WebElement yearSelection;

    //@FindBy(xpath = "//a[@title='']")
   // public List<WebElement> Buttons;
   //
     public String buttons="//a[@title='%s']";

    @FindBy(xpath="(//input[@placeholder='Choose a date'])[1]")
    public WebElement startDateTextBox;

    @FindBy(xpath="(//input[@placeholder='Choose a date'])[2]")
    public WebElement endDateTextBox;


    public String repeatCheckBox="//input[@data-name='recurrence-repeat']";
    public String radios="//input[@type='radio']";
    public String summaries="//span[contains(text(),'%s')]";
   // public String daysTextBox="(//input[@class='recurrence-subview-control__number'])[1]";
    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement daysTextBox;
    public String allCarsCells="//td[@data-column-label='%s']";
    public String allCarsHeaders="//span[@class='grid-header-cell__label' and contains(text(),'%s')]";
    public String allTabs="//span[contains(text(),'%s')]/following-sibling::span";
}
////span[@class='grid-header-cell__label' and contains(text(),'License Plate')]