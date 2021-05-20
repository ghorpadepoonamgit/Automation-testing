package autopract;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activetime 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
    
	driver.manage().window().maximize();


	  String path ="C:\\Users\\Infotech\\Desktop\\Book3.xlsx";
	  FileInputStream File=new FileInputStream(path);
	  Sheet sheet=WorkbookFactory.create(File).getSheet("sheet1");
	  int rw=sheet.getLastRowNum()-sheet.getFirstRowNum();
	  
	  for (int i=0;i<=rw;i++)
	  {
		  int cell=sheet.getRow(i).getLastCellNum();
		  for(int j=0;j<=cell;j++)
		  {
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  String user=sheet.getRow(i).getCell(0).getStringCellValue();
			  WebElement Uname=driver.findElement(By.xpath("//input[@id='username']"));
              Uname.sendKeys(user);
              
              String pass=sheet.getRow(j).getCell(1).getStringCellValue();
		      WebElement Password=driver.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		      Password.sendKeys(pass);
		      Thread.sleep(2000);
		      WebElement login=driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]"));
			  login.click();
			  Thread.sleep(3000);
			 WebElement logout=driver.findElement(By.xpath("//a[@id='logoutLink']"));
			 logout.click();
		      Thread.sleep(2000);
	     }
		  Thread.sleep(2000);
       }
	  

    }
}
