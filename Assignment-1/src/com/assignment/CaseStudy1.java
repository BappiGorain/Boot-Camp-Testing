package com.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy1 
{
	@Test
	public void case1()
	{
		WebDriver driver = new ChromeDriver();
		String url = "https://www.login.hiox.com/register?referrer=easycalculation.com";
		driver.navigate().to(url);
		String title = driver.getTitle();
		String source = driver.getPageSource();
		int length = driver.getPageSource().length();
		System.out.println("url : " +url);
		System.out.println("Source :" + source);
		System.out.println("Length : " + length);
		driver.quit();
	}
	
	
	
}
