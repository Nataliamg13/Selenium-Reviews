package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplications2 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        //We always have to use "https" to be able to open a browser, "www" we dont
        //have to write it, it will work with and without it as well.
       // driver.get("https://google.com/");

        driver.navigate().to("https://google.com/");
        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);

    }
}
