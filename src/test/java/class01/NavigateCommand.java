package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {
        //create instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.close();

    }
}
