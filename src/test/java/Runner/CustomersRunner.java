package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","json:target/Json/CustomersJson.json","html:target/Reports/Activities","rerun:target/Failed/Customers.txt"},
        features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources/Customers.feature"}
        //features ={"@target/Failed/Customers.txt"}
        //features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources"}
        ,glue = {"Step_definition"}
       //,tags= {"@Mine"}
        //,tags= {"@regression"}
)

public class CustomersRunner {
}