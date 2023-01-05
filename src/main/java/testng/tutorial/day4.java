package testng.tutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	
	@BeforeSuite
	public void setUpForTestExecution()
	{
		System.out.println("This is Before suite method it will execuite before testNg.xml suite");
	}
	
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
	public void HomeLoanWebLigin()
	{
		System.out.println("HomeLoanWebLigin");
	}
	
	@Test
	public void HomeLoanMobileLigin()
	{
		System.out.println("HomeLoanMobileLigin");
	}
	
	@Test
	public void HomeLoanAPILigin()
	{
		System.out.println("HomeLoanAPILigin");
	}
}
