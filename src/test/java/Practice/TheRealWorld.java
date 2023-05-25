package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TheRealWorld {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://thereal-world.com/");

        WebElement login = driver.findElement(By.xpath("//div [@class='btn ghost small-btn menu']"));
        login.click();
        WebElement createAccount=driver.findElement(By.xpath("//button [@class='btn normal-case font-normal btn-lg btn-ghost btn-block']"));
        createAccount.click();
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement allLink : allLinks) {
            String links = allLink.getAttribute("href");
            System.out.println(links);
        }


    }
}
