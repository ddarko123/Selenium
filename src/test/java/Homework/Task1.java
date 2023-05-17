package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Darko");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kochovski");
        driver.findElement(By.id("customer.address.street")).sendKeys("601 SE 5TH CT");
        driver.findElement(By.id("customer.address.city")).sendKeys("Fort Lauderdale");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("33301");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-1234-1234");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-12-1234");
        driver.findElement(By.id("customer.username")).sendKeys("ddarko");
        driver.findElement(By.id("customer.password")).sendKeys("itispassword");
        driver.findElement(By.id("repeatedPassword")).sendKeys("itispassword");
        driver.quit();
    }
}
