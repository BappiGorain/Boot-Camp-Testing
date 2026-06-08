package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestingFirefoxBrowser
{
	
	@Test
	public void fireFoxTest1()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test
	public void fireFoxTest2()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test
	public void fireFoxTest3()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test
	public void fireFoxTest4()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test
	public void fireFoxTest5()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test
	public void fireFoxTest6()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	

}
