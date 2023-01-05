package testng.tutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GeicoParameterizingUsingTestNGXml {
	
	
	@Parameters({"nameOfTheDomain"})
	@Test
	public void carLoanLogin(String URL)
	{
		System.out.println("Geico URL: "+URL);
	}
	
	
	
	@Parameters({"ErieUserName"})
	@Test
	public void carLoanLogin2(String userName)
	{
		System.out.println("Geico userName: "+userName);
	}
	
	@Parameters({"geiocUrl"})
	@Test
	public void personalLoanLogin(String url)
	{
		System.out.println("Geioc userName: "+url);
	}
	
	@Parameters({"EriePassword"})
	@Test
	public void HomeLoanLogin(String password)
	{
		System.out.println("Geico password"+password);
	}

}
