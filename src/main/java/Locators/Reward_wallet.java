package Locators;

import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

import static Utility.Functions.print;




public class Reward_wallet {
    public static AppiumDriver driver;


    public Reward_wallet(AndroidDriver driver) {
        Reward_wallet.driver = driver;
    }

    By rewardIcon = By.xpath("//android.view.ViewGroup[@content-desc='RewardWalletTouchable']/com.horcrux.svg.SvgView/com.horcrux.svg.k/com.horcrux.svg.t[2]");
//    By hamburgerrewardicon = By.xpath(""//android.widget.TextView[@text='₹'])[2]"));
//    By rewardWallet =  By.xpath("//android.widget.TextView[@text=\"Reward Wallet\"]");
    By newUser = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
    By oldUser = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView");
    By balance = By.xpath("//android.widget.TextView[@text, '₹']");
    By availableBalance = By.xpath("//android.widget.TextView[@text='Available Balance']");
    By autoAppliedText = By.xpath("//android.widget.TextView[@text='Reward Wallet is auto applied during checkout']");
    By savingBalance = By.xpath("//android.widget.TextView[@resource-id='strong']");
    By transactionHistory = By.xpath("//android.widget.TextView[@text='Transaction history']");
    By historyScreen = By.xpath("//android.widget.TextView[@text='Reward bonus transactions']");


    //Reward Benefits xpath
    By rewardBenefits = By.xpath("//android.widget.TextView[@text='Reward Wallet Benefits']");
    By staplesText = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
    By staples1 = By.xpath("//android.widget.TextView[@text='Atta & Other Flours']");
    By staples2 = By.xpath("//android.widget.TextView[@text='Pulses']");
    By Staples3 = By.xpath("//android.widget.TextView[@text='Rice']");
    By staples4 = By.xpath("//android.widget.TextView[@text='Oils & Ghee']");
    By staples5 = By.xpath("//android.widget.TextView[@text='Spices']");
    By staples6 = By.xpath("//android.widget.TextView[@text='Sugar & Salt']");
    By staples7 = By.xpath("//android.widget.TextView[@text='Dry Fruits']");

    //Banner 2
    By fNvText = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
    By fNv1 = By.xpath("//android.widget.TextView[@text='Herbs And Seasoning']");
    By fNv2 = By.xpath("//android.widget.TextView[@text='Exotic Veg']");
    By fNv3 = By.xpath("//android.widget.TextView[@text='Organic Veggies']");
    By fNv4 = By.xpath("//android.widget.TextView[@text='Hydroponic']");
    By fNv5 = By.xpath("//android.widget.TextView[@text='Sprouts']");
    By fNv6 = By.xpath("//android.widget.TextView[@text='Cut Veggies']");
    By fNv7 = By.xpath("//android.widget.TextView[@text='Melons']");
    By fNv8 = By.xpath("//android.widget.TextView[@text='Citrus Fruit']");
    By fNv9 = By.xpath("//android.widget.TextView[@text='Banana']");
    By fNv10 = By.xpath("//android.widget.TextView[@text='Exotic Fruits']");
    By fNv11 = By.xpath("//android.widget.TextView[@text='Grapes']");
    By fNv12 = By.xpath("//android.widget.TextView[@text='Apples']");
    By fNv13 = By.xpath("//android.widget.TextView[@text='Fruits']");

    // Reward Bonus
    By rewardBonus = By.xpath("//android.widget.TextView[@text='Reward Wallet bonus awaits you!']");
    By earnNowButton = By.xpath("//android.widget.TextView[@text=' Earn Now ']");
    By referNearnButton = By.xpath("//android.widget.TextView[@text='Refer Now']");
    By referNearnScreen = By.xpath("//android.widget.TextView[@text='REFER & EARN']");
    By cashWalletScreen = By.xpath("//android.widget.TextView[@text='My Wallet']");

    By tNc = By.xpath("//android.widget.TextView[@text='Terms & Conditions:']");
    By clickHereText = By.xpath("//android.widget.TextView[@text='Click Here']");
    By videoPopup = By.xpath("//android.webkit.WebView");
    By videocloseIcon = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
    By videoPlayButton = By.xpath("//android.widget.Button[@text='Play']");



    public void Rewards() throws Exception {

        // Reward Icon Clicked on HomeScreen
        Functions.simpleWait(Constants.WAIT_2);
        Functions.driver.findElement(rewardIcon).click();

          // Hamburger Click
//        Functions.driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='HamburgerMenuTouchable']/com.horcrux.svg.SvgView/com.horcrux.svg.k/com.horcrux.svg.t")).click();
//        print("------Hamburger Clicked------");
//        Functions.simpleWait(Constants.WAIT_2);
//        Functions.driver.findElement(By.xpath(String.valueOf(rewardWallet))).click();

        print("-------- Now will Validate Reward Wallet Screen --------");
        Functions.simpleWait(Constants.WAIT_2);



        //Old User Screen
        try {
            Functions.driver.findElement(availableBalance).isDisplayed();
            print("-------- This Is Old User --------");
            try {
                String available_Text = String.valueOf(Functions.driver.findElement(availableBalance).getText());
                print("Element Output Present on App : " + available_Text);
                String autoApplied_text = String.valueOf(Functions.driver.findElement(autoAppliedText).getText());
                print("Element Output Present on App : " + autoApplied_text);

                //Balance Fetch
//          String Current_Balance = String.valueOf(Functions.driver.findElement(balance));
//           print("Balance : " + Current_Balance);

            } catch (Exception e) {
                print("-------- Available text Not Visible - This is new user Banner Visible --------");
            }


            // Validatating the Saving Amount
            try {
                String savingElement = String.valueOf(Functions.driver.findElement(savingBalance).getText());
                print("Element Present Output from App : " + savingElement);
            } catch (Exception e) {
                print("-------- New User Saving Element not Present --------");

            }

            // Validate transaction button to view history
            try {
                Functions.driver.findElement(transactionHistory).getText();
                print("-------- Transcation History Visible --------");

                Functions.driver.findElement(transactionHistory).click();
                print("-------- Redirected to Transcation History --------");

                Functions.simpleWait(Constants.WAIT_1);
                Functions.driver.findElement(historyScreen).getText();

                // Navigate back to the reward wallet screen
                Functions.driver.navigate().back();
                print("-------- Navigated Back to reward wallet Screen --------");

            } catch (Exception e) {
                print("-------- New User Transcation History Element not Present --------");
                throw new Exception(e);
            }
        }catch (Exception e) {
            print("-------- This is New User --------");
        }


        // Reward Benefits
        Functions.simpleWait(Constants.WAIT_2);
        String benefits = Functions.driver.findElement(rewardBenefits).getText();
        print ("Element Present Output from Reward Benefits : " + benefits);


        // Benefits - 1st Banner
        try {
            Functions.driver.findElement(staplesText).isDisplayed();
            print("-------- Banner 1 Staples Visible --------");

            Functions.driver.findElement(staples1).click();
            print("-------- Redirect To Staples Atta PLP Screen --------");
            Functions.simpleWait(Constants.WAIT_1);

            Functions.driver.navigate().back();
            print("-------- Navigated Back to reward wallet Screen --------");

            Functions.driver.findElement(staples2).click();
            print("-------- Redirect To Staples Pulses PLP Screen --------");
            Functions.simpleWait(Constants.WAIT_1);

            Functions.driver.navigate().back();
            print("-------- Navigated Back to reward wallet Screen --------");

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


        // Benefits - 2nd Banner
        try {
            Functions.driver.findElement(fNvText).isDisplayed();
            print("-------- Banner 2 Staples Visible --------");

            Functions.driver.findElement(fNv1).click();
            print("Redirect To Sub-Catagories Green PLP Screen");
            Functions.simpleWait(Constants.WAIT_1);

            Functions.driver.navigate().back();
            print("-------- Navigated Back to reward wallet Screen --------");

            Functions.driver.findElement(fNv2).click();
            print("Redirect To Sub-Catagories Herbs And Seasoning PLP Screen");
            Functions.simpleWait(Constants.WAIT_1);

            Functions.driver.navigate().back();
            print("-------- Navigated Back to reward wallet Screen --------");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


        try {
            Functions.simpleWait(Constants.WAIT_1);
            String bonusHeading = Functions.driver.findElement(rewardBonus).getText();
            print("Reward Bonus Heading :- " + bonusHeading);
        }
        catch (Exception e) {
        throw new Exception(e);
        }


        // Earn Now
       try {
           Functions.driver.findElement(earnNowButton).click();
           Functions.simpleWait(Constants.WAIT_1);

           Functions.driver.findElement(cashWalletScreen).getText();
           print("-------- Redirected to Cash Wallet Screen --------");

           Functions.driver.navigate().back();
       }
       catch (Exception e) {
           throw new Exception(e);
       }


        //Refer N Earn
        try {
        Functions.driver.findElement(referNearnButton).click();
            Functions.simpleWait(Constants.WAIT_1);

            Functions.driver.findElement(referNearnScreen).isDisplayed();
            print("-------- Redirected to Referral Screen --------");

            Functions.driver.navigate().back();
        }
        catch (Exception e) {
            throw new Exception(e);
        }

        //Scrolled Down
        Functions.scrollToText("Terms & Conditions:");

        try {
            if (Functions.driver.findElement(tNc).isDisplayed()) {
                String TNC = Functions.driver.findElement(tNc).getText();
                print("Heading Visible : " + TNC);
            } else {
                print("-------- Terms and Conditions element is not displayed. --------");
            }
        } catch (Exception e) {
            print("Element not found: " + e.getMessage());
        }

        try {
            boolean clickHere = Functions.driver.findElement(clickHereText).isDisplayed();
            print("Youtube link click here is visible :- " + clickHere);
        } catch (Exception e) {
            print("-------- Click Here Text element is not found. --------");
        }

        Functions.simpleWait(Constants.WAIT_1);
        Functions.driver.findElement(clickHereText).click();



        WebDriverWait wait = new WebDriverWait(Functions.driver, Constants.WAIT_2);
        try {
            WebElement clickherepopup = wait.until(ExpectedConditions.visibilityOfElementLocated(videoPopup));
            if (clickherepopup.isDisplayed()) {
                print("-------- YouTube popup is present. --------");
            } else {
                print("YouTube popup is not displayed.");
            }


            // Example: Checking if the video is playing by verifying the `playing` attribute
            WebElement isPlaying = wait.until(ExpectedConditions.visibilityOfElementLocated(videoPlayButton));
            Functions.simpleWait(Constants.WAIT_2);
            if (isPlaying.isDisplayed()) {
                print("-------- Video is playing. --------");
            } else {
                print("-------- Video is not playing. --------");
            }
        } catch (Exception e) {
            print("YouTube popup element not found: " + e.getMessage());
        }


        Functions.driver.findElement(videocloseIcon).click();
        print("-------- Video Popup Closed --------");


    }
}
