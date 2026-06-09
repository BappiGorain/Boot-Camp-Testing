// WAP using selenium web driver and count and print the number of links in HollandAndBarret website

package com.locatoresTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTestDemo 
{
	
	WebDriver driver;
	int count = 0;
	
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
//		Thread.sleep(20000);
		driver.findElement(By.linkText("Vitamins & Supplements")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		count+=linkCount;
		
		System.out.println("Total Links : " + linkCount);
		
		for(WebElement link : links)
			System.out.println(link.getText());
		
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
