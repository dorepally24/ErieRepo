package _1org.comp.erieinsurance_automation;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author shivashankerd
 *
 */
public class SeleniumWrapper {

	WebDriver driver;
	
	Boolean methodExecutionFlag = false;

	public SeleniumWrapper() {

	}

	/**
	 * 
	 * @param driver
	 */
	public SeleniumWrapper(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 
	 * @author shivashankerd enum data type enables ListOfBrowser variable to be a
	 *         set of BrowserNames
	 */
	public enum EnumListOfBrowsers {
		CHROME, FIREFOX, EDGE, IE
	}

	/**
	 * 
	 * @param passOrFailFlag
	 */
	public void publishTestStepResults(boolean passOrFailFlag) {
		try {

			Assert.assertTrue(passOrFailFlag);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Method to Intiate browser
	 * 
	 * @param browserName
	 * @return
	 */
	public WebDriver invokeBrowser(EnumListOfBrowsers browserName) {

		try {

			// close all opened browsers
			// killAllChromeBorwserExe();

			switch (browserName) {

			case CHROME:
				System.out.println("Chrome Browser Is Launching");
				// System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

				// maximize the browser
				driver.manage().window().maximize();
//		        driver.get("https://www.google.co.in/");
				break;
			case FIREFOX:
				break;
			case EDGE:
				break;
			case IE:
				break;
			default:
				System.out.println("Please Check The Browser Name, The specified browser is not available");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + "ClassName " + this.getClass().getSimpleName() + "Method Name is "
					+ new Object() {
					}.getClass().getEnclosingMethod().getName());
		}
		return driver;
	}

	/**
	 * 
	 */
	public void killAllChromeBorwserExe() {
		Runtime rt = Runtime.getRuntime();
		try {
			Process proc = rt.exec("taskkill /im chrome.exe /f /t");
			System.out.println(proc.outputWriter());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void launchApplication(String urlOfTheApplication) {
		try {
			driver.get(urlOfTheApplication);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	/**
	 * This method can be used to enter data
	 * @param element
	 * @param dataToBeEntered
	 */
	public Boolean enterData(WebElement element, String dataToBeEntered)
	{
		try {
			element.sendKeys(dataToBeEntered);
			
			methodExecutionFlag = true;
			
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
		}
		
		return methodExecutionFlag;
	}
	
	/**
	 * This method verifies the list of webElements existance on page.
	 * @param listOfWebElements
	 * @return
	 */
	public Boolean webElementListVerification(List<WebElement> listOfWebElements)
	{
		
		try {
			
			for(WebElement elementToBeValidated : listOfWebElements)
			{
				elementToBeValidated.isDisplayed();
			}
			
			methodExecutionFlag = true;
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}		
		
		return methodExecutionFlag;
	}
	
	
	
	

}
