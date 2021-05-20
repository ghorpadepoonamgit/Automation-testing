package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouseoperations
{
 public static void main(String[] args) 
 {System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/b?ie=UTF8&node=17369456031");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement prime=driver.findElement(By.xpath("//span[text()='Prime']"));
	act.moveToElement(prime).perform();
	//WebElement source=driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
	//WebElement dest=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	//act.moveToElement(source).click().build().perform();
	//act.dragAndDrop(source, dest).click().build().perform();
//	WebDriverWait wait=new WebDriverWait(driver,20);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='multiasins-img-link']")));
//	WebElement join=driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
//	System.out.println("hi");
//	act.moveToElement(join).click().build().perform();
	JavascriptExecutor j=(JavascriptExecutor)driver;
//	j.executeScript("window.scrollBy(0,500)");
	WebElement eng=driver.findElement(By.xpath("//a[@id='icp-touch-link-language']"));
	j.executeScript("arguments[0].scrollIntoView();",eng);
	eng.click();
	
	
	
  }
}
