package testng.tutorial;

import org.testng.annotations.Test;

public class day1 {
	
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
