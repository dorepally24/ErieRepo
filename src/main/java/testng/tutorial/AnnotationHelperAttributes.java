package testng.tutorial;

import org.testng.annotations.Test;

public class AnnotationHelperAttributes {
	
	@Test
	public void ErieCustomerAuthentication()
	{
		System.out.println("ErieCustomerAuthentication passed");
	}
	
	
	@Test(dependsOnMethods={"ErieCustomerAuthentication"})
	public void ErieCustomerPolicyRenewalEligebility()
	{
		System.out.println("ErieCustomerPolicyRenewalEligebility");
	}
	
	@Test(dependsOnMethods={"ErieCustomerAuthentication", "ErieCustomerPolicyRenewalEligebility"})
	public void ErieCustomerDoPolicyRenewal()
	{
		System.out.println("ErieCustomerDoPolicyRenewal");
	}
	
	@Test(enabled = false)
	public void ErieCustomerDOChangeOfState()
	{
		System.out.println("ErieCustomerDOChangeOfState");
	}
	
	@Test(timeOut = 4000)
	public void erieCustomerCanceRewrite() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("ErieCustomerDOChangeOfState");
	}

}
