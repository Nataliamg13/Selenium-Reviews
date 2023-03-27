package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureURL {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");// If we want to capture the Title
       String pageUrl= driver.getCurrentUrl();
        System.out.println("Page URL : "+pageUrl);//if we want to capture and print URL

    }
}
