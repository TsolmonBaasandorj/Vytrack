package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","json:target/Json/Login_navigationJson.json","html:target/Reports/Login_navigation","rerun:target/Failed/Login_navigation.txt"},
        features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources/Login_navigation.feature"}
        //features ={"@target/Failed/Login_navigation.txt"}
        //features ={"/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/src/main/resources"}
        ,glue = {"Step_definition"}
       //,tags= {"@Mine"}
        //,tags= {"@regression"}
)

public class Login_navigationRunner {
}