package autopract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Findelements 
{
  public static void main(String[] args) 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_iframe.asp");
		driver.manage().window().maximize();
		
		List<WebElement> L=driver.findElements(By.xpath("//a"));
		System.out.println(L);
		int a=L.size();
		System.out.println(a);
		for(int i=0;i<(a-1);i++)
		{
			L.get(i).click();
		}

  }
}
