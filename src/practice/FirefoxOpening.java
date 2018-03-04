package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxOpening {
public static void main (String [] args){
	
	System.setProperty("webdriver.gecko.driver","D:\\Selenium jar\\New folder\\geckodriver.exe");
	
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.close();
}
}
