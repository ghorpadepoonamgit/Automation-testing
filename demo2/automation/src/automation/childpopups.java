package automation;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopups 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Infotech\\Videos\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.w3schools.com/js/js_popup.asp");
   driver.manage().window().maximize();
   
   WebElement alert=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
   WebElement confirm=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
   WebElement prompt=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
   WebElement linebreaks=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
   
   alert.click();
   confirm.click();
   prompt.click();
   linebreaks.click();
   
    String address=driver.getWindowHandle();
   System.out.println(address);
 
   ArrayList<String> adres1=new ArrayList<String>(driver.getWindowHandles());
   System.out.println(adres1.get(0));//get method in arraylist
   System.out.println(adres1.get(1));
   System.out.println(adres1.get(2));
   System.out.println(adres1.get(3));
   System.out.println(adres1.get(4));
   
   String URL;
   
   URL=driver.getCurrentUrl();
   System.out.println("main"+URL);
   
   driver.switchTo().window(adres1.get(1));
   URL=driver.getCurrentUrl();
   System.out.println(URL);
   
   
   driver.switchTo().window(adres1.get(2));
   URL=driver.getCurrentUrl();
   System.out.println(URL);
   
   driver.switchTo().window(adres1.get(3));
   URL=driver.getCurrentUrl();
   System.out.println(URL);
   
   driver.switchTo().window(adres1.get(4));
   URL=driver.getCurrentUrl();
   System.out.println(URL);
 //  driver.quit();
  
  
}
}
