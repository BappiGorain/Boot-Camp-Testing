package com.locatoresTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagNameDemo 
{
	@Test
	public void tagNames() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links : " + allLinks.size());
		
		for(WebElement link : allLinks)
		{
			System.out.println(link.isEnabled());
			System.out.println(link.isDisplayed());
			System.out.println(link.getAttribute("href"));
		}
		
		// Click only on 4th link
		WebElement link = allLinks.get(3);
		String expectedUrl = link.getAttribute("href");
		link.click();
		
		
		
		String currentUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equals(currentUrl))
		{
			System.out.println("Url is Matching");
		}
		else
		{
			System.out.println("Url is not Matching");
		}
	}
	
}
