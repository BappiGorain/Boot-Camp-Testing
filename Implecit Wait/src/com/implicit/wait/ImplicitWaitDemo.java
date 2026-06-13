package com.implicit.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo
{
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com");
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).sendKeys("Hyderabad",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).sendKeys("bhubaneswar",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		driver.findElement(By.id("trd_6_19/12/2026")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	}

}
