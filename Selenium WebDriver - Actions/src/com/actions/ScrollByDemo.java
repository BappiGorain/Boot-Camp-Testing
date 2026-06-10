package com.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollByDemo {
	
	
	WebDriver driver;
	String url = "https://easycalculation.com/";
	int linkCount;
	List<WebElement> list;

	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void actionCommandsTest()
	{
		WebElement element = driver.findElement(By.xpath("//a[@href='#']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		
		list = driver.findElements(By.xpath("a"));
		System.out.println("Number of links : " + list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
	}
}
