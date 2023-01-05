package testng.tutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeMethod
	public void beforeMethodOfDay1Class()
	{
		System.out.println("beforeMethodOfDay1Class and it will be executed before each"
				+ "method of class day1");
	}
	
	
	@AfterMethod
	public void afterMethodOfDay1Class()
	{
		System.out.println("After Method Of Day1Class and it will be executed After each"
				+ "method of class day1");
	}
	
	@Test
	public void itsATestCaseName()
	{
		System.out.println("In testNG Every @Test method is considered as"
				+ "one test case and method name is considered as test case name");
	}
	
	@Test
	public void tet2()
	{
		System.out.println("It's test case 2 in testNg FrameWork");
	}

}
