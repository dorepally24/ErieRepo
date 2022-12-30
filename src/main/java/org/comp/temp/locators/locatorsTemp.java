package org.comp.temp.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorsTemp {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			String Name = "SHIVA";
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();   
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			//maximize the browser
	        driver.manage().window().maximize();
//	        driver.get("https://www.google.co.in/");
	        
	        driver.get("https://rahulshettyacademy.com/locatorspractice/");	       
	       	           
	        String pwd = getPassword();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.cssSelector("input[id*='inputUser']")).sendKeys(Name); // returns first webElement.
	        
	        driver.findElement(By.name("inputPassword")).sendKeys(pwd);
	        
	        driver.findElement(By.className("signInBtn")).click();
	        
	        //Css Slector        
	        //String ErrorMessage = driver.findElement(By.cssSelector("p.error")).getText();
	        
	        //System.out.println(ErrorMessage);
	        
	        Thread.sleep(2000);
	        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	        Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello "+Name+",");
	        
	       
	        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	        System.out.println("Button is clicked");

		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			//driver.close();
		}
	}
	
	public static String getPassword() throws InterruptedException {
		
		driver.findElement(By.cssSelector("div.forgot-pwd-container a[href*='#']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		Thread.sleep(2000);
		
		String resetPwdPassword = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		
		String[] pwdArray = resetPwdPassword.split("'");
		
		String pwdTemp =  pwdArray[1];
		
		String[] pwdArrayTemp = pwdTemp.split("'"); 
		
		Thread.sleep(3000);
		
		//click on goTo Login Button
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		return pwdArrayTemp[0];
	}
	 
}
