package SAM_MRM.SAM_CRM_Page_File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import CommonLib.CommonLib;

public class Homepage {
	WebDriver driver;
	CommonLib objCommonLib = null; 
	public By campaigndesign = By.xpath("//div/img[@src='assets/megaphone.png']");
	public By Campaigndetails=By.xpath("//div/img[@src='assets/campDetails.png']");
	public By automatedMsg = By.xpath("//div/img[@src='assets/campDetails.png']");
	public By btnEntermuUniverse = By.xpath("//div[@title='Interconneced Problem Network']");
	public By tooglebtn = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    public By title = By.xpath("//strong[@class='large']");
    public By ClickUser=By.xpath("//i[@class='user-name']");
    public By edituser=By.xpath("//a[@href='#/user-list']");
   
	public Homepage(WebDriver driver){

		this.driver = driver;
		objCommonLib = new CommonLib(driver);

	}
	public void clickCampaignDetails() throws InterruptedException{
		Thread.sleep(5000);
		
		objCommonLib.clickElement(Campaigndetails);
	}
	
	public void clickCampaignDesign() throws InterruptedException{
		Thread.sleep(5000);
		objCommonLib.clickElement(campaigndesign);
	}
	public void clickAutomatedMssg(){
		objCommonLib.clickElement(automatedMsg);
	}
	public void clickAutomatedMsg(){
		objCommonLib.clickElement(automatedMsg);
	}
	public void clickToggle(){
		objCommonLib.clickElement(tooglebtn);
	}
	public void textChinese(){
		String em=driver.findElement(title).getText();
		System.out.println(em);
        String av="山姆会员关系管理系统 2.1.1";
		Assert.assertEquals(av,em);
			
	}
	public void textEnglish(){
		String em=driver.findElement(title).getText();
		System.out.println(em);
      Assert.assertTrue(em.contains("Sam's Club MRM Tool 2.1.1"));
			
	}
	public void clickOntheUser(){
		objCommonLib.clickElement(ClickUser);
	}
	public void clickEditUser(){
		objCommonLib.clickElement(edituser);
	}
}
