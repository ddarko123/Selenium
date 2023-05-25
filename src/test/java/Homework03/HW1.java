package Homework03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.findElement(By.cssSelector("input[name = 'first_name']")).sendKeys("Darko");
        driver.findElement(By.cssSelector("input[name = 'last_name']")).sendKeys("Kochovski");
        driver.findElement(By.cssSelector("input[name= 'email']")).sendKeys("darko.kocovski.dk@gmail.com");
        driver.findElement(By.cssSelector("input[data-bv-field='phone']")).sendKeys("123-1234-123");
        driver.findElement(By.cssSelector("input[data-bv-field='address']")).sendKeys("123 Washington St.");
        driver.findElement(By.cssSelector("input[data-bv-field='city']")).sendKeys("Miami");
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("33314");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("wwww.website.com");
        driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("this is a descriptiopn for the project");


    }
}
