package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","json:target/Json/ActivitiesJson.json","html:target/Reports/Activities","rerun:target/Failed/Activities.txt"},
        features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources/Activities.feature"}
        //features ={"@target/Failed/Activities.txt"}
        //features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources"}
        ,glue = {"Step_definition"}
       ,tags= {"@Test"}
        //,tags= {"@regression"}
)

public class ActivitiesRunner {
}