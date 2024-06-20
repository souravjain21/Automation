package Utility;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class Functions {
    public static AndroidDriver driver;
    static DesiredCapabilities caps;

    public Functions(AndroidDriver driver) {

    }


    //Print Statement
    public static void print(String val) {
        System.out.println(val);
    }


    // Desired_Capabilities
    public static void Capabilities() throws MalformedURLException {
        print("------- App Starting ------------");
        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("version", "14.0");
        caps.setCapability("appPackage", "com.otipy.otipy");
        caps.setCapability("appActivity", "com.otipy.otipy.MainActivity");
        caps.setCapability("adbExecTimeout", 60000); // Increase the timeout to 60 seconds
        caps.setCapability("newCommandTimeout", 300);


        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, caps);
        print("------- App Opened Successfully ------------");
    }


    // Simple Wait
    public static void simpleWait(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void scrollToText(String searchText) {
        try {
            Functions.driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + searchText + "\"))"));
        } catch (Exception e) {
            List<WebElement> elements = Functions.driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + searchText + "\")"));
            if (elements.size() == 0) {
                print("Element with text '" + searchText + "' not found.");
            }
        }


    }
}
