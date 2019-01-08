package SAM_MRM.SAM_CRM_Test_File;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SAM_MRM.SAM_CRM_Page_File.Homepage;
import SAM_MRM.SAM_CRM_Page_File.LoginPage;
import CommonLib.BaseTest;
import CommonLib.CommonLib;

public class HomepageTest extends BaseTest{
	
	LoginPage objSignin = null;
	CommonLib objCommonLib = null;
	Homepage objhomepage=null;
	String strUsername, strPassword;

	
	
	@Test(priority=1)
	public void initiateDriver(){
		
		objSignin = new LoginPage(driver);
		objhomepage=new Homepage(driver);
		objCommonLib = new CommonLib(driver);
		
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
			Assert.assertTrue(true);
		}

		else{

			objCommonLib.screenshot();
			Assert.assertTrue(false);
		}*/
		
	
	}
	@Test(priority=3)
	public void verifyCampaignDesinLogo() throws InterruptedException{
		objhomepage.clickCampaignDesign();
		Thread.sleep(2000);
	
	}
	@Test(priority=4)
	public void navigate(){
		driver.navigate().back();
		
	}
	@Test(priority=5)
	public void verifyClickAutomatedMssg() throws InterruptedException{
		objhomepage.clickAutomatedMsg();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void toggleChinese() throws InterruptedException{
		objhomepage.clickToggle();
		Thread.sleep(5000);
	}

	@Test(priority=7)
	public void ChineseTextVerification(){
		objhomepage.textChinese();
	System.out.println("assertion successful");
		
		
	}
	@Test(priority=8)
	public void verifyToggleEnglish() throws InterruptedException{
		objhomepage.clickToggle();
		Thread.sleep(5000);}
	
	@Test(priority=9)
	public void toggleAssert1(){
		objhomepage.textEnglish();
	System.out.println("assertion successful");
		
	}
	@Test(priority=10)
	public void editUser() throws InterruptedException{
		objhomepage.clickOntheUser();
		Thread.sleep(2000);
		objhomepage.clickEditUser();
		Thread.sleep(4000);
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
	
	
