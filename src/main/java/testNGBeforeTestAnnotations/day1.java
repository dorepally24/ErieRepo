package testNGBeforeTestAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void beforeTestForTestTagModule()
	{
		System.out.println("This After test is related module tag test and "
				+ "it will execute After triggering of test module i.e. after all classes"
				+ "execution of test module tag");
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
