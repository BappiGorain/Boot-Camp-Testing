package com.multipleFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleFrameDemo 
{
	
	WebDriver driver;
	String url = "file:///D:/OneDrive%20-%20Coforge%20Limited/Desktop/website.html";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	@Test
	public void frame() throws InterruptedException
	{
//		Thread.sleep(5000);
		int totalNumberOfFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalNumberOfFrames);
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("9334341721");
		driver.findElement(By.id("log_password")).sendKeys("Bappi");
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		
		
		driver.navigate().to(url);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();
		
		
//		driver.switchTo().frame("selenium");
//		driver.navigate().to("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		Thread.sleep(5000);
		String title1 = driver.getTitle();
		System.out.println("Title : " + title1);
		
		
//		driver.navigate().to(url);
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("/html/body/a")).click();
		
		driver.navigate().to(url);
		driver.switchTo().frame("My store");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String title2 = driver.getTitle();
		System.out.println("Title : " + title2);
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
