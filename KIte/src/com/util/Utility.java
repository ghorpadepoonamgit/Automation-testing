package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.base.Base;

public class Utility extends Base{
	static WebDriver driver;
   public static void takescreenshot(String getmethod) throws IOException
   {
	 File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     try {

	  File dest =new File("C:\\Users\\Infotech\\Videos\\screenshots\\"+getmethod+".jpg");
	  FileHandler.copy(source, dest);
    }
    catch(Exception e) {
	e.printStackTrace();
  }
	
  }
/*
public static String getdatafromexcelsheet(int row,int col) throws EncryptedDocumentException, IOException
{ String data;
  FileInputStream a=new FileInputStream("");
   Sheet sheet=WorkbookFactory.create(a).getSheet("sheet1");
   try {
	   data=sheet.getRow(row).getCell(col).getStringCellValue();
   }
   catch(Exception e){
	   
	   int d=(int)sheet.getRow(row).getCell(col).getNumericCellValue();
	   data=Integer.toString(d);
   }
   return data;
}*/
}