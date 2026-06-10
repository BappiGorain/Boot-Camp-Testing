/* 
 
WAP using Selenium web-driver to count the number of items 
from list-box in testautomationpractice application and print items listed in drop-down box use testNg framework
 
*/



package com.dropdownbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownBox 
{
	WebDriver driver;
	String url = "https://testautomationpractice.blogspot.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void dropdownList() throws InterruptedException
	{
		WebElement countryDropdown = driver.findElement(By.id("country"));
		Select countryList = new Select(countryDropdown);
		countryList.selectByIndex(3);
		Thread.sleep(5000);
		countryList.selectByVisibleText("India");
		Thread.sleep(5000);
		
		WebElement option = countryList.getFirstSelectedOption();
		String countIndex = option.getText();
		System.out.println("Country Index : " + countIndex);
		
		List<WebElement> c_List = countryList.getOptions();
		int countrySize = c_List.size();
		System.out.println("Country Size : " + countrySize);
		
		for(WebElement ele:c_List)
		{
			String countryName = ele.getText();
			System.out.println("Count Name : " + countryName);
		}
		
		
	}
}
