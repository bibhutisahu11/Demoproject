package SAM_MRM.SAM_CRM_Test_File;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

import SAM_MRM.SAM_CRM_Page_File.CampaignDesinPage;
import SAM_MRM.SAM_CRM_Page_File.Homepage;
import SAM_MRM.SAM_CRM_Page_File.LoginPage;
import CommonLib.BaseTest;
import CommonLib.CommonLib;
import ExtentReport.ExtentManager;

public class CampaignDesignTest extends BaseTest {
	LoginPage objSignin = null;
	CommonLib objCommonLib = null;
	Homepage objhomepage=null;
	CampaignDesinPage objcampdesign=null;
	String strUsername, strPassword;
	ExtentManager extent;

	
	
	@Test(priority=1)
	public void initiateDriver(){
		
		objSignin = new LoginPage(driver);
		objhomepage=new Homepage(driver);
		objCommonLib = new CommonLib(driver);
		objcampdesign=new CampaignDesinPage(driver);
		
		
	}
	
	@Parameters("browserType")
	@Test(priority=2)
	public void signInvalidPassword(String strBrowserType) throws IOException,InterruptedException{

		WebDriverWait wait;
		objSignin.signIn(strUsername,strPassword, strBrowserType);

		wait = new WebDriverWait(driver,10);
		/*wait.until( ExpectedConditions.presenceOfElementLocated((objSignin.lblDisplayName)));

		if(driver.findElement(objSignin.lblDisplayName).isDisplayed()){

			objCommonLib.screenshot();
			
			AssertJUnit.assertTrue(true);
		}

		else{

			objCommonLib.screenshot();
			AssertJUnit.assertTrue(false);*/
		
	}
	
	
	@Test(priority=3)
	public void verifyCreateCampaignLogo() throws InterruptedException{
		objcampdesign.clickCampaign();
		//objCommonLib.screenshot();
		Thread.sleep(1000);
		
	}
	/*@Test(priority=4)
	public void verifySegmentText() throws InterruptedException{
		
	objcampdesign.verifySegmentComparison();
	//objCommonLib.screenshot();
	Thread.sleep(3000);
	
	}*/
	@Test(priority=4)
	public void clickProductRecommendation() throws InterruptedException{
		/*
		objcampdesign.clickProductRecommendation();
		//objCommonLib.screenshot();
		//String text=driver.findElement(objcampdesign.Dialogtext).getText();
        //Assert.assertTrue(text.contains("Product Comparison"),"failed");
       // System.out.println(text);
		objcampdesign.clickProductRecommendation_selectObjective();
		Thread.sleep(1000);
		objcampdesign.clickProductRecommendation_RecommendationType();
		Thread.sleep(1000);
		objcampdesign.clickCompareProducts();
		Thread.sleep(3000);
		objcampdesign.clickCloseDialog();
		Thread.sleep(2000);*/
		}
	
	
	@Test(priority=5)
	public void clickProductRecommendation_OtherOptions() throws InterruptedException{
		/*//objCommonLib.screenshot();
	   //String text=driver.findElement(objcampdesign.Dialogtext).getText();
        //Assert.assertTrue(text.contains("Product Comparison"),"failed");
       // System.out.println(text);
		
		objcampdesign.clickProductRecommendation_selectObjective1();
		Thread.sleep(1000);
		objcampdesign.clickProductRecommendation_RecommendationType1();
		Thread.sleep(1000);
		objcampdesign.clickCompareProducts();
		Thread.sleep(3000);
		objcampdesign.clickCloseDialog();
		Thread.sleep(1000);*/
		
		}

	@Test(priority=6)
	public void clickingSegment() throws InterruptedException{
		objcampdesign.clickSegment();
		Thread.sleep(2000);
		objcampdesign.clickCharts();
		Thread.sleep(2000);
		objcampdesign.ClickRollOut();
		Thread.sleep(2000);
		
	}
	

	@Test(priority=7)
	public void clickOnCreateCampaign() throws InterruptedException{
	/*objcampdesign.clickCreateCampaign();
	Thread.sleep(1000);
	objcampdesign.clickSelectObjective_IncreaseRenewalrate();
	Thread.sleep(1000);
	objcampdesign.clickSelectObjective_IncreaseItemSales();
	Thread.sleep(2000);
	objcampdesign.clickSelectObjective_IncreaseCampaignActivityRate();
	Thread.sleep(1000);
	objcampdesign.clickSelectObjective_IncreaseCoupnRate();
	Thread.sleep(1000);
	objcampdesign.clickSelectObjective_WechatBinding();
	Thread.sleep(1000);
	objcampdesign.clickSelectObjective_increaseCnRegistrations();
	Thread.sleep(1000);
	objcampdesign.clickSelectObjective_increaseBasketSize();
	Thread.sleep(3000);*/
	}
	@Test(priority=8)
	public void CategoriesToBeTaggedSelection() throws InterruptedException{
		/*objcampdesign.selectCategoriesTobeTagged();
		Thread.sleep(3000);*/
		
		
		
		
	}
	@Test(priority=9)
	public void BySales() throws InterruptedException{
		/*objcampdesign.ClickOnBySales();	
		Thread.sleep(1000);
		objcampdesign.clickOnByOrders();
		Thread.sleep(1000);*/
	}
		
		@Test(priority=10)
		public void ByOrders() throws InterruptedException{
			/*objcampdesign.clickOnByOrders();
			Thread.sleep(1000);*/
	}
	@Test(priority=11)
	
	public void ClickingCalendar1() throws InterruptedException{
		/*objcampdesign.clickCalendar1();
		Thread.sleep(1000);*/
		}
	
	@Test(priority=12)
	public void ClickingCalendar2() throws InterruptedException{
		/*objcampdesign.clickCalendar2();
		Thread.sleep(1000);
		*/
	}
		
		@Test(priority=13)
		public void ClickingCalendar3() throws InterruptedException{
		/*objcampdesign.clickCalendar3();
		Thread.sleep(1000);*/
	}
	
	
/*	
@Test(priority=14)
	
	public void verifyingSelectingChannel() throws InterruptedException{
		objcampdesign.selectingByChannel();
		Thread.sleep(1000);
}*/

@Test(priority=15)

public void verifyingClickingCreateContent() throws InterruptedException{
	
		
		/*objcampdesign.clickingCreateContent();
		Thread.sleep(1000);*/
}

@Test(priority=16)
public void VerifyingClickingSave() throws InterruptedException{
	
		/*
		objcampdesign.clickSave();
		Thread.sleep(3000);*/
		
}	
@Test(priority=17)
public void finalCreateCampaign() throws InterruptedException{
	
		
		/*objcampdesign.finalCreateCampaign();
		Thread.sleep(2000);*/
		
}
@Test(priority=18)

	public void verifySeningCampaignsForReview() throws InterruptedException{
		
		
		/*
		objcampdesign.clickSendCampaignsForReview();
		Thread.sleep(2000);*/
		
}
@Test(priority=19)
		public void verifyReviewTab() throws InterruptedException{
			/*objcampdesign.clickReview();
			
			Thread.sleep(2000);*/
		}
@Test(priority=20)
public void verfyingRollOut() throws InterruptedException{
	
		/*objcampdesign.clickReview_RollOut();
		Thread.sleep(2000);*/
		}
@Test(priority=21)
public void verifyRollOutRejection() throws InterruptedException{
	

		
		/*objcampdesign.Rollout_reject();
		
		Thread.sleep(2000);
		*/
}
@Test(priority=22)
public void verifyDeleteCampaign(){
	
/*objcampdesign.deleteCampaign();
objcampdesign.Confirm();
		*/
		
		
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
		}
	}
	
	
	
		
	
	
	
		
	}
		
		
	
	
	
	
	

