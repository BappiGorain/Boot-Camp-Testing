package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy6 
{
	WebDriver driver;
    String url = "https://store.webkul.com";   
    
    @BeforeTest
    public void setUp() 
    {
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    
    
    @Test
    public void case6() throws InterruptedException
    {
    	Thread.sleep(20000);
    	String title = driver.getTitle();
    	System.out.println("Title : " + title);
    	List<WebElement> elements = driver.findElements(By.xpath("//a"));
    	for(WebElement ele : elements)
    	{
    		System.out.println(ele.getAttribute("href"));
    	}	
    }
    
    @AfterTest
    public void close() {
        driver.quit();
    }
}
