package testng.GroupingFor.smoke;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 {
	
	

	@Test(groups= {"Smoke"})
	public void day2Test()
	{
		System.out.println("This smoke test in day2 class");
	}
	
}
