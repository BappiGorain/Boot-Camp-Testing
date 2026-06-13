package test.automation.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeTestAutomationLogin
{
	
	WebDriver driver;
	
	public PracticeTestAutomationLogin(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']") 
	WebElement password;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement sumbit;
	
	public void testAutomation(String uName, String pass)
	{
		userName.sendKeys(uName);
		password.sendKeys(pass);
		sumbit.click();
	}
}
