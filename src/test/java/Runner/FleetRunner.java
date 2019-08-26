package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","json:target/Json/FleetJson.json","html:target/Reports/Fleet","rerun:target/Failed/Fleet.txt"},
        features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources/Fleet.feature"}
        //features ={"@target/Failed/Fleet.txt"}
        //features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources"}
        ,glue = {"src/main/Step_definition"}
       //,tags= {"@Mine"}
        //,tags= {"@regression"}
)

public class FleetRunner {

}