package Step_definition;

import Utilities.*;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks{
    WebDriver driver;
    @Before
    public void setUp(){
        System.out.println("Setting up");
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down");
        Driver.getDriver().quit();
        Driver.closeDriver();

    }
}
