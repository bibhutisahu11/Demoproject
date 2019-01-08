package SAM_MRM.SAM_CRM_Test_File;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SAM_MRM.SAM_CRM_Page_File.*;
import CommonLib.BaseTest;
import CommonLib.CommonLib;
import CommonLib.ReadingPropertyFile;

public class LoginTest extends BaseTest{

	
	
	String strErrorMessage;
	LoginPage objSignin = null;
	CommonLib objCommonLib = null;
	String strUsername, strPassword;



	public LoginTest(){

		objCommonLib = new CommonLib(driver);
	}
	@Test(priority=1)
	public void initiateDriver(){
		
		objSignin = new LoginPage(driver);
	}
	
	@Parameters("browserType")
	@Test(priority=3)
	public void signInvalidPassword(String strBrowserType) throws IOException,InterruptedException{

		WebDriverWait wait;
		objSignin.signIn(strUsername,strPassword, strBrowserType);
		Thread.sleep(4000);

		/*wait = new WebDriverWait(driver,40);
		wait.until( ExpectedConditions.presenceOfElementLocated((objSignin.lblDisplayName)));

		if(driver.findElement(objSignin.lblDisplayName).isDisplayed()){

			
			Assert.assertTrue(true);
		}

		else{

			
			Assert.assertTrue(false);
		}*/
		
	}
	
	
	@Test(priority=2)
	public void signInWithBlankIdAndPassword() throws InterruptedException{

		strUsername=ReadingPropertyFile.prop.getProperty("credentials_blank"); 
		strPassword=ReadingPropertyFile.prop.getProperty("credentials_blank");

		objSignin.signInWithoutBrowserType(strUsername,strPassword);
		

		/*strErrorMessage=objSignin.getLblErrorMessage(objSignin.lblBlankUsernameErrorMessage);

		if(strErrorMessage.contains(ReadingPropertyFile.prop.getProperty("usernameBlankMessage"))){

			
			Assert.assertTrue(false);
		}
		else{

			
			Assert.assertTrue(true);
		}*/
	}
	
	

	@Test(priority=4)
	public void signOut() throws InterruptedException{
Thread.sleep(2000);
		objSignin.signOut();
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	
	
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
		try{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshots/"+result.getName()+".png"));
		}
		catch(Exception e){
			System.out.println("Exception while taking screenshot"+e.getMessage());
			
		}
}}}

	
	