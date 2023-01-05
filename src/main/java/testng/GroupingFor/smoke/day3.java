package testng.GroupingFor.smoke;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.comp.erieinsurance_automation.SeleniumWrapper;
import org.comp.erieinsurance_automation.SeleniumWrapper.EnumListOfBrowsers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();   
	   
	   SeleniumWrapper obj = new SeleniumWrapper();
	   
	   EnumListOfBrowsers obj2;
	   
	   
	   

	@Test
	public void carLoanWebLigin()
	{
		System.out.println("carLoanWebLigin");
		System.out.println(dtf.format(now)); 
		//obj.invokeBrowser(EnumListOfBrowsers.CHROME);
	}
	
	@Test(groups= {"Smoke"})
	public void carLoanMobileLigin()
	{
		System.out.println("This smoke test in day3 class");
		
		///obj.invokeBrowser(EnumListOfBrowsers.CHROME);
	}
	
	@Test
	public void carLoanAPILigin()
	{
		System.out.println("carLoanAPILigin");
		System.out.println(dtf.format(now));  

		//obj.invokeBrowser(EnumListOfBrowsers.CHROME);
	}
	
	@Test
	public void carCoverageValidation()
	{
		System.out.println("carCoverageValidation");
		System.out.println(dtf.format(now));  

		//obj.invokeBrowser(EnumListOfBrowsers.CHROME);
	}
	
	@Test
	public void carTelematicValidation()
	{
		System.out.println("carCoverageValidation");
		System.out.println(dtf.format(now));  
		//obj.invokeBrowser(EnumListOfBrowsers.CHROME);
	}
	
	@Test
	public void carZeroDipValidation()
	{
		System.out.println("carCoverageValidation");
		System.out.println(dtf.format(now));  
		//obj.invokeBrowser(EnumListOfBrowsers.CHROME);
	}
}
