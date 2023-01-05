package testng.GroupingFor.smoke;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	
	

	@Test
	public void HomeLoanWebLigin()
	{
		System.out.println("HomeLoanWebLigin");
	}
	
	@Test(groups = {"Smoke"})
	public void HomeLoanMobileLigin()
	{
		System.out.println("This smoke test in day4 class");
	}
	
	@Test(groups= {"Smoke"})
	public void HomeLoanAPILigin()
	{
		System.out.println("This smoke test in day4 class");
	}
}
