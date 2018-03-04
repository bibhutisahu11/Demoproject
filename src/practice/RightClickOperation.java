package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement ele=driver.findElement(By.xpath("//a[@href='/kids'][1]"));
		Actions actions=new Actions(driver);
		actions.contextClick(ele).perform();
		
		

	}

}
