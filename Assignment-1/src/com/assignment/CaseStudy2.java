package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy2 
{
	@Test
	public void case2()
	{
		WebDriver driver = new ChromeDriver();
		String url = "https://www.easycalculation.com/";
		driver.navigate().to(url);

		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
		
		String title = driver.getTitle();
		String source = driver.getPageSource();
		int length = driver.getPageSource().length();
		System.out.println("url : " +url);
		System.out.println("Source :" + source);
		System.out.println("Length : " + length);	
		
		driver.quit();
	}
}
