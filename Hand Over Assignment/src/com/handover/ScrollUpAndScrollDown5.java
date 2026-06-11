package com.handover;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDown5 
{
	
	WebDriver driver;
	String url = "https://only-testing-blog.blogspot.com/";
	
	@org.testng.annotations.Test
	public void scroll() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		((JavascriptExecutor) driver).executeScript("scroll(0,6600)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)","");
	}

}
