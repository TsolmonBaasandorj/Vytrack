package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","json:target/Json/SalesJson.json","html:target/Reports/Sales","rerun:target/Failed/Sales.txt"},
        features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources/Sales.feature"}
        //features ={"@target/Failed/Sales.txt"}
        //features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources"}
        ,glue = {"Step_definition"}
       //,tags= {"@Mine"}
        //,tags= {"@regression"}
)

public class SalesRunner {
}

