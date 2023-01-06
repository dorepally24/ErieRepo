package testng.tutorial;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import _1org.comp.erieinsurance_automation.SeleniumWrapper;
import _1org.comp.erieinsurance_automation.SeleniumWrapper.EnumListOfBrowsers;

public class day3 {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();   
	   
	   SeleniumWrapper obj = new SeleniumWrapper();
	   
	   EnumListOfBrowsers obj2;
	   
	   @BeforeMethod
		public void beforeMethodOfDay1Class()
		{
			System.out.println("beforeMethodOf Day3 Class and it will be executed before each"
					+ "method of class day3");
		}
		
		
		@AfterMethod
		public void afterMethodOfDay1Class()
		{
			System.out.println("After Method Of Day3 Class and it will be executed After each"
					+ "method of class day3");
		}
	   

	@Test
	public void carLoanWebLigin()
	{
		System.out.println("carLoanWebLigin");
		System.out.println(dtf.format(now)); 
		obj.invokeBrowser(EnumListOfBrowsers.CHROME);
		Assert.assertTrue(false);
	}
	
	@Test
	public void carLoanMobileLigin()
	{
		System.out.println("carLoanMobileLigin");
		System.out.println(dtf.format(now));  
		
		Assert.assertFalse(true);
		
		///obj.invokeBrowser(EnumListOfBrowsers.CHROME);
	}
	
	@Test
	public void carLoanAPILigin()
	{
		System.out.println("carLoanAPILigin");
		System.out.println(dtf.format(now)); 
		
		Assert.assertTrue(true);

		//obj.invokeBrowser(EnumListOfBrowsers.CHROME);
	}
	
	@Test
	public void carCoverageValidation()
	{
		System.out.println("carCoverageValidation");
		System.out.println(dtf.format(now));  

		//obj.invokeBrowser(EnumListOfBrowsers.CHROME);
		Assert.assertTrue(false);
	}
	
	@Test
	public void carTelematicValidation()
	{
		System.out.println("carCoverageValidation");
		System.out.println(dtf.format(now));  
		//obj.invokeBrowser(EnumListOfBrowsers.CHROME);
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void carZeroDipValidation()
	{
		System.out.println("carCoverageValidation");
		System.out.println(dtf.format(now));  
		//obj.invokeBrowser(EnumListOfBrowsers.CHROME);
		Assert.assertTrue(false);
		
	}
}
