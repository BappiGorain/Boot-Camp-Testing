package com.handover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandOver 
{
	
	WebDriver driver;
	String url = "https://www.nopcommerce.com/en";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		 driver.navigate().to(url);
		 driver.manage().window().maximize();
	}
	
	@Test
	public void performOperation() throws InterruptedException
	{
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Support & services']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Training']")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(5000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> images = driver.findElements(By.tagName("img"));
		Thread.sleep(5000);
		System.out.println("Total Links : " + links.size());
		System.out.println("Total images : " + images.size());
		
		Thread.sleep(5000);  
		driver.quit();
		
	}
	
	
	

}
