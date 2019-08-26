package Utilities;

import Step_definition.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.internal.WrapsDriver;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class Utils {
    public static String configReader(String key){
        Properties p = new Properties();
        try {
            FileReader file = new FileReader("/Users/Tsolmon/IdeaProjects/vytrackCukesautomation/config.properties");
            p.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p.getProperty(key);
    }


    public WebElement highlight(WebElement element){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid yellow;');", element);
//        //'background: yellow;
for(int i=0; i<2; i++) {
    WrapsDriver wrappedElement = (WrapsDriver) element;
    JavascriptExecutor executor = (JavascriptExecutor) wrappedElement.getWrappedDriver();
    waitSec(0.4);
    executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: purple; border: 2px solid LightCyan;background: PaleTurquoise ;");
    waitSec(0.4);
    executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");

}
return element;
    }





    /* This is a helper method for waitElementVisible() method */
    private boolean elementDisplayed(String xpath){
        try {
            WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
            return element.isDisplayed();
        }catch(Exception e){
            return false;
        }
    }

    public void waitElementVisible(String xpath){
        boolean displayed=false;
        for(int i=0; i<30 && !displayed; i++){
            displayed= elementDisplayed(xpath);
            System.out.println("Waiting for the element..."+xpath);
            waitSec(1);
        }
        if(displayed) {
            System.out.println("Element is displayed");
        }else{
            System.out.println("Element is not displayed after loooong wait");
        }

    }



    public void waitSec(double length){
        long sleep= (long) (1000*length);
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void screenshot(){

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        Hooks.currentScenario.embed(screenshot, "image/png");
    }


    public static void logInfo(String msg, boolean screenshot){
        LocalDateTime time=LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm:ss");
        String formattedDate = formatter.format(time);
        Hooks.currentScenario.write("\n"+formattedDate+" INFO: "+msg);
        if(screenshot){
            screenshot();
        }

    }


    public boolean verifyOrder(List<String> valueList, String orderType) {
        String temp = "";
        boolean inOrder = false;
        if (orderType.equalsIgnoreCase("ascending")) {
            temp = "";
            for (String each : valueList) {
                if (each.compareTo(temp) < 0) {
                    Utils.logInfo("List is not " + orderType + " order as expected. | " + temp + " : " + each, false);
                    return false;
                }
                temp = each;
            }

        } else {
            temp = "zzzz";
            for (String each : valueList) {
                if (each.compareTo(temp) > 0) {
                    Utils.logInfo("List is not " + orderType + " order as expected. | " + temp + " : " + each, false);
                    return false;
                }
                temp = each;

            }
        }
        return true;
    }


}
///Users/Tsolmon/IdeaProjects/vytrackCukesautomation/config.properties