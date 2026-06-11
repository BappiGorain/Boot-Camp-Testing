package com.chase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.login.pages.LoginChasePage;

import helper.BrowserFactory;

public class ExecuteLoginPage
{
	@Test
	public void validateChase() throws InterruptedException
	{
		WebDriver driver = BrowserFactory.BrowserOption("chrome","https://www.chase.com/");
		LoginChasePage page = PageFactory.initElements(driver,LoginChasePage.class);
		Thread.sleep(6000);
		page.chasePortal("bappi@gmail.com","bappi");
	}
	
	
	
}
