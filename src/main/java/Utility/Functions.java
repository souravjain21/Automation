package Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Functions {
    public static AndroidDriver driver;
    static DesiredCapabilities caps;

    public Functions(AndroidDriver driver){

    }



    //Print Statement
    public static void print (String val) {
        System.out.println(val);
    }




    // Desired_Capabilities
    public static void Capabilities() throws MalformedURLException {
        print("-------App Starting------------");
        caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
        caps.setCapability("udid", "RFCT40ZNY5X");
        caps.setCapability(MobileCapabilityType.APP_PACKAGE, "com.otipy.otipy");
        caps.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.otipy.otipy.MainActivity");

        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, caps);
        print("-------App Opened Successfully ------------");
    }



    // Simple Wait
    public static void simpleWait(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }






}
