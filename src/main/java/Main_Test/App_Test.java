package Main_Test;

import Locators.LoginScreen;
import Locators.Reward_wallet;
import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class App_Test {
    public static Functions functionCall;
    public static AndroidDriver driver;



    public App_Test(AndroidDriver driver) {
        App_Test.driver = driver;
    }


    public static void main(String[] args) throws Exception {


        functionCall = new Functions((AndroidDriver) driver);
        LoginScreen loginScreen = new LoginScreen((AndroidDriver) driver);
        Reward_wallet rew = new Reward_wallet((AndroidDriver) driver);


        // Capabilities
        Functions.Capabilities();
        Functions.simpleWait(Constants.WAIT_2);

        // Notification Popup
        loginScreen.allow_notification_popup();

        // Login
        loginScreen.login();

        //Hamburger


        //Reward Screen
        rew.Rewards();
        Functions.simpleWait(Constants.WAIT_2);

        Functions.driver.quit();
















    }


}
