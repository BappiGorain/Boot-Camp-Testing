package com.library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Book {

	
	public static void captureScreenShot(WebDriver driver, String screenShotName)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./ScreenShot/" + screenShotName + ".png"));
			System.out.println("Captured ScreenShot - By Selenium Webdriver");
		}
		catch(Exception e)
		{
			System.out.println("Cannot Take Screen Shot");
		}
	}
}
