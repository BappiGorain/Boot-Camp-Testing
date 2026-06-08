package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeBrowserBrowser
{
	@Test
	public void edgeBrowserTest1()
	{
		WebDriver driver = new EdgeDriver();
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
	public void edgeBrowserTest2()
	{
		WebDriver driver = new EdgeDriver();
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
	public void edgeBrowserTest3()
	{
		WebDriver driver = new EdgeDriver();
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
	public void edgeBrowserTest4()
	{
		WebDriver driver = new EdgeDriver();
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
	public void edgeBrowserTest5()
	{
		WebDriver driver = new EdgeDriver();
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
	public void edgeBrowserTest6()
	{
		WebDriver driver = new EdgeDriver();
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
