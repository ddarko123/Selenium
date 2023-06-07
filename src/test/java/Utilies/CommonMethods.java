package Utilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication (String url, String browser) {

        switch (browser) {
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                    driver=new FirefoxDriver();
                    break;

        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

   }

   public static void closeBrowser(){
        if (driver!=null) {
        driver.quit();
        }
   }

   public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
   }

   public static void dropDownByValue (WebElement element,String value) {
        Select select = new Select(element);
        select.selectByValue(value);
   }
}
