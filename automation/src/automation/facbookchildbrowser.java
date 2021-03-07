package automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facbookchildbrowser 
{
 public static void main(String[] args) throws Exception
 {

	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\Captures\\chromedriver.exe");
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
	   
	   String add=driver.getWindowHandle();// main granparent facebook
	   String  a= driver.getCurrentUrl();
	   System.out.println(a);
	   System.out.println(add);
	   
	   ArrayList<String> add1=new ArrayList<String>(driver.getWindowHandles());//parent
	   System.out.println(add1.get(0));//get method in arraylist
	   System.out.println(add1.get(1));
	   
	   driver.switchTo().window(add1.get(1));
	   String b=driver.getCurrentUrl();
	   System.out.println(b);
	   
	   WebElement chrome=driver.findElement(By.xpath("//a[text()='Google Chrome']"));
	   chrome.click();
	   WebElement IE=driver.findElement(By.xpath("//a[text()='Internet Explorer']"));
	   IE.click(); 
	   
	   
	   ArrayList<String> cooki=new ArrayList<String>(driver.getWindowHandles());//for chlid tab
	   System.out.println(cooki.get(4));
	   System.out.println(cooki.get(5));
	  
	   driver.switchTo().window(cooki.get(4));
	   String c=driver.getCurrentUrl();
	   System.out.println(c);
	   WebElement Try=driver.findElement(By.xpath("//a[@role='button']"));
	   Try.click();
	   
	   ArrayList<String> try1=new ArrayList<String>(driver.getWindowHandles());//for child of child tab
	   System.out.println(try1.get(6));
	   
	   driver.switchTo().window(try1.get(6));
	   String t=driver.getCurrentUrl();
	   System.out.println(t);
	   Thread.sleep(2000);
	   driver.quit();
	   
	   
	   
  }
}
