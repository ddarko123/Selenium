package Homework08;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class task1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[normalize-space()='Recruitment']"));
        recruitmentBtn.click();

        WebElement calendarBtn = driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
        calendarBtn.click();

        WebElement ddMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(ddMonth);
        select.selectByValue("3");

        WebElement ddYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1 = new Select(ddYear);
        select1.selectByValue("1994");

        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[7]")).click();
    }
}
