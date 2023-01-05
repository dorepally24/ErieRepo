package testng.tutorial2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeClassAnnotation()
	{
		System.out.println("beforeClassAnnotation, this code will be executied "
				+ " at before class execuiton this code is specific to day3 class");
	}
	
	@AfterClass
	public void afterClassAnnotation()
	{
		System.out.println("After Class Annotation, this code will be executed "
				+ " at after class execution, this code is speific to Day3 class");
	}

	@Test
	public void carLoanWebLigin()
	{
		System.out.println("carLoanWebLigin");
	}
	
	@Test
	public void carLoanMobileLigin()
	{
		System.out.println("carLoanMobileLigin");
	}
	
	@Test
	public void carLoanAPILigin()
	{
		System.out.println("carLoanAPILigin");
	}
	
	@Test
	public void carCoverageValidation()
	{
		System.out.println("carCoverageValidation");
	}
	
	@Test
	public void carTelematicValidation()
	{
		System.out.println("carCoverageValidation");
	}
	
	@Test
	public void carZeroDipValidation()
	{
		System.out.println("carCoverageValidation");
	}
}
