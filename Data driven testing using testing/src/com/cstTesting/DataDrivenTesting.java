package com.cstTesting;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class DataDrivenTesting
{
	WebDriver driver;
	String webUrl = "https://only-testing-blog.blogspot.com/2014/05/form.html";
	String csvUrl = "C:\\Boot Camp Selenium Testing\\CsvFile\\testinBlog.csv";
	
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.navigate().to(webUrl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void perform() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvUrl));
		
		String[] csvCell;
		
		while((csvCell = reader.readNext()) != null)
		{
			String fName = csvCell[0];
			String lName = csvCell[1];
			String email = csvCell[2];
			String mNum = csvCell[3];
			String cName = csvCell[4];
			
			driver.findElement(By.name("FirstName")).sendKeys(fName);
			driver.findElement(By.name("LastName")).sendKeys(lName);
			driver.findElement(By.name("EmailID")).sendKeys(email);
			driver.findElement(By.name("MobNo")).sendKeys(mNum);
			driver.findElement(By.name("Company")).sendKeys(cName);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			
		}
		
		reader.close();
 		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
