package testng.tutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ErieParameterizingUsingTestNGXml {
	
	@Parameters({"nameOfTheDomain"})
	@Test()
	public void nameOfTheDomainOfBusiness(String nameOfTheDomain)
	{
		System.out.println("nameOfTheDomain: "+ nameOfTheDomain);
	}
	
	@Parameters({"ErieUrl"})
	@Test
	public void carLoanLogin(String URL)
	{
		System.out.println("Erie URL: "+URL);
	}
	
	@Parameters({"ErieUserName"})
	@Test
	public void personalLoanLogin(String userName)
	{
		System.out.println("Erie userName: "+userName);
	}
	
	@Parameters({"EriePassword"})
	@Test
	public void HomeLoanLogin(String password)
	{
		System.out.println("Erie password"+password);
	}
	
	
	@Parameters({"policyNumber", "accountHolderName"})
	@Test
	public void pintPolicyNumberAndAccountHolderName(String policyNumber, String AccountHolderName)
	{
		System.out.println("Policy Number: "+policyNumber+" AccountHolderName"+AccountHolderName);
		
	}

}
