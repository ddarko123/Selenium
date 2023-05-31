package Homework05;

import Utilies.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url= "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser ="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();
        Thread.sleep(3000);
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.sendKeys("sending keys...");
        confirmationAlert.accept();
    }
}
