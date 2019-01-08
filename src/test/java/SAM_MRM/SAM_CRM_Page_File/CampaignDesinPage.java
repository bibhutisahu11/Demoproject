package SAM_MRM.SAM_CRM_Page_File;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import CommonLib.CommonLib;

public class CampaignDesinPage {
	WebDriver driver;
	
	CommonLib objCommonLib = null; 
	Homepage hmpage=null;
	
	/**xpath for Segments tab */
	public By Segmentstab=By.xpath("//a[@href='#/campaignDesign/segments']");
	public By SegmentCheckbox=By.xpath("//div/input[@id='mat-checkbox-1-input']");
	public By productrecommendation=By.xpath("//a[@href='#/campaignDesign/productRecommendation']");
	public By createcampaign=By.xpath("//a[@href='#/campaignDesign/createCampaign']");
	public By Review=By.xpath("//a[@href='#/campaignDesign/review']");
	public By Review_rollout=By.xpath("(//mat-icon[@aria-label='Rollout Campaign'])[1]");
	public By campaignhistory=By.xpath("//a[@href='#/campaignDesign/campaignHistory']");
	public By Charts=By.xpath("//button[@class='mat-raised-button mat-primary ng-star-inserted']");
	public By rollouts=By.xpath("//span[contains(text(),'Rollout')]");
	public By SegmentCompariosonText=By.xpath("//div[contains(text(),' Segment Comparison')]");
	
	/** xpath for create campaign tab           */
	public By CreatecampaignField=By.xpath("//input[@placeholder='Campaign Name']");
	public By selectobjective=By.xpath("//span[@class='mat-select-value-text ng-tns-c19-156 ng-star-inserted']");
	public By uploadCsv=By.xpath("//span[contains(text(),'Upload Exclusion CSV')]");
	public By increaseRenewalrate=By.xpath("//span[contains (text(),' Increase Renewal Rate')]");
	public By increaseItemSales=By.xpath("//span[contains (text(),' Increase Item Sales')]");
	public By increaseCampaignactivityRAte=By.xpath("//span[contains (text(),' Increase Campaign activity rate')]");
	public By increasecoupontakerate=By.xpath("//span[contains (text(),' Increase coupon take rate')]");
	public By wechatBinding=By.xpath("//span[contains (text(),'Increase WeChat binding')]");
	public By increaseCnRegistrations=By.xpath("//span[contains (text(),' Increase .CN registrations')]");
	public By increaseBasketSize=By.xpath("//span[contains (text(),' Increase basket size')]");
	public By Selectcategoriestobetagged=By.xpath("//span[contains(text(),'Select Categories to be tagged')]");
	public By SelectCategoriestobetagged1=By.xpath("//span[@class='mat-select-value-text ng-tns-c19-158 ng-star-inserted']");
	public By memberbase=By.xpath("//mat-select[@class='mat-select ng-tns-c19-167 ng-pristine ng-valid ng-star-inserted ng-touched']");
	public By memberbase1=By.xpath("//span[contains(text(),'Top')]");
	public By memberbase2=By.xpath("//span[contains(text(),'Top')]");
	public By Sales=By.xpath("//span[contains(text(),'Sales')]");
	public By CheckBox1=By.xpath("//input[@id='mat-checkbox-3-input']");
	public By SeletCategoriestToBeTagged_CheckBox1=By.xpath("(//mat-pseudo-checkbox[@class='mat-option-pseudo-checkbox mat-pseudo-checkbox ng-star-inserted'])[1]");
	public By CreateCampaign_Bysales=By.xpath("//span[@class='mat-select-value-text ng-tns-c19-169 ng-star-inserted']");
	public By sales=By.xpath("(//span[contains(text(),'Sales')])[1]");
	public By orders=By.xpath("(//span[contains(text(),'Orders')])[1]");
	public By Calendar1=By.xpath("(//span[@class='mat-button-wrapper']//*[name()='svg' and @class='mat-datepicker-toggle-default-icon ng-star-inserted'])[1]");
	public By Calendar2=By.xpath("(//span[@class='mat-button-wrapper']//*[name()='svg' and @class='mat-datepicker-toggle-default-icon ng-star-inserted'])[2]");
	public By Calendar3=By.xpath("(//span[@class='mat-button-wrapper']//*[name()='svg' and @class='mat-datepicker-toggle-default-icon ng-star-inserted'])[3]");
	public By calendardates=By.xpath("//table[@class='mat-calendar-table']//td");
	public By channel=By.xpath("//span[@class='mat-select-value-text ng-tns-c19-165 ng-star-inserted']");
	public By SMS=By.xpath("(//span[contains(text(),'SMS')])[1]");
	public By MMS=By.xpath("(//span[contains(text(),'MMS')])[1]");
	public By createContent=By.xpath("//button[@class='mat-mini-fab mat-accent']");
	public By Createcontent_input =By.xpath("//textarea[@class='mat-input-element mat-form-field-autofill-control mat-autosize ng-touched ng-dirty ng-valid']");
	public By cancel=By.xpath("//span[contains (text(),'Cancel')]");
	public By input=By.xpath("(//div/textarea)[2]");
	public By save=By.xpath("(//span[contains(text(),'Save')])[1]");
	public By CreateCampaign_last=By.xpath("(//span[@class='mat-button-wrapper'])[7]");
	public By sendCampaignReview=By.xpath("//span[contains(text(),'Send Campaigns for Review')]");
	public By Confirmcampign=By.xpath("//span[contains(text(),'Yes')]");
	public By Campaignrejection= By.xpath("//span[contains(text(),'No')]");
	public By deletecampaign=By.xpath("(//mat-icon[@aria-label='Click to View'])[2]");
	/** xpath for product recommendation tab         */
	public By productrecommendation_selectobjective=By.xpath("//span[@class='ng-tns-c19-70 ng-star-inserted']");
	public By Increaseengagement=By.xpath("(//span[contains(text(),'Increase Engagement')])[1]");
	public By increaseValue=By.xpath("//span[contains(text(),'Increase Value')]");
	public By productRecommendation_selectObjective1=By.xpath("//span[@class='mat-option-text'][contains(text(),'Increase Value')]");
	public By ProductRecommendation_recommendationType=By.xpath("//span[@class='ng-tns-c19-72 ng-star-inserted']");
	public By recommendationtype=By.xpath("//span[contains(text(),'Recent Behavior')]");
	public By Recommendationtype1=By.xpath("//span[contains(text(),'Seasonal')]");
	public By Compareproducts=By.xpath("//span[contains(text(),'Compare Products')]");
	public By CreateCampaign=By.xpath("//span[contains(text(),'Create Campaign')]");
	
	
	
	
	public By closeDialog=By.xpath("//button[@aria-label='Close dialog']");
	public By Dialogtext=By.xpath("//span[contains(text(),'Product Comparison')]");
	
	
	
	
	
	
	public CampaignDesinPage(WebDriver driver){
		this.driver=driver;
		objCommonLib = new CommonLib(driver);
		hmpage=new Homepage(driver);
	}
	
	
	public void clickCampaign() throws InterruptedException{
		hmpage.clickCampaignDesign();
	}
	public void clickCharts(){
		objCommonLib.clickElement(Charts);
	
	}
	
	public void clickSegment(){
	objCommonLib.clickElement(Segmentstab);	
	}
	public void ClickRollOut(){
		objCommonLib.clickElement(rollouts);
	}
	
	
	
public void clickSelectObjective_IncreaseRenewalrate(){
	WebElement element=driver.findElement(selectobjective);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(increaseRenewalrate);
	actions.moveToElement(element1).click().perform();
}

public void clickSelectObjective_IncreaseItemSales(){
	WebElement element=driver.findElement(selectobjective);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(increaseItemSales);
	actions.moveToElement(element1).click().perform();
}

public void clickSelectObjective_IncreaseCampaignActivityRate(){
	WebElement element=driver.findElement(selectobjective);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(increaseCampaignactivityRAte);
	actions.moveToElement(element1).click().perform();
}

public void clickSelectObjective_IncreaseCoupnRate(){
	WebElement element=driver.findElement(selectobjective);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(increasecoupontakerate);
	actions.moveToElement(element1).click().perform();
}

public void clickSelectObjective_WechatBinding(){
	WebElement element=driver.findElement(selectobjective);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(wechatBinding);
	actions.moveToElement(element1).click().perform();
}

public void clickSelectObjective_increaseCnRegistrations(){
	WebElement element=driver.findElement(selectobjective);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement( increaseCnRegistrations);
	actions.moveToElement(element1).click().perform();
}

public void clickSelectObjective_increaseBasketSize(){
	WebElement element=driver.findElement(selectobjective);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(increaseBasketSize);
	actions.moveToElement(element1).click().perform();
}

	
	public void clickcheckbox(){
		objCommonLib.clickElement(SegmentCheckbox);
		
	
	}
	public void clickSelectcategoriestobeTagged(){
		objCommonLib.actionClick(Selectcategoriestobetagged);
	}
	
	
	
	public  void clickCreateCampaign(){
		
		objCommonLib.clickElement(createcampaign);
		String Campaign_name="campaign"+new Random().nextInt();
		objCommonLib.enterText(CreatecampaignField,Campaign_name );
	}
	public void verifySegmentComparison(){
		String actual=driver.findElement(SegmentCompariosonText).getText();
		System.out.println(actual);
		Assert.assertTrue(actual.contains("Segment Comparison"));
	}
	
	public void clickMemberBase(){
		WebElement element=driver.findElement(memberbase);
		Actions actions= new Actions(driver);
		actions.moveToElement(element).click().perform();
		
	}
	public void clickOnSales(){
		objCommonLib.actionClick(Sales);
	}
	public void checkBoxValidation(){
		objCommonLib.checkboxSelected(CheckBox1);
	}
	public void clickProductRecommendation(){
		objCommonLib.clickElement(productrecommendation);
	}
	

public void clickProductRecommendation_selectObjective() throws InterruptedException{
	WebElement element=driver.findElement(productrecommendation_selectobjective);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(Increaseengagement);
	actions.moveToElement(element1).click().perform();
}


public void clickProductRecommendation_selectObjective1() throws InterruptedException{
	WebElement element=driver.findElement(productrecommendation_selectobjective);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(increaseValue);
	actions.moveToElement(element1).click().perform();
}

public void clickProductRecommendation_RecommendationType() throws InterruptedException{
	WebElement element=driver.findElement(ProductRecommendation_recommendationType);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(recommendationtype);
	actions.moveToElement(element1).click().perform();
}

public void clickProductRecommendation_RecommendationType1() throws InterruptedException{
	WebElement element=driver.findElement(ProductRecommendation_recommendationType);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(Recommendationtype1);
	actions.moveToElement(element1).click().perform();
}

public void clickCompareProducts(){
	objCommonLib.clickElement(Compareproducts);
}

public void selectCategoriesTobeTagged() throws InterruptedException{
	WebElement element=driver.findElement(Selectcategoriestobetagged);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	Thread.sleep(1000);
	objCommonLib.clickElement(SeletCategoriestToBeTagged_CheckBox1);
	
	//WebElement element1=driver.findElement(Recommendationtype1);
	//actions.moveToElement(element1).click().perform();
}
public void ClickOnBySales() throws InterruptedException{
	WebElement element=driver.findElement(CreateCampaign_Bysales);
	WebElement element1=driver.findElement(sales);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	Thread.sleep(1000);
	actions.moveToElement(element).click().perform();
	Thread.sleep(1000);
	actions.moveToElement(element1).click().perform();
	
}
public void clickOnByOrders() throws InterruptedException{
	WebElement element=driver.findElement(CreateCampaign_Bysales);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	Thread.sleep(4000);
	WebElement element1=driver.findElement(orders);
	actions.moveToElement(element1).click().perform();
	
}

public void clickCloseDialog(){
	objCommonLib.clickElement(closeDialog);
	
		
}


public void clickCalendar1() throws InterruptedException{
	objCommonLib.clickElement(Calendar1);
	List<WebElement>alldates=driver.findElements(calendardates);
	int count=alldates.size();
    
	for( WebElement ele:alldates){
		String date=ele.getText();
		
		if (date.equalsIgnoreCase("2")){
			ele.click();
			System.out.println("clicked");
			break;
		}}
	}



public void clickCalendar2() throws InterruptedException{
	objCommonLib.clickElement(Calendar2);
	List<WebElement>alldates=driver.findElements(calendardates);
	int count=alldates.size();
    
	for( WebElement ele:alldates){
		String date=ele.getText();
		
		if (date.equalsIgnoreCase("2")){
			ele.click();
			System.out.println("clicked");
			break;
		}}
	}


public void clickCalendar3() throws InterruptedException{
	objCommonLib.clickElement(Calendar3);
	List<WebElement>alldates=driver.findElements(calendardates);
	int count=alldates.size();
    
	for( WebElement ele:alldates){
		String date=ele.getText();
		
		if (date.equalsIgnoreCase("3")){
			ele.click();
			System.out.println("clicked");
			break;
		}}
	}

public void selectingByChannel() throws InterruptedException{
	WebElement element=driver.findElement(channel);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	Thread.sleep(1000);
	WebElement element1=driver.findElement(SMS);
	actions.moveToElement(element1).click().perform();
}

public void clickingCreateContent() throws InterruptedException{
	objCommonLib.clickElement(createContent);
	Thread.sleep(4000);
	objCommonLib.enterText(input, "abcd");
}
public void clickSave(){
	objCommonLib.clickElement(save);
}
public void clickCancel(){
	WebElement element=driver.findElement(cancel);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
}
public void finalCreateCampaign(){
	objCommonLib.clickElement(CreateCampaign_last);
}
public void clickSendCampaignsForReview(){
	objCommonLib.clickElement(sendCampaignReview);
}

public void clickReview(){
	objCommonLib.clickElement(Review);
}
public void clickReview_RollOut(){
	objCommonLib.clickElement(Review_rollout);
}



public void Confirm(){
	objCommonLib.clickElement(Confirmcampign);
}


public void Rollout_reject(){
	objCommonLib.clickElement(Campaignrejection);
}
public void deleteCampaign(){
	objCommonLib.clickElement(deletecampaign);
}


/*public void clickSelectObjective_productRecommendation(){
	 WebElement elem=driver.findElement(productRecommendation_selectObjective);
	Actions actions=new Actions(driver);
	actions.moveToElement(elem).click().build();
	actions.perform();
	
	
}*/


}

//	public void validateCheckbox(){
//		driver.findElement(SegmentCheckbox).isSelected();
//	}


