package testng.tutorial;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTODriveTestCasesMultipleIterations {

	
	@DataProvider
	public Object[][] getDataForGeicoCustomer()
	{
		
		Object[][] geicoLoginTestData = new Object[3][3];
		
		geicoLoginTestData[0][0] = "Johon";
		geicoLoginTestData[0][1]= "#2291";
		geicoLoginTestData[0][2] = 8957634278L;
		
		geicoLoginTestData[1][0] = "Faye";
		geicoLoginTestData[1][1]= "#2241";
		geicoLoginTestData[1][2] = 89576344278L;
		
		geicoLoginTestData[2][0] = "Conrad";
		geicoLoginTestData[2][1]= "#22490";
		geicoLoginTestData[2][2] = 96957634278L;
		
		System.out.println(geicoLoginTestData[2][2]);
		
		return geicoLoginTestData;
	}
	
	
	@Test(dataProvider = "getDataForGeicoCustomer")
	public void testGeicoLogin(String userName, String password, long policyNumber)
	{
		System.out.println("Enter UserName: "+userName);
		System.out.println("Enter Password:"+ password);
		
		System.out.println("Enter policyNumber:"+ policyNumber);
	}
	
	@Test
	public void displayMessage()
	{
		System.out.println("Test prinited");
	}
	
}
