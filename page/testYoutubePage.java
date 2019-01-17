package page;

import org.openqa.selenium.WebDriver;

import commonLib.CommonLib;

public class testYoutubePage {
	WebDriver driver;
	CommonLib objCommonLib = null;
	public testYoutubePage(WebDriver driver){

		this.driver = driver;
		objCommonLib = new CommonLib(driver);

	}
}
