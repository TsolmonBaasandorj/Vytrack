package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = Utils.configReader("browser");
            if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "/Users/Tsolmon/Documents/selenium dependencies/drivers/ChromeDriver");
                driver = new ChromeDriver();
                CucumberUtils.logInfo("==got chrome driver");
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.firefox.driver", "/Users/Tsolmon/Documents/selenium dependencies/drivers/gecko");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("remote")) {
                try {
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    String username = "iCareUri";
                    String accessKey = "b6efebf9-4622-4b0f-b8a2-556f9dd39e77";
//                    String username = "hakuban";
//                    String accessKey = "9bbc95a4-0ae3-43f3-a401-5d8df986cfb9";
                    capabilities.setCapability("browserName", "Chrome");
                    capabilities.setCapability("platform", "Windows 10");
                    capabilities.setCapability("version", "66.0");
                    String url = "http://" + username + ":" + accessKey + "@ondemand.saucelabs.com:80/wd/hub";
                    driver = new RemoteWebDriver(new URL(url), capabilities);
                    return driver;
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }

        }
        return driver;
    }

    public static void closeDriver(){
        driver=null;
    }

}
