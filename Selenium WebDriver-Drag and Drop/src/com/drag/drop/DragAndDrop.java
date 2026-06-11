/*
 * 
 * Lunch Edge Browser
 * navigate to "https://jqueryui.com/droppable/" url
 * search for 'Drag me to my target'
 * double click on 'Drag me to my target'
 * drag to 'Drop here'
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

package com.drag.drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop 
{
	WebDriver driver;
	String url = "https://jqueryui.com/droppable/";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void dragAndDrop()
	{
		driver.switchTo().frame(0);
		Actions actions = new Actions(driver);
		actions.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
		.release().build().perform();
	}
	
	
}
