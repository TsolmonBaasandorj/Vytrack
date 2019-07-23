package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin={"json:FirstRunner.json","html:target/Reports","rerun:target/Failed/rerun.txt"},
        features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources"}
        //features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources"}
        ,glue = {"Step_definition"}
        ,tags= {"@smoke"}
        //,tags= {"@regression"}
)

public class TheFirstRunner extends AbstractTestNGCucumberTests {
}