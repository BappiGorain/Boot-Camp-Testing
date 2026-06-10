package com.alertsDemo.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPopups 
{
	WebDriver driver;
	String url = "https://ksrtc.in";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void testPopups() throws InterruptedException
	{
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("please enter a valid username"))
		{
			System.out.println("Correct alert message");
		}
		else
		{
			System.out.println("In-Correct alert message");
		}
		alert.accept();
//		alert.dismiss();  click on cancel button
	}
}
