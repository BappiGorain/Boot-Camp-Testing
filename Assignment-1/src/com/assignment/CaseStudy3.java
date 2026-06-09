package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy3
{
	@Test
	public void case3()
	{
		WebDriver driver = new ChromeDriver();
		String url = "https://www.easycalculation.com/";
		driver.navigate().to(url);

		List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));	
		
		System.out.println("Total Links : " + totalLinks.size());
		
		for(var link : totalLinks)
			System.out.println(link.getText());
		
//		driver.quit();
	}
}
