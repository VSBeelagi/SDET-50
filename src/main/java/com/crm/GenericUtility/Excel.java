package com.crm.GenericUtility;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Excel {

	public HashMap<String,String> getMultipleDataFromExcel(String sheetName, int keyColumn, int valueColumn) throws Throwable
	{
		//fetching data from excel
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		int count = sh.getLastRowNum();
		
		HashMap<String, String> map = new HashMap<String, String>(); //empty map
		
		JavaUtility jLib = new JavaUtility();
		for(int i=0; i<=count; i++)
		{
			String key = sh.getRow(i).getCell(keyColumn).getStringCellValue();
			String value = sh.getRow(i).getCell(valueColumn).getStringCellValue();
			map.put(key, value);
		}
		
		
		return map;
}
}