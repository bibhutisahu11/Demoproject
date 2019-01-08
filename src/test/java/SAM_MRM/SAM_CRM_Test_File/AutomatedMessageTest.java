package SAM_MRM.SAM_CRM_Test_File;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommonLib.BaseTest;
import CommonLib.CommonLib;
import SAM_MRM.SAM_CRM_Page_File.AutomatedMessage;
import SAM_MRM.SAM_CRM_Page_File.CampaignDesinPage;
import SAM_MRM.SAM_CRM_Page_File.Homepage;
import SAM_MRM.SAM_CRM_Page_File.LoginPage;

public class AutomatedMessageTest extends BaseTest {
	LoginPage objSignin = null;
	CommonLib objCommonLib = null;
	Homepage objhomepage=null;
	AutomatedMessage objAutomatedmssg=null;
	String strUsername, strPassword;

	
	
	@Test(priority=1)
	public void initiateDriver(){
		
		objSignin = new LoginPage(driver);
		objhomepage=new Homepage(driver);
		objCommonLib = new CommonLib(driver);
		objAutomatedmssg=new AutomatedMessage(driver);
		
		
		
	}
	
	@Parameters("browserType")
	@Test(priority=2)
	public void signInvalidPassword(String strBrowserType) throws IOException,InterruptedException{

		WebDriverWait wait;
		objSignin.signIn(strUsername,strPassword, strBrowserType);
		

		/*wait = new WebDriverWait(driver,10);
		wait.until( ExpectedConditions.presenceOfElementLocated((objSignin.lblDisplayName)));

		if(driver.findElement(objSignin.lblDisplayName).isDisplayed()){

			objCommonLib.screenshot();
			AssertJUnit.assertTrue(true);
		}

		else{

			objCommonLib.screenshot();
			AssertJUnit.assertTrue(false);
		}*/
	}
	
	
	@Test(priority=3)
	public void verifyCreateCampaignFunction() throws InterruptedException{
		
		
		/* objAutomatedmssg.clickAutomatedMessage();
		 Thread.sleep(4000);
		 objAutomatedmssg.clickAutomatedCampaignButton();
		 Thread.sleep(2000);
		 objAutomatedmssg.clickCalendar1();
		 
		 Thread.sleep(2000);
		 objAutomatedmssg.clickCalendar2();
		 Thread.sleep(2000);
		 objAutomatedmssg.clickSubmitButton();
		 Thread.sleep(5000);*/
		 
		 
	}
	@Test(priority=4)
	public void verifyAutomatedCampignButton() throws InterruptedException{
		/*objAutomatedmssg.clickAutomatedCampaignButton();
		Thread.sleep(2000);
		//objAutomatedmssg.clickCampaignObjective();
		Thread.sleep(2000);
		objAutomatedmssg.clickCampaignObjective_Options();
		Thread.sleep(2000);
		objAutomatedmssg.clickCampaignRolledBetweenCalendar();
		Thread.sleep(2000);
		objAutomatedmssg.clickCampaignRolledBetweenCalendar2();
		Thread.sleep(2000);
		objAutomatedmssg.Automatedcampaign_clickSubmitButton();
		Thread.sleep(1000);
		objAutomatedmssg.clickCampaignObjective_Options1();
		Thread.sleep(1000);
		objAutomatedmssg.clickCampaignRolledBetweenCalendar();
		Thread.sleep(1000);
		objAutomatedmssg.clickCampaignRolledBetweenCalendar2();
		Thread.sleep(1000);
		objAutomatedmssg.Automatedcampaign_clickSubmitButton();
		Thread.sleep(1000);*/
	}
	@Test(priority=5)
	public void clickLifecycleManagement() throws InterruptedException{
		/*objAutomatedmssg.ClickLifecycle();
		Thread.sleep(1000);
	objAutomatedmssg.clickStatus_All();
		Thread.sleep(1000);
		objAutomatedmssg.clickStatus_Active();
	Thread.sleep(1000);
	objAutomatedmssg.clickStatus_Suspended();
		Thread.sleep(5000);*/
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
	
	/*@Test(priority=4)
	public void VerifyDropDown(){
		
		 objAutomatedmssg.CliCkStatus();
		 
}
	@Test(priority=4)
	public void searchByCampaign(){
		
		 objAutomatedmssg.enteringText();
		 

}
	@Test(priority=5)
public void tearDown(){
	driver.quit();
}*/
	
}}}


