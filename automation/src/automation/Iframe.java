package automation;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe
{
  public static void main(String[] args) 
  {

	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.w3schools.com/js/js_popup.asp");
	   driver.manage().window().maximize();
	   
	   WebElement alert=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
       alert.click();
       
       ArrayList<String> D=new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(D.get(1));
       driver.switchTo().frame("iframeResult");
       WebElement Try=driver.findElement(By.xpath("//button[text()='Try it']"));
       Try.click();
       Alert alt=driver.switchTo().alert();
       alt.dismiss();
     //  driver.switchTo().parentFrame();
       driver.switchTo().defaultContent();
       
       
  }
}
