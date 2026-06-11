package com.login.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginChasePage 
{
	WebDriver driver;
	
	public LoginChasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath = "//input[@id='userId-text-input-field']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='password-text-input-field']")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='signin-button']")
	WebElement signIn;
	
	public void chasePortal(String uName,String pass)
	{
		userName.sendKeys(uName);
		password.sendKeys(pass);
		signIn.click();
	}
}
