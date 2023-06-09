package class08;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTable2 extends CommonMethods {
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
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < allIDs.size(); i++) {
            String id = allIDs.get(i).getText();
            int rowNumber = (i+1);
            if (id.equals("53502A")) {
                System.out.println("click on the check box row number "+rowNumber);
                WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr["+rowNumber+"]/td[1]"));
                checkBox.click();
            }
        }


    }
}
