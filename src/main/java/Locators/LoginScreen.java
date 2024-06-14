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
    By Notification_allow_popup = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']");
    By Login_Signup = By.xpath("//android.widget.TextView[@text='Log in or Sign up']");
    By PhoneNumber = By.xpath("//*[@text='Phone number']");
    By OTP = By.xpath("//android.widget.TextView[@text='Get OTP']");
    By GGLPhone_popup = By.xpath("//android.widget.TextView[@resource-id='com.google.android.gms:id/title']");
    By PhoneNumber_Select = By.xpath("//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/phone_number_list_item']");
    By OTP_Input = By.xpath("//android.widget.EditText[@content-desc='OTPBoxTextInputValue']");
    By OTP_Verify_Button = By.xpath("//android.widget.TextView[@text='Verify']");
    By CrossIcon = By.xpath("//android.widget.ImageView[@content-desc='Cancel']");




    // Notification Allow Popup
    public void Allow_Notification_popup() throws RuntimeException {
        print("Notification Popup Shown");
        try {
            Functions.driver.findElement(Notification_allow_popup).click();
        }
        catch (Exception e) {
            print("Notification PopUp Not Found");
        }
   }


    //Login Code Starts
    public void login() {

        Functions.simpleWait(Constants.wait_2);
        String Heading = Functions.driver.findElement(Login_Signup).getText();
        print(Heading);


        Functions.driver.findElement(PhoneNumber).click();
        print("Number Field Clicked");

        // Google Phone Number Popup
//        try {
//            Functions.simpleWait(Constants.wait_1);
//            if (Functions.driver!=null) {
                Functions.driver.findElement(GGLPhone_popup).isDisplayed();
//                print("Google_Choose_Phone_Number");
//                Functions.driver.findElement(PhoneNumber_Select).click();
//            }
//        } catch (Exception Popup_Google) {
//            print("Google_phone_popup_not_visible");
//        }

        // Manual Login
        Functions.simpleWait(Constants.wait_2);
        Functions.driver.findElement(CrossIcon).click();
        Functions.simpleWait(Constants.wait_2);
        print("Cross icon clicked");
        Functions.driver.findElement(PhoneNumber).sendKeys((CharSequence)Constants.Phone_number);


        // OTP Entered
        try {
          Functions.driver.findElement(OTP).click();
          print("Clicked On OTP Button ");
          Functions.simpleWait(Constants.wait_2);
            if (Functions.driver != null) {
                Functions.driver.findElement(OTP_Input).sendKeys(Constants.OTP);
                Functions.driver.findElement(OTP_Verify_Button).click();
                print("Login Successfull with Manual OTP");
            }
            else {
                print("Login With Auto Fetch Successfully");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }





    }
    
    

}

