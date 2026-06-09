package com.compareValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ComparingValuesDemo
{
	
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";
	String expectedValue = "Logged In Successfully";
	
	@BeforeTest
	public void beforeCompare()
	{
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void compare()
	{
		
		
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String actualValue = driver.findElement(By.xpath("//h1[@class='post-title']")).getText();
		
		if(expectedValue.equals(actualValue))
		{
			System.out.println("Value is matching");
		}
		else
		{
			System.out.println("Value is not matching");
		}
	}

	@AfterTest
	public void afterCompare()
	{
		driver.quit();
	}
}
