package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    public Page(){
     PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id="prependedInput")
    public WebElement userNameTextBox;

    @FindBy(id="prependedInput2")
    public WebElement PasswordTextBox;

    @FindBy(id="_submit")
    public WebElement LogInButton;

    @FindBy(className="dropdown user-menu-dropdown")
    public WebElement userName_Button ;

   // public String userNameTextBox="//input[@id='prependedInput']";
   // public String PasswordTextBox="//input[@id='prependedInput2']";
   // public String LogInButton="//button[@id='_submit']";
   // public String userName_Button="//li[@class='dropdown user-menu-dropdown']";
    public String logOutButton="//li[@class='last']/a[@href='/user/logout']";
    public String pageName_xpath="//h1[@class='oro-subtitle' and contains(text(), '%s')]";
    public String ErrorMessage="//div[@class='alert alert-error']/div";
    public String dropdown_xpath = "//span[@class='title title-level-1' and contains(text(), '%s')]";
    public String element_xpath = "//span[@class='title title-level-2' and contains(text(), '%s')]";
    public String userName_xpath ="//a[@class='dropdown-toggle' and contains(text(), '%s')]";
    public String title_Xpath="//h2[@class='title' and contains(text(), '%s')]";
}
