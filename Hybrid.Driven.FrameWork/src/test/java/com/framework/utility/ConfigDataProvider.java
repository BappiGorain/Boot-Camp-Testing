package com.framework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigDataProvider 
{
	Properties pro;
	public ConfigDataProvider()
	{
		File src = new File("./configuration/config.properties");
		try
		{
			FileInputStream file = new FileInputStream(src);
			pro = new Properties();
			pro.load(file);
		} 
		catch(Exception ex)
		{
			System.out.println("Unable to load XLS file : " + ex.getMessage());
		}
	}
	
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	
	public String getAppUrl()
	{
		return pro.getProperty("AppUrl");
	}
	
	
	
	
	
}
