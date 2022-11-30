package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation {
public static void main(String[] args) {
//	System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe\\");
//  WebDriver driver=new FirefoxDriver();
//
//    driver.get("https:\\www.makemytrip.com");
    

System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver_win32\\chromedriver.exe\\");

 WebDriver driver=new ChromeDriver();
 driver.get("https://www.makemytrip.com");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
 WebElement login=driver.findElement(By.xpath("//p[text()='Login or Create Account']"));
 login.click();
}









}
