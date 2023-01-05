package testng.tutorial;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class erieProjectListeners implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
	    System.out.println("The test case is passed  :"+ result.getName());
	  }
	
	@Override
	 public void onTestFailure(ITestResult result) {
		System.out.println("The test case is failed  :"+ result.getName());
		  }

}
