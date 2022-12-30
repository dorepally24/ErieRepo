package Dryrun_TestCases;

import org.comp.erieinsurance_automation.SeleniumWrapper;
import org.comp.erieinsurance_automation.SeleniumWrapper.EnumListOfBrowsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMS.ErieInsurance;

public class ErieHomePageTests {
	
	WebDriver driver;
	
	//creating object for ErieInsurance Home Page
	ErieInsurance objErieInsurance = new ErieInsurance(driver);
	
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
