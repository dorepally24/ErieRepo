package _3org.comp.testCases;

import org.openqa.selenium.WebDriver;

import _1org.comp.erieinsurance_automation.SeleniumWrapper;
import _1org.comp.erieinsurance_automation.SeleniumWrapper.EnumListOfBrowsers;
import _2erieInsurance.pageObjects.ErieInsuranceHomePage;

public class TC01_ErieInsurancePageMenuTabsVerification {
	
	WebDriver driver;
	
	ErieInsuranceHomePage objErieInsuranceHomePage = new  ErieInsuranceHomePage(driver);
	SeleniumWrapper objSeleniumWrapper = new SeleniumWrapper();
	
	EnumListOfBrowsers browserList;
	
	//lunch browser
	objSeleniumWrapper.invokeBrowser(EnumListOfBrowsers.CHROME);
	

}
