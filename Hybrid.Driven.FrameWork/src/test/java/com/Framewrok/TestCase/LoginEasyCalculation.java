package com.Framewrok.TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.framework.page.BaseClass;
import com.framework.page.LoginPage;
import com.framework.utility.ExcelDataReader;

public class LoginEasyCalculation extends BaseClass
{
	@Test
	public void loginApp() throws Exception
	{
		ExcelDataReader excel = new ExcelDataReader();
		excel.getStringData("testData", 0, 0);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login_EasyCal(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
		Thread.sleep(10000);
		
	}
	
}
