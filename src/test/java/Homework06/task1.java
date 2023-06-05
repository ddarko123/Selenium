package Homework06;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class task1 extends CommonMethods {
    public static void main(String[] args) {
        String path = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(path, browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement text = driver.findElement(By.xpath("//h4[normalize-space()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.textToBePresentInElement(text,"Welcome Syntax Technologies"));
        var welcomeText = text.getText();
        System.out.println(welcomeText);
        driver.close();


    }
}