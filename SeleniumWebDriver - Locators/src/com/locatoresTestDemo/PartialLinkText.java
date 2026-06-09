package com.locatoresTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkText
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void countLinks() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.partialLinkText("Supplements")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		
		System.out.println("Total Links in HollandAndBarret Application : " + linkCount);
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
			
			String str = link.getText();
			String str1 = "Supplements";
			
			if(str == str1)
			{
				driver.findElement(By.linkText("Supplements")).click();
				driver.findElement(By.xpath("//a[contains(@type,'button')])[4]")).click();
			}
		}
		
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}



