package Homework04;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url= "https://www.facebook.com";
        String browser = "chrome";

        openBrowserAndLaunchApplication(url,browser);
        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);
        Select selectYear = new Select(year);
        selectMonth.selectByValue("4");
        selectDay.selectByValue("24");
        selectYear.selectByValue("1994");
    }
}
