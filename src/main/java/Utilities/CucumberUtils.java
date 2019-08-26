package Utilities;

import Step_definition.Hooks;


public class CucumberUtils {


//    public static void logPass(String msg,boolean screenshot){
//        Hooks.currentScenario.write(msg);
//        if(screenshot){
//            Utils.screenshot();
//        }
//        Assert.assertTrue(true);
//    }
//
//    public static void logFail(String msg,boolean screenshot) {
//        Hooks.currentScenario.write(msg);
//        if(screenshot){
//            Utils.screenshot();
//        }
//        Assert.assertTrue(false);
//    }

    public static void logInfo(String msg) {
        Hooks.currentScenario.write(msg);
    }

}
