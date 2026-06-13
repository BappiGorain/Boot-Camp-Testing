package com.framework.page;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.framework.utility.BrowserFactory;
import com.framework.utility.ConfigDataProvider;
import com.framework.utility.ExcelDataReader;
import com.framework.utility.Helper;

public class BaseClass
{
	public WebDriver driver;
	public ExcelDataReader excel;
	public ConfigDataProvider config;
	
	
	@BeforeSuite    
	public void setUp()
	{
		excel = new ExcelDataReader();
		config= new ConfigDataProvider();
		
	}
	
	@BeforeClass
	public void BrowserTest()
	{
		driver = BrowserFactory.BrowserOption(driver, config.getBrowser(),config.getAppUrl());
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) 
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			Helper.capturedScreenShot(driver);
		}
	}
	
}

