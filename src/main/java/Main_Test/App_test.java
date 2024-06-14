package Main_Test;

import Locators.LoginScreen;
import Locators.Reward_wallet;
import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class App_test {
    public static Functions functionCall;
    public static AndroidDriver driver;



    public App_test(AndroidDriver driver) {
        App_test.driver = driver;
    }


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        functionCall = new Functions((AndroidDriver) driver);
        LoginScreen loginScreen = new LoginScreen((AndroidDriver) driver);

        functionCall = new Functions((AndroidDriver) driver);
        Reward_wallet rewardWallet = new Reward_wallet((AndroidDriver) driver);

        // Capabilities
        Functions.Capabilities();
        Functions.simpleWait(Constants.wait_2);

        // Notification Popup
        loginScreen.Allow_Notification_popup();

        // Login
        loginScreen.login();

        //Hamburger


        //Reward Screen










    }


}
