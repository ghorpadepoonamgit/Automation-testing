package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamictables 
{
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			WebElement wc3= driver.findElement(By.xpath("//table[@id='customers']"));
			List<WebElement> row= wc3.findElements(By.tagName("tr"));
		  
			int a=row.size();
			for(int i=0;i<a;i++)
			{
				List<WebElement> col=row.get(i).findElements(By.tagName("td"));
				int b=col.size();
				for(int j=0;j<b;j++)
				{
					System.out.println(col.get(j).getText());
				}
	        }
	}

}