package com.login.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginExamPortal 
{
	WebDriver driver;
	
	public LoginExamPortal(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//input[@id='id_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='id_email2']")
	WebElement confirmEmail;
	
	@FindBy(xpath="//input[@id='id_password1']")
	WebElement password1;
	
	@FindBy(xpath="//input[@id='id_password2']")
	WebElement password2;
	
	@FindBy(xpath ="//button[normalize-space()='Create Account']")
	WebElement confirm;
	
	
	
	public void examPortalLogin(String em, String cEmail, String pass1, String pass2)
	{
		email.sendKeys(em);
		confirmEmail.sendKeys(cEmail);
		password1.sendKeys(pass1);
		password2.sendKeys(pass2);
		confirm.click();
	}
	
	
}
