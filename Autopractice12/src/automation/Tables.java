package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables 
{
 public static void main(String[] args) 
  {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> row= driver.findElements(By.xpath("//table[@id='customers']//tr"));
	  
		int a=row.size();
		for(int i=2;i<=a;i++)
		{
			List<WebElement> col=driver.findElements(By.xpath("//table[@id='customers']//tr ["+i+"]//td"));
			int b=col.size();
			for(int j=0;j<b;j++)
			{
				System.out.println(col.get(j).getText());
			}
		}
  }
}
