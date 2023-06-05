package class06;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {

        String url="http://accounts.google.com/signup";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement helpbtn=driver.findElement(By.linkText("Help"));
        helpbtn.click();

        WebElement privactyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privactyBtn.click();

        String mainPageHandle=driver.getWindowHandle();
        System.out.println("main page handle is : "+mainPageHandle);


        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles) {
            driver.switchTo().window(handle);
            String title=driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) {
                break;
            }

        }
        System.out.println("the current page udner focus is : "+driver.getTitle());

        driver.switchTo().window(mainPageHandle);
        System.out.println("the focus is on "+driver.getTitle());
    }
}
