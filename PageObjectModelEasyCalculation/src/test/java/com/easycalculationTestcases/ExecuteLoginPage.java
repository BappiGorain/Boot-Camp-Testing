package com.easycalculationTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.easycalculationPages.LoginEasyCalc;

import helper.BrowserFactory;

public class ExecuteLoginPage
{
	@Test
	public void validateUserExecution()
	{
		WebDriver driver = BrowserFactory.BrowserOption("chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
		LoginEasyCalc loginEasyCalc = PageFactory.initElements(driver, LoginEasyCalc.class);
		loginEasyCalc.login_EasyCal("bappigorain08312@gmail.com", "Bappi");
	}
}