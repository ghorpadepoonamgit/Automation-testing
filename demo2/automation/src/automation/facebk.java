package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class facebk 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fdevelopers.facebook.com%2Fdocs%2Finternet-org%2F&locale=en_GB&display=page");
	driver.manage().window().maximize();
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
	File dest=new File("C:\\Users\\Infotech\\Videos\\screenshots\\output1.jpg");
	FileHandler.copy(source, dest);
     
	
	}
	

}
