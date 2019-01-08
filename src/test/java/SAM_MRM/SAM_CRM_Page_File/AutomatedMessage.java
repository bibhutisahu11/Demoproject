package SAM_MRM.SAM_CRM_Page_File;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonLib.CommonLib;

public class AutomatedMessage {
WebDriver driver;
	
	CommonLib objCommonLib = null; 
	Homepage hmpage=null;
	public By automatedMsg = By.xpath("//div/img[@src='assets/campDetails.png']");
	public By Lifecycle=By.xpath("//a[@href='#/campaignDetails/lifecycleManagement']");
	public By selectstatus=By.xpath("//mat-select[@class='mat-select ng-tns-c18-10 ng-pristine ng-valid ng-star-inserted ng-touched' and @role='listbox']");
	public By selectstatus1=By.xpath("//mat-select[@id='mat-select-2' and @role='listbox']']");
	public By selectstatus2=By.xpath("////mat-select[@id='mat-select-2' and @role='listbox']//div[@mat-select-arrow']']']");
    public By SearchByCapmpaign=By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-pristine ng-valid ng-touched' and @placeholder='Search By Campaign']");
	public By SearchByCampaign2=By.xpath("//mat-form-field[@class='filters mat-input-container mat-form-field ng-tns-c9-11 mat-primary mat-form-field-type-mat-input mat-form-field-can-float mat-form-field-hide-placeholder ng-pristine ng-valid ng-touched']//input[@placeholder='Search By Campaign']");
	public By calendar1=By.xpath("(//button[@type='button']//*[name()='svg' and @viewBox='0 0 24 24'])[1]");
	public By calendar2=By.xpath("(//button[@type='button']//*[name()='svg' and @viewBox='0 0 24 24'])[2]");
	public By calendar1_dates=By.xpath("//table[@class='mat-calendar-table']//td");
	public By submitbutton=By.xpath("//span[contains(text(),' Submit')]");
	public By AutomatedCampaignbutton=By.xpath("(//div[@class='mat-radio-outer-circle'])[1]");
	public By AutomatedCampaigns_CampaignObjective=By.xpath("//span[@class='mat-select-value-text ng-tns-c18-30 ng-star-inserted']");
	public By Increasedvisits=By.xpath("//span[@class='ng-tns-c18-12 ng-star-inserted']");
	public By increasedsales=By.xpath("//span[contains(text(),'Increase Visits')]");
	public By increaseRenewalrate=By.xpath("(//span[contains(text(),'Increase Renewal Rate')])[1]");
	public By CampaignRolledBetweencalendar=By.xpath("//*[name()='svg' ][1]");
	public By CampaignRolledBetweencalendar2=By.xpath("(//*[name()='svg' ])[2]");
	public By Automatedcampaign_Submit=By.xpath("//span[contains(text(),'Submit')]");
	public By Selectststus3=By.xpath("//span[@class='mat-select-value-text ng-tns-c18-21 ng-star-inserted']");
	public By Status_all=By.xpath("(//span[contains(text(),'All')])[1]");
	public By Status_suspended=By.xpath("(//span[contains(text(),'Suspended')])[1]");
	public By Status_active=By.xpath("(//span[contains(text(),'Active')])[1]");
	
	
	
	
	public AutomatedMessage(WebDriver driver){
			this.driver=driver;
			objCommonLib = new CommonLib(driver);
			hmpage=new Homepage(driver);
	}
	
	public void clickAutomatedMessage(){
		objCommonLib.clickElement(automatedMsg);
	}
	public void ClickLifecycle(){
		objCommonLib.clickElement(Lifecycle);

	}
	public void CliCkStatus(){
		WebElement element=driver.findElement(selectstatus2);
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void enteringText(){
		objCommonLib.enterText(SearchByCampaign2, "abc");
	}
	
	
	public void textEnter(){
		WebElement element=driver.findElement(SearchByCampaign2);
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	
	public void clickCalendar1() throws InterruptedException{
		objCommonLib.clickElement(calendar1);
		WebDriverWait wait=new WebDriverWait(driver,20);
		List<WebElement>alldates=driver.findElements(calendar1_dates);
		int count=alldates.size();
	    System.out.println(count);
		for( WebElement ele:alldates){
			String date=ele.getText();
			System.out.println(date);
			if (date.equalsIgnoreCase("6")){
				ele.click();
				System.out.println("clicked");
				break;
			}}
		}
		
		
	
	public void clickCalendar2(){
		objCommonLib.clickElement(calendar2);
		List<WebElement>alldates=driver.findElements(calendar1_dates);
		int count=alldates.size();
	    System.out.println(count);
		for( WebElement ele:alldates){
			String date=ele.getText();
			System.out.println(date);
			if (date.equalsIgnoreCase("5")){
				ele.click();
				System.out.println("clicked");
				break;
			}
	
	}}
	public void clickSubmitButton(){
		objCommonLib.clickElement(submitbutton);
		System.out.println("clicked on submit button");
		
	}
	
	public void clickAutomatedCampaignButton(){
		WebElement element=driver.findElement(AutomatedCampaignbutton);
		Actions actions= new Actions(driver);
		actions.moveToElement(element).click().perform();
		
	}
	
	public void clickCampaignObjective(){
		WebElement element=driver.findElement(AutomatedCampaigns_CampaignObjective);
		Actions actions= new Actions(driver);
		actions.moveToElement(element).click().perform();
	}
	public void clickCampaignObjective_Options(){
		WebElement element=driver.findElement(Increasedvisits);
		Actions actions= new Actions(driver);
		actions.moveToElement(element).click().perform();
	}
	
	public void clickCampaignRolledBetweenCalendar(){
		objCommonLib.clickElement(CampaignRolledBetweencalendar);
		System.out.println("clicked on calendar");
		
		List<WebElement>alldates=driver.findElements(calendar1_dates);
		int count=alldates.size();
	    System.out.println(count);
		for( WebElement ele:alldates){
			String date=ele.getText();
			
			if (date.equalsIgnoreCase("25")){
				ele.click();
				System.out.println("clicked");
				break;
			}}}
		
		public void clickCampaignRolledBetweenCalendar2(){
			objCommonLib.clickElement(CampaignRolledBetweencalendar2);
			System.out.println("clicked on calendar");
			
			List<WebElement>alldates=driver.findElements(calendar1_dates);
			int count=alldates.size();
		    
			for( WebElement ele:alldates){
				String date=ele.getText();
				System.out.println(date);
				if (date.equalsIgnoreCase("5")){
					ele.click();
					System.out.println("clicked");
					break;
				}}
				
		
	}
		public void Automatedcampaign_clickSubmitButton() throws InterruptedException{
			Thread.sleep(5000);
			objCommonLib.clickElement(Automatedcampaign_Submit);
			System.out.println("clicked on submit button");
			
		}
		public void clickCampaignObjective_Options1(){
			WebElement element=driver.findElement(increasedsales);
			Actions actions= new Actions(driver);
			actions.moveToElement(element).click().perform();
			WebElement element1=driver.findElement(increaseRenewalrate);
			actions.moveToElement(element1).click().perform();
}
		
public void clickStatus_All(){
	WebElement element=driver.findElement(Selectststus3);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(Status_all);
	actions.moveToElement(element1).click().perform();
}

public void clickStatus_Active() throws InterruptedException{
	WebElement element=driver.findElement(Status_all);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(Status_active);
	actions.moveToElement(element1).click().perform();
	
	
}


public void clickStatus_Suspended() throws InterruptedException{
	WebElement element=driver.findElement(Selectststus3);
	Actions actions= new Actions(driver);
	actions.moveToElement(element).click().perform();
	WebElement element1=driver.findElement(Status_suspended);
	actions.moveToElement(element1).click().perform();
	
	
}
}
