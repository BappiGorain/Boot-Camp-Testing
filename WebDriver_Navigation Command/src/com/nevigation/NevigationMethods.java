package com.nevigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NevigationMethods
{
//	@Test(priority = 1)
//	public void navigationToMethod()
//	{
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.selenium.dev/downloads/");
//		String title = driver.getTitle();
//		System.out.println(title);
//		String url = driver.getCurrentUrl();
//		System.out.println(url);	
//	}
//	
//	@Test(priority = 2)
//	public void nagivateBack()
//	{
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.selenium.dev/downloads/");
//		String title = driver.getTitle();
//		System.out.println(title);
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		driver.navigate().to("https://google.com");
//		String title1 = driver.getTitle();
//		System.out.println(title1);
//		driver.navigate().back();
//		String title2 = driver.getTitle();
//		System.out.println(title2);
//		String url1 = driver.getCurrentUrl();
//		System.out.println(url1);
//		
//	}
//	
//	
//	@Test(priority = 3)
//	public void navigateRefresh()
//	{
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.hollandandbarrett.com/");
//		String title = driver.getTitle();
//		System.out.println(title);
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		driver.navigate().refresh();
//		
//	}
	
	
	@Test(priority = 4)
	public void nagivateForward()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://google.com");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		driver.navigate().back();
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		driver.navigate().forward();
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		
	}
	
	
}
