package Homework03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.GapContent;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
        WebElement login = driver.findElement(By.cssSelector("input[id='btnLogin']"));
        login.click();
        Thread.sleep(2000);
        /*WebElement text = driver.findElement(By.xpath("span[text()='Password cannot be empty']"));
        System.out.println(text);*/
    }
}
