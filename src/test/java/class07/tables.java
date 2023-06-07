package class07;

import Utilies.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.time.Duration;
import java.util.List;

public class tables extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);
//*************table level acess************************
        WebElement wholeTable = driver.findElement(By.xpath("//table[@id='customers']"));
       String allText = wholeTable.getText();
        System.out.println(allText);

        System.out.println("******************************************");
        //*****************row level access of table***********************

        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:allRows) {
            String rowText = row.getText();
            if (rowText.contains("Google")) {
            System.out.println(rowText);
        }}
        System.out.println("--------------------------------------------");
        //**********column level access***********
       List <WebElement> allCellData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement cell:allCellData) {
            String cellData = cell.getText();
            System.out.println(cellData);
        }


    }
}