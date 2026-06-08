package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingChromeBrowser
{
	
		@Test
		public void chromeBrowserTest1()
		{
			WebDriver driver = new ChromeDriver();
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
		public void chromeBrowserTest2()
		{
			WebDriver driver = new ChromeDriver();
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
		public void chromeBrowserTest3()
		{
			WebDriver driver = new ChromeDriver();
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
		public void chromeBrowserTest4()
		{
			WebDriver driver = new ChromeDriver();
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
		public void chromeBrowserTest5()
		{
			WebDriver driver = new ChromeDriver();
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
		public void chromeBrowserTest6()
		{
			WebDriver driver = new ChromeDriver();
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
