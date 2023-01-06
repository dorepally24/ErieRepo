package Dryrun_TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import _1org.comp.erieinsurance_automation.SeleniumWrapper;
import _1org.comp.erieinsurance_automation.SeleniumWrapper.EnumListOfBrowsers;
import _2erieInsurance.pageObjects.ErieInsuranceHomePage;

public class ErieHomePageTests {
	
	WebDriver driver;
	
	//creating object for ErieInsurance Home Page
	ErieInsuranceHomePage objErieInsurance = new ErieInsuranceHomePage(driver);
	
	//creating object for SeleniumWrpper class 
	SeleniumWrapper objSeleniumWrapper = new SeleniumWrapper();
	
	
	Boolean testExecutionFlag = false;
	
	@BeforeTest
	public void setUp()
	{
		objSeleniumWrapper.invokeBrowser(EnumListOfBrowsers.CHROME);
	}
	
	
  @Test
  public void validateErieHomePageMenuTabs() {
	  try 
	  {
		  boolean testExecutionFlag = objErieInsurance.erieHomePageMenuTabValidation();
		  objSeleniumWrapper.publishTestStepResults(testExecutionFlag);
	  }
	  catch(Exception ex)
	  {
		  
	  }
  }
}
