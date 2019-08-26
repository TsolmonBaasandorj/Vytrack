package Step_definition;

import Utilities.*;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks{
    public static Scenario currentScenario;

    @Before
    public void setUp(Scenario s){
        currentScenario=s;
        System.out.println("======Setting up");
    }

    @After
    public void tearDown() {
        System.out.println("\nTearing down");
        Driver.getDriver().quit();
        Driver.closeDriver();

    }
}
