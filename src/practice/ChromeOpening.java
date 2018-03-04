package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOpening {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\New folder\\chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.close();

	}

}
