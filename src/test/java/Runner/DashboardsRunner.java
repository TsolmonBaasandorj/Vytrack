package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","json:target/Json/DashboardsJson.json","html:target/Reports/Dashboards","rerun:target/Failed/Dashboards.txt"},
        features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources/Dashboards.feature"}
        //features ={"@target/Failed/Dashboards.txt"}
        //features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources"}
        ,glue = {"Step_definition"}
       //,tags= {"@Mine"}
        //,tags= {"@regression"}
)

public class DashboardsRunner {
}