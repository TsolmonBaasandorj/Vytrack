package properties_driver_class_test_base;

import Utilities.Driver;
import Utilities.Utils;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest extends Driver {
    @Test
    public void systemPropertiesTest(){
        //System class which has information about our system/computer.

        String os = System.getProperty("os.name");
        System.out.println("os = "+os);

        String user = System.getProperty("user.name");
        System.out.println("user = "+user);

        String javaVersion = System.getProperty("java.specification.version");
        System.out.println("javaVersion = "+javaVersion);

        String currentFolder=System.getProperty("user.dr");
        System.out.println("currentFolder = "+currentFolder);
    }

    @Test
    public void systemPropertiesTest2(){
        //properties class which stories properties using key value combination
        Properties properties = System.getProperties();
        String os = properties.getProperty("os.name");
        System.out.println("os = "+os);

       // properties.forEach((k,v) -> System.out.println(k+": "+v));
        System.setProperty("webdriver.chrome.driver","dsfhksdhfks");
        System.out.println(properties.getProperty("url"));
    }
    @Test
    public void readPropertiesFileTest() throws IOException {
        //get the file path
        String path = "config.properties";
        //open the file
        FileInputStream fileInputStream = new FileInputStream(path);
        //load into the local obj
        Properties properties = new Properties();
        //load  --> put the file contects in to the properties object
        properties.load(fileInputStream);
        //read properties from that object
        String url = properties.getProperty("url");
        System.out.println("url = " + url);

        System.out.println(properties.getProperty("driverUserName"));
        System.out.println(properties.getProperty("driverPassword"));
    }
      @Test
        public void readPropertiesTes(){
        String url = Utils.configReader("chrome");
          System.out.println("getDriver: "+getDriver());
        }

}
