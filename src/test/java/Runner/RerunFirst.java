package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin={"html:target/Reports","rerun:target/Failed/rererun.txt"},
        features ={"@target/Failed/rerun.txt"}
        //features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources"}
        ,glue = {"Step_definition"}
        //,tags= {"@regression"}
)

public class RerunFirst extends AbstractTestNGCucumberTests {
}