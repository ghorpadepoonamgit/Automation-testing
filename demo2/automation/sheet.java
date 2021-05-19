package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet 
{


public static void main(String[] args ) throws IOException 
{
	String path="C:\\Users\\Infotech\\Desktop\\Book1.xlsx";
	FileInputStream File=new FileInputStream(path);
	String data=WorkbookFactory.create(File).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
  System.out.println(data);
}
}
