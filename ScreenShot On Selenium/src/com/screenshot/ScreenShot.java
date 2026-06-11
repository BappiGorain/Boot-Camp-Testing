package com.screenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot 
{
    WebDriver driver;

    String url = "https://www.flipkart.com/";  
    
    @BeforeTest
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @Test
    public void screenShot() throws Exception
    {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("./ScreenShot/homepage.png"));
        driver.quit();
    }
}