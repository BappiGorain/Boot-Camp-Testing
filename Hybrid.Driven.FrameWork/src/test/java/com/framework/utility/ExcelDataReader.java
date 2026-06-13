package com.framework.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader
{
	XSSFWorkbook wb;
	
	public ExcelDataReader()
	{
		File src = new File("./TestData/testData.xlsx");
		try
		{
			FileInputStream file = new FileInputStream(src);
			wb = new XSSFWorkbook(file);
		} 
		catch(Exception ex)
		{
			System.out.println("Unable to load XLS file : " + ex.getMessage());
		}
	}
	
	public String getStringData(int sheetIndex, int row, int col)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
	}
	
	public String getStringData(String sheetName, int row, int col)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int col)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	}
	
}
