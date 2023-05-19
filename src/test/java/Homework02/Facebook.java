package Homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement newaccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        newaccount.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Darko");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kochovski");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("darko.kocovski.dk@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("darko.kocovski.dk@gmail.com");
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("abracadabra");
        driver.findElement(By.xpath("//option[text()='Apr']")).click();
        driver.findElement(By.xpath("//option[text()='24']")).click();
        driver.findElement(By.xpath("//option[text()='1994']")).click();
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        driver.quit();

    }
}
