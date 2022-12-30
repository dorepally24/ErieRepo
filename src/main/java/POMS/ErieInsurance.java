package POMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErieInsurance {
	
	WebDriver driver;
	
	Boolean methodExecutionFlag = false;
	
	public ErieInsurance(WebDriver driver) {
		this.driver = driver;		
	}
	
	@FindBy(css="img[class=ghd__logo]")
	WebElement logo_ErieInsurance;
	
	
	@FindBy(css="div[class='ghd__top-content'] a[title='Find an Agency']")
	WebElement link_FindAnAgency;
	
	
	//Home Page MenuTabs
	@FindBy(css="#heading-flyout-Insurance")
	WebElement menuTab_Insurance;
	
	@FindBy(css="#heading-flyout-Service")
	WebElement menuTab_Service;
	
	@FindBy(css="#heading-flyout-Blog")
	WebElement menuTab_Blog;
	
	@FindBy(css="#heading-flyout-About-Erie")
	WebElement menuTab_AboutErie;
	
	
	
	public Boolean erieHomePageMenuTabValidation()
	{
		try {
			
			menuTab_Insurance.isDisplayed();
			menuTab_Service.isDisplayed();
			menuTab_Blog.isDisplayed();
			menuTab_AboutErie.isDisplayed();
			
			methodExecutionFlag = true;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		return methodExecutionFlag;
		
	}

}
