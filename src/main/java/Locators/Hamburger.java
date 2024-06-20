//package Locators;
//
//import io.appium.java_client.MobileElement;
//
//public class Hamburger {
//
//
//
//        public hamburgerMenu() {
//            AppiumDriver<MobileElement> driver;
//
//            try {
//                driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
//
//                // Locate the hamburger menu button and click it
//                MobileElement hamburgerMenuButton = driver.findElement(By.id("your.hamburger.menu.button.id"));
//                hamburgerMenuButton.click();
//
//                // Locate the menu items
//                List<MobileElement> menuItems = driver.findElements(By.id("your.menu.item.id"));
//
//                // Validate and print the menu items
//                for (MobileElement menuItem : menuItems) {
//                    String itemName = menuItem.getText();
//                    System.out.println("Menu Item: " + itemName);
//                    // Additional validation can be performed here
//                }
//
//                driver.quit();
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//}
