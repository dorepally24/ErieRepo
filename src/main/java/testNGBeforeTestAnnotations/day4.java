package testNGBeforeTestAnnotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {

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
	
	
	@BeforeTest
	public void beforeTestForTestTagModule()
	{
		System.out.println("This before test is related module tag test and "
				+ "it will execute before triggering of test module i.e. before classes"
				+ "of test module tag");
	}
	
}
