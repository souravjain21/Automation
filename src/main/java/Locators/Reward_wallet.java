package Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Reward_wallet {
    public static AppiumDriver driver;

    public Reward_wallet(AndroidDriver driver) {
        Reward_wallet.driver = driver;
    }

    By Available_balance = By.xpath("//android.widget.TextView[@text='Available Balance']");
    By Saving_balance = By.xpath("//android.widget.TextView[@resource-id='strong']");
    By Transaction_History = By.xpath("//android.widget.TextView[@text='Transaction history']");
    By History_Screen = By.xpath("//android.widget.TextView[@text='Reward bonus transactions']");
    By Reward_Benifits = By.xpath("//android.widget.TextView[@text='Reward Wallet Benefits']");
    By Earn_Now = By.xpath("//android.widget.TextView[@text='Earn Now']");
    By referNearn = By.xpath("//android.widget.TextView[@text='Refer Now']");
    By Cash_Wallet_Screen = By.xpath("//android.widget.TextView[@text='My Wallet']");
    By Staples = By.xpath("//android.widget.TextView[@text='Atta & Other Flours']");
    By ReferNEarnText = By.xpath("//android.widget.TextView[@text='REFER & EARN']");




    public void Rewards() {

        try {
            // Wait for the Reward Wallet screen to load
            WebDriver appiumDriver = driver;
            WebDriverWait wait = new WebDriverWait(appiumDriver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Available Balance']")));



            // Interact with the Reward Wallet screen
            WebElement SavingElement = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='strong']"));
            System.out.println("Saving Balance: " + SavingElement.getText());



            // Validate transaction button to view history
            WebElement transactionButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Transaction history']"));
            transactionButton.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Reward bonus transactions']")));
            System.out.println("Transaction history screen displayed");



            // Navigate back to the reward wallet screen
            driver.navigate().back();


            // Validate banner redirection
            WebElement banner = driver.findElement(By.xpath("//android.widget.TextView[@text='Reward Wallet Benefits']"));
            banner.click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Atta & Other Flours']")));
            System.out.println("Banner redirection screen displayed");


            // Navigate back to the reward wallet screen
            driver.navigate().back();


            // Validate refer and earn button
            WebElement earnNowButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Earn Now']"));
            earnNowButton.click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='My Wallet']")));
            System.out.println("Cash wallet screen displayed");


            // Navigate back to the reward wallet screen
            driver.navigate().back();


            // Validate refer and earn button
            WebElement referAndEarnButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Refer Now']"));
            referAndEarnButton.click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='REFER & EARN']")));
            System.out.println("Refer and earn screen displayed");


            // Navigate back to the reward wallet screen
            driver.navigate().back();


        } finally {
            // Quit the driver session
            driver.quit();
        }
    }
}
