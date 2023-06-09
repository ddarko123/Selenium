package class04;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonDemo2 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-radiobutton-demo.php", "chrome");

        //get all the radio buttons associated with age group using driver.findElements

        List<WebElement> ageGroup = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        String option ="5 - 15";

        for(WebElement age:ageGroup) {
            String value=age.getAttribute("value");
            if (value.equals(option)) {
                age.click();
                break;
            }
        }
    }
}
