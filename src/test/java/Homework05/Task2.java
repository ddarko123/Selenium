package Homework05;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        //WebElement frame1 = driver.findElement(By.xpath("//body[1]"));
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(dd);
        select.selectByValue("babycat");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//input[1]"));
        textBox.sendKeys("sending keys....");
    }
}
