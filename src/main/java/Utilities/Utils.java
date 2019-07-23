package Utilities;

import java.io.FileReader;
import java.io.IOException;
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









    public void waitSec(long length){
        try {
            Thread.sleep(length*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
///Users/Tsolmon/IdeaProjects/vytrackCukesautomation/config.properties