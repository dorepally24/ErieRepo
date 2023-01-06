import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import _1org.comp.erieinsurance_automation.SeleniumWrapper;

public class _7IsThereAWayToTypeInATextboxWithoutUsingSendKeysMethod extends SeleniumWrapper{

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SeleniumWrapper obj = new SeleniumWrapper();
		
		driver = obj.invokeBrowser(EnumListOfBrowsers.CHROME);
		
		obj.launchApplication("https://www.tutorialspoint.com/index.htm");
		
		System.out.println("We can input text in the text box without the method sendKeys"
				+ " with thehelp of the JavaScript Executor. "
				+ "Selenium executes JavaScript commands with the help of the "
				+ "executeScript method.");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		Thread.sleep(5000);
		
		WebElement UserName= driver.findElement(By.xpath("//input[@name='key']"));
		//((JavascriptExecutor)driver).executeAsyncScript("arguments[0].value='admin'",name); 
		
		// JavaScript Executor to enter text
	      JavascriptExecutor j = (JavascriptExecutor)driver;
	      j.executeScript ("document.getElementById('search-strings').value='Admin'");
	      
	      j.executeAsyncScript("arguments[0].value='usingXpath'",UserName);
		
		System.out.println("Send key is successfull");	

	}

}
