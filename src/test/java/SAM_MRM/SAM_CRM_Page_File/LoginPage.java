package SAM_MRM.SAM_CRM_Page_File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.media.jfxmedia.logging.Logger;

import CommonLib.CommonLib;
import CommonLib.ReadingPropertyFile;
import ExtentReport.ExtentManager;

public class LoginPage {

	WebDriver driver;
	CommonLib objCommonLib = null;
	
	
public By btnOpenSignIn = By.xpath("//div[@title='Signin']");
	
	public By txtUserName = By.xpath("//input[@id='mat-input-0']");
	public By txtPassword = By.xpath("//input[@id='mat-input-1']");
	public By btnSignIn = By.xpath("//span[@class='mat-button-wrapper']");
	
	public By lblBlankUsernameErrorMessage = By.xpath("//*[@id='mat-error-0']");
	public By lblBlankPasswordErrorMessage = By.xpath("//*[@id='mat-error-1']");
	//public By lblDisplayName = By.xpath("//i[contains(text(),' Sonu Kumar ')]");
	public By btnProfileIcon = By.xpath("//button[@class='mat-icon-button']");
	public By btnSignOut = By.xpath("//ul/li[3]/a");
	
	

	public LoginPage(WebDriver driver){


		this.driver = driver;
		objCommonLib = new CommonLib(driver);
	}

public String getLblErrorMessage(By ele) throws InterruptedException {
		
		try{
			
			Thread.sleep(1000);
			new WebDriverWait(driver,20).until( ExpectedConditions.presenceOfElementLocated(ele));
			return    driver.findElement(ele).getText();
		}
		
		catch (StaleElementReferenceException e){
			
			return    driver.findElement(ele).getText();
		}
		
		catch (TimeoutException toe) {

			return "Element identified by " + ele.toString() + " was not identified after 10 seconds";
		}
		
	}
public void openSignInPopup() {
	
	objCommonLib.clickElement(btnOpenSignIn);

	
}




public void signIn(String userName, String password, String strBrowserType){

	if(strBrowserType.equalsIgnoreCase("chrome")){

		userName=ReadingPropertyFile.prop.getProperty("username"); 
		password=ReadingPropertyFile.prop.getProperty("password");

	}
	else if(strBrowserType.equalsIgnoreCase("firefox")){

		userName=ReadingPropertyFile.prop.getProperty("username"); 
		password=ReadingPropertyFile.prop.getProperty("password");

	} 

	else if(strBrowserType.equalsIgnoreCase("internet explorer")){

		userName=ReadingPropertyFile.prop.getProperty("username"); 
		password=ReadingPropertyFile.prop.getProperty("password");

	}
	objCommonLib.enterText(txtUserName, userName);
	objCommonLib.enterText(txtPassword, password);
	objCommonLib.clickElement(btnSignIn);
	
}

public void signInWithoutBrowserType(String userName, String password) throws InterruptedException{
	
	objCommonLib.enterText(txtUserName, userName);
	Thread.sleep(2000);
	objCommonLib.enterText(txtPassword, password);
	Thread.sleep(2000);
	objCommonLib.clickElement(btnSignIn);		
}
public void signOut(){

	objCommonLib.clickElement(btnProfileIcon);
	objCommonLib.clickElement(btnSignOut);

}

}
