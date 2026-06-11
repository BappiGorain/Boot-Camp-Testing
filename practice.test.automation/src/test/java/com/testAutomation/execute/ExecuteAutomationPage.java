package com.testAutomation.execute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import test.automation.Login.PracticeTestAutomationLogin;

public class ExecuteAutomationPage 
{
	@Test
	public void execute()
	{
		WebDriver driver = BrowserFactory.BrowserOption("chrome", "https://practicetestautomation.com/practice-test-login/");
		PracticeTestAutomationLogin practiceTestAutomationLogin = PageFactory.initElements(driver, PracticeTestAutomationLogin.class);
		practiceTestAutomationLogin.testAutomation("student", "Password123");
	}
}
