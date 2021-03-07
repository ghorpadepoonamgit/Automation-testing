package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet 
{


public static void main(String[] args ) throws IOException 
{
	String path="C:\\Users\\Infotech\\Desktop\\Book2.xlsx";
	FileInputStream File=new FileInputStream(path);
//	String data=WorkbookFactory.create(File).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue(); 
//	System.out.println(data);
  Sheet sheet =WorkbookFactory.create(File).getSheet("sheet1");
  int row=sheet.getLastRowNum()-sheet.getFirstRowNum();
  
  for (int i=0;i<=row;i++)
  {
	  int cell=sheet.getRow(i).getLastCellNum();
	  System.out.println("Row" + i+"data is :");
	  for(int j=0;j<cell;j++)
	  {
		  System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+",");
	  }
		 System.out.println();
     }
  }
}