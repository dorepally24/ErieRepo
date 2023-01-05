package testng.tutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeMethod
	public void beforeMethodOfDay1Class()
	{
		System.out.println("beforeMethodOf Day2 Class and it will be executed before each"
				+ "method of class day2");
	}
	
	
	@AfterMethod
	public void afterMethodOfDay1Class()
	{
		System.out.println("After Method Of Day2 Class and it will be executed After each"
				+ "method of class day2");
	}

	@Test
	public void day2Test()
	{
		System.out.println("day2Test");
	}
	
}
