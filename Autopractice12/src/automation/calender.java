package automation;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender 
{
 public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\Captures\\chromedriver.exe" );
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.spicejet.com/");
	 driver.manage().window().maximize();
	 
	 WebElement dept=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 dept.click();
	 Date date=new Date();
	 Calendar cal= Calendar.getInstance();
	 cal.add(Calendar.DATE, 0);
	 date=cal.getTime();
	 System.out.println(date);

	 cal.add(Calendar.DATE, 1); 
	 System.out.println(date);
	 
}
}
