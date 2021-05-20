package automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Childfacebook
{
 public static void main(String[] args) throws Exception  
 {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=http%3A%2F%2Fwww.google.com%2F&_rdr");
  // driver.manage().window().fullscreen();
   driver.manage().window().maximize();
   
   WebElement terms=driver.findElement(By.xpath("//a[@id='terms-link']"));
   WebElement datapolicy=driver.findElement(By.xpath("//a[@id='privacy-link']"));
   WebElement cookies=driver.findElement(By.xpath("//a[@id='cookie-use-link']"));
   
   terms.click();
   datapolicy.click();
   cookies.click();
   
   String add=driver.getWindowHandle();
   String  a= driver.getCurrentUrl();
   System.out.println(a);
   System.out.println(add);
   
  ArrayList<String> add1=new ArrayList<String>(driver.getWindowHandles());
  System.out.println(add1.get(0));
  System.out.println(add1.get(1));
  System.out.println(add1.get(2));
  System.out.println(add1.get(3));
  Thread.sleep(1000);
  
  String URL1; 
  
  URL1 =driver.getCurrentUrl();
  System.out.println(URL1);
  
  driver.switchTo().window(add1.get(1));
  URL1=driver.getCurrentUrl();
  System.out.println(URL1);
  
  driver.switchTo().window(add1.get(2));
  URL1=driver.getCurrentUrl();
  System.out.println(URL1);
  
  driver.switchTo().window(add1.get(3));
  URL1=driver.getCurrentUrl();
  System.out.println(URL1);
  
  driver.quit();
  
  
  
  
  
  
  
  
  
  
 }
}
