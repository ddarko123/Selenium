package Homework06;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class task2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";

        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement newUserBtn = driver.findElement(By.xpath("//button[@id='save']"));
        newUserBtn.click();



        WebElement text = driver.findElement(By.xpath("//p[starts-with(text(),'First Name ')]"));

        String fname = text.getText();
        System.out.println(fname);
        driver.close();
    }
}
