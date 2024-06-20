package Locators;

import Utility.Functions;
import Utility.Constants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static Utility.Functions.print;


public class LoginScreen {
    public static AppiumDriver driver;

    public LoginScreen(AndroidDriver driver) {
        LoginScreen.driver = driver;
    }

    // Xpaths Defined
    By notificationAllowpopup = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']");
    By loginSignup = By.xpath("//android.widget.TextView[@text='Log in or Sign up']");
    By phoneNumber = By.xpath("//*[@text='Phone number']");
    By otp = By.xpath("//android.widget.TextView[@text='Get OTP']");
    By gogglePhonepopup = By.xpath("//android.widget.TextView[@resource-id='com.google.android.gms:id/title']");
    By phoneNumberselect = By.xpath("//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/phone_number_list_item']");
    By otpInput = By.xpath("//android.widget.EditText[@content-desc='OTPBoxTextInputValue']");
    By otpVerifybutton = By.xpath("//android.widget.TextView[@text='Verify']");
    By crossIcon = By.xpath("//android.widget.ImageView[@content-desc='Cancel']");




    // Notification Allow Popup
    public void allow_notification_popup() throws RuntimeException {
        print("-------- Notification Popup Shown --------");
        try {
            Functions.driver.findElement(notificationAllowpopup).click();
        }
        catch (Exception e) {
            print("-------- Notification PopUp Not Found --------");
        }
   }


    //Login Code Starts
    public void login() {

        Functions.simpleWait(Constants.WAIT_1);
        String Heading = Functions.driver.findElement(loginSignup).getText();
        print("Element Present on App :" + Heading);


        Functions.driver.findElement(phoneNumber).click();
        print("-------- Number Field Clicked --------");

        // Google Phone Number Popup
//        try {
//            Functions.simpleWait(Constants.wait_1);
//            if (Functions.driver!=null) {
//                Functions.driver.findElement(gogglePhonepopup).isDisplayed();
//                print("------Google_Choose_Phone_Number------");
//                Functions.driver.findElement(PhoneNumber_Select).click();
//            }
//        } catch (Exception Popup_Google) {
//            print("------Google_phone_popup_not_visible------");
//        }

        // Manual Login
        Functions.simpleWait(Constants.WAIT_2);
        Functions.driver.findElement(crossIcon).click();
        Functions.simpleWait(Constants.WAIT_2);
        print("-------- Google Popup Cross icon clicked --------");
        Functions.driver.findElement(phoneNumber).sendKeys(Constants.Phone_number);


        // OTP Entered
        try {
          Functions.driver.findElement(otp).click();
          print("-------- Clicked On OTP Button --------");
          Functions.simpleWait(Constants.WAIT_1);
            if (Functions.driver != null) {
                Functions.driver.findElement(otpInput).sendKeys(Constants.OTP);
                Functions.driver.findElement(otpVerifybutton).click();
                print("-------- Login Successfull with Manual OTP --------");
            }
            else {
                print("-------- Login with Auto Fetch Successfully --------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}

