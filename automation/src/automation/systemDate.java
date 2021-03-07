package automation;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class systemDate
{
public static void main(String[] args) throws IOException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	

	 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\Users\\Infotech\\Videos\\screenshots\\currnt.jpg");
		
		FileHandler.copy(source,Dest);
	driver.close();
	 DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 Date date=new Date();
	 String date1=dateformat.format(date);
	 System.out.println("current Date & time is:"+date1);
	 
	 
}
}