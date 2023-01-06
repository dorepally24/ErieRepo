package _2erieInsurance.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import _1org.comp.erieinsurance_automation.SeleniumWrapper;

public class ErieInsuranceHomePage {

	WebDriver driver;

	Boolean methodExecutionFlag = false;

	public ErieInsuranceHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	SeleniumWrapper objectSeleniumWrapper = new SeleniumWrapper(driver);

	@FindBy(css = "img[class=ghd__logo]")
	WebElement logo_ErieInsurance;

	@FindBy(css = "div[class='ghd__top-content'] a[title='Find an Agency']")
	WebElement link_FindAnAgency;

	// Home Page MenuTabs
	@FindBy(css = "#heading-flyout-Insurance")
	WebElement menuTab_Insurance;

	@FindBy(css = "#heading-flyout-Service")
	WebElement menuTab_Service;

	@FindBy(css = "#heading-flyout-Blog")
	WebElement menuTab_Blog;

	@FindBy(css = "#heading-flyout-About-Erie")
	WebElement menuTab_AboutErie;

	/**
	 * 
	 * @return
	 */

	public Boolean erieHomePageMenuTabValidation() {
		List<WebElement> erieHomePageMenuTabs = null;
		try {

			erieHomePageMenuTabs.add(menuTab_Insurance);
			erieHomePageMenuTabs.add(menuTab_Service);
			erieHomePageMenuTabs.add(menuTab_Blog);
			erieHomePageMenuTabs.add(menuTab_AboutErie);

			methodExecutionFlag = objectSeleniumWrapper.webElementListVerification(erieHomePageMenuTabs);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return methodExecutionFlag;

	}

}
