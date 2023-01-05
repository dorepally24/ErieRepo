package testng.GroupingFor.smoke;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {
	
	
	
	@Test(groups = {"Smoke"})
	public void itsATestCaseName()
	{
		System.out.println("This smoke test in day1 class");
	}
	
	@Test()
	public void tet2()
	{
		System.out.println("It's test case 2 in testNg FrameWork");
	}

}
