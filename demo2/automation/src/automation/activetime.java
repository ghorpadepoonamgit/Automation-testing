package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


//code for multiple screenshots 

public class activetime 
{
	WebDriver driver;
	static int g=2;
	
	static void screenshot(WebDriver driver) throws IOException
	{
		
	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File v=new File("C:\\Users\\Infotech\\Videos\\screenshots\\"+ g +".jpg");
	g++;
		FileHandler.copy(s, v);	
	}

	
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://naveenautomationlabs.com");
		driver.manage().window().maximize();
		
		
		screenshot(driver);
		driver.navigate().to("https://www.facebook.com/");
		screenshot(driver);
		driver.navigate().back();
		screenshot(driver);
		driver.navigate().forward();
		
		driver.close();
	}
}
