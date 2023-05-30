package Homework04;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url ="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement DD = driver.findElement(By.cssSelector("select.form-control"));

        Select select = new Select(DD);
        select.selectByValue("Tuesday");
        Thread.sleep(2000);
        select.selectByValue("Thursday");
        Thread.sleep(2000);
        select.selectByValue("Friday");
        Thread.sleep(2000);
    }

}
