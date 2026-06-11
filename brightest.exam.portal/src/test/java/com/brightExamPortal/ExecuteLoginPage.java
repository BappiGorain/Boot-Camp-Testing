package com.brightExamPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.login.pages.LoginExamPortal;
import helper.BrowserFactory;

public class ExecuteLoginPage
{
	@Test
	public void validateBrightPortal()
	{
		WebDriver driver = BrowserFactory.BrowserOption("chrome", "https://profile.brightest.org/accounts/signup/");
		LoginExamPortal examPortal = PageFactory.initElements(driver, LoginExamPortal.class);
		examPortal.examPortalLogin("bappi@gmail.com", "bappi@gmail.com", "bappi", "bappi");
	}
}
