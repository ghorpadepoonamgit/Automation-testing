package autopract;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframepractice 
{
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.w3schools.com/js/js_popup.asp");
	   driver.manage().window().maximize();
	   
	   WebElement aler=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
       aler.click();	
       ArrayList<String> D=new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(D.get(1));
       driver.switchTo().frame("iframeResult");
       WebElement Try=driver.findElement(By.xpath("//button[text()='Try it']"));
       Try.click();
       Alert B=driver.switchTo().alert();
       B.dismiss();
       driver.switchTo().defaultContent();
       
        
      
}
}
