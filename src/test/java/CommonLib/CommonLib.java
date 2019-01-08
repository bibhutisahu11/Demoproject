package CommonLib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import au.com.bytecode.opencsv.CSVReader;

public class CommonLib{

	WebDriver driver;
	public By toaster = By.xpath("//div[@class='toast-message']");

	public CommonLib(WebDriver driver){

		this.driver = driver;
	}

	/*public List<String[]> getDataFromCSV(String csvpath) throws IOException{
		// This will load csv file 
		CSVReader reader;
		List<String[]> li = null;
		try {

			reader = new CSVReader(new FileReader(csvpath));

			// this will load content into list
			li=reader.readAll();


			System.out.println("Total rows which we have is "+li.size());

		// create Iterator reference
		Iterator<String[]>i1= li.iterator();

		// Iterate all values 
		while(i1.hasNext()){

			String[] str=i1.next();

			System.out.print(" Values are ");

			for(int i=0;i<str.length;i++)
			{

				System.out.print(" "+str[i]);

			}
				System.out.println("   ");

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li; 

	}*/

public void sessionOverride(WebDriver driver){

	WebDriverWait wait;
	 driver = null;
	wait = new WebDriverWait(driver,10);
	try{
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();

		System.out.println("alert present");
	}
	catch (Exception e){
		System.out.println("No alert");
		}	}

	public void screenshot(){

		// System.out.println("Taking the screenshot.");   
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentdir=System.getProperty("user.dir");
		try {
			FileUtils.copyFile(scrFile, new File(currentdir+"/screenshots/" +System.currentTimeMillis()+ ".png"));
	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
public void clickElement(By ele){

		try{

			new WebDriverWait(driver,10).until( ExpectedConditions.presenceOfElementLocated(ele));
			driver.findElement(ele).click();
		}

		catch(StaleElementReferenceException e){

			System.out.println("Trying to find again");
			driver.findElement(ele).click();

		}

		catch (TimeoutException toe) {
			System.out.println("Element identified by " + ele.toString() + " was not clickable after 10 seconds");

		}

	} 


	


	
	public void enterText(By ele, String text){

		try{

			new WebDriverWait(driver,10).until( ExpectedConditions.presenceOfElementLocated(ele));
			driver.findElement(ele).click();
			driver.findElement(ele).clear();
			driver.findElement(ele).sendKeys(text);
		}

		catch(StaleElementReferenceException e){

			driver.findElement(ele).click();
			driver.findElement(ele).clear();
			driver.findElement(ele).sendKeys(text);
		}

		catch (TimeoutException toe) {
			System.out.println("Element identified by " + ele.toString() + " was not clickable after 10 seconds");
		}}
	
	
		public void eleClick(By ele){
			driver.findElement(ele).click();

		}
		public void actionClick(By ele){
			try{
			Actions act=new Actions(driver);
			act.click();
		}
			catch(Exception e){
				System.out.println("exception occured "+e);
			}}
	
public boolean checkboxSelected(By ele){
	boolean status=driver.findElement(ele).isSelected();
	return status;
}

}

	/*
	public String getMessageFromToaster(){

		try{


			new WebDriverWait(driver,20).until( ExpectedConditions.presenceOfElementLocated(toaster));
			return driver.findElement(toaster).getText();

		}

		catch(StaleElementReferenceException e){

			return driver.findElement(toaster).getText();
		}

		catch (TimeoutException toe) {

			//System.out.println("Element identified by " + toaster.toString() + " was not clickable after 10 seconds");
			return "Element identified by " + toaster.toString() + " was not clickable after 10 seconds";
		}

	} */


