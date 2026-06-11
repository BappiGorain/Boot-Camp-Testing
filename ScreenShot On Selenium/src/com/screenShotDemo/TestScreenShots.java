package com.screenShotDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.library.Book;

public class TestScreenShots
{
	@Test
	public void takeScreenShot() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://auth.hollandandbarrett.com/u/login?");
		driver.manage().window().maximize();
		Book.captureScreenShot(driver, "A. Launch Application - TakeScreenShot");
		
		driver.findElement(By.id("username")).sendKeys("bappigorain@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Bappi@2003");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@name='action']")).click();
		
		Book.captureScreenShot(driver, "B. Click on sign in button - TakeScreenShot");
		
		driver.quit();
		
		
	}
	
}
