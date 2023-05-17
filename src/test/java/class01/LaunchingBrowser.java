package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        //navigate to google.com
//declare the instance
        WebDriver driver = new ChromeDriver();
        // use .get(url) to navigate to the desired url
        driver.get("https://www.google.com");

        //maximize the window
        driver.manage().window().maximize();

        //get current url
        String currentURL=driver.getCurrentUrl();
        //print on the console
        System.out.println("the current url of the webiste is "+currentURL);

        //get the title of the opage
        String title=driver.getTitle();

        //print title on the console
        System.out.println("the title of the page is "+title);

//add some wait time
        Thread.sleep(5000);


//close the web broswer
        driver.quit();

    }
}
