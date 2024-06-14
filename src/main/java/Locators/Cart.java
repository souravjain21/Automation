package Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

import static Utility.Functions.print;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cart {
    public static AppiumDriver driver;


    static void permissioncontroller(AndroidDriver driver) {
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
    }


    public static void main(String[] args) throws InterruptedException, MalformedURLException {


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
        caps.setCapability("udid", "f665170f");
        caps.setCapability(MobileCapabilityType.APP_PACKAGE, "com.otipy.otipy");
        caps.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.otipy.otipy.MainActivity");

        URL url = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(url, caps);
        System.out.println("Started The Application");
        Thread.sleep(2000);
        try {
            Thread.sleep(2000);
            permissioncontroller((AndroidDriver) driver);
            print("Popup Clicked");
        } catch (Exception App_notify_permission) {
            print("Popup Not Found");
        }


        Thread.sleep(2000);
        WebDriver appiumDriver = driver;
        WebDriverWait wait = new WebDriverWait(appiumDriver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Log in or Sign up']")));

        String login = appiumDriver.findElement(By.xpath("//*[@text='Log in or Sign up']")).getText();
        print("Text Available -> " + login);

        Thread.sleep(3000);

        driver.findElementByXPath("//android.widget.TextView[@text='Phone number']").click();
        print("Number Field Clicked");
        WebDriverWait wait1 = new WebDriverWait(appiumDriver, 5);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//android.widget.TextView[@resource-id='com.google.android.gms:id/title']"))).isDisplayed();
        print("Google popup Shown");
        try {
            driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.google.android.gms:id/title']")).isDisplayed();
            print("Google_Choose_Phone_Number");
            driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/phone_number_list_item']")).click();
        } catch (Exception Popup_Google) {
            print("Google_phone_popup_not_visible");
            throw new RuntimeException(Popup_Google);
        }
        {
            Thread.sleep(9000);
            driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/phone_number_list_item']")).click();
            print("Google Phone Number selected");
        }

        //OTP Entered
        try {
            driver.findElement(By.xpath("//android.widget.TextView[@text='Get OTP']")).click();
            print("OTP Session Clicked");
        } catch (Exception LimitExceededException) {
            print("Limit Exceed");
            throw new RuntimeException(LimitExceededException);
        }

        //Dashboard Flash deal check
        try {
            driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"span\" and @text=\"Flash Deals (any 4, on orders of ₹149+)\"]"));

        } catch (Exception Flash_deal_not_present) {
            print("Flash deal_not visible");
            throw new RuntimeException(Flash_deal_not_present);
        }

        //Dashboard scroll
//        try {
//            driver.findElementByXPath("//*[contains(@text,'Views')]").click();
//            //Creating an object of the touch action class
//            TouchAction action = new TouchAction(driver);
//            //Using PointOption class to specify the co-ordinates for touch action
//            PointOption pointStart = PointOption.point(0, 700);
//            PointOption pointEnd = PointOption.point(0, 100);
//            //Performing touch action, press at the start point and moving it till end point
//            action.press(pointStart).moveTo(pointEnd).release().perform();
//            //Click on the Display Tab
//            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Display\")")).click();
//
//        }




    }


    public static void login (){

        try {
            Thread.sleep(2000);
            permissioncontroller((AndroidDriver) driver);
            print("Popup Clicked");
        } catch (Exception App_notify_permission) {
            print("Popup Not Found");
        }


//        simpleWait(2000);
        WebDriver appiumDriver = driver;
        WebDriverWait wait = new WebDriverWait(appiumDriver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Log in or Sign up']")));

        String login = appiumDriver.findElement(By.xpath("//*[@text='Log in or Sign up']")).getText();
        print("Text Available -> " + login);

//        simpleWait(2000);

        driver.findElementByXPath("//android.widget.TextView[@text='Phone number']").click();
        print("Number Field Clicked");
        WebDriverWait wait1 = new WebDriverWait(appiumDriver, 5);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//android.widget.TextView[@resource-id='com.google.android.gms:id/title']"))).isDisplayed();
        print("Google popup Shown");
        try {
            driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.google.android.gms:id/title']")).isDisplayed();
            print("Google_Choose_Phone_Number");
            driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/phone_number_list_item']")).click();
        } catch (Exception Popup_Google) {
            print("Google_phone_popup_not_visible");
            throw new RuntimeException(Popup_Google);
        }
        {
//            simpleWait(2000);
            driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/phone_number_list_item']")).click();
            print("Google Phone Number selected");
        }

        //OTP Entered
        try {
            driver.findElement(By.xpath("//android.widget.TextView[@text='Get OTP']")).click();
            print("OTP Session Clicked");
        } catch (Exception LimitExceededException) {
            print("Limit Exceed");
            throw new RuntimeException(LimitExceededException);
        }


    }
}

















