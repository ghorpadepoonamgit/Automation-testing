package autopract;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Moneycontrol
{
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable--notifications");
	WebDriver driver=new ChromeDriver(opt);
	
	driver.get("https://www.moneycontrol.com/news/tags/coronavirus.html");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Actions act=new Actions(driver);
	
	

	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,5000)");
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='» Markets']")));

	WebElement market=driver.findElement(By.xpath("//a[text()='» Markets']"));
	//j.executeScript("arguments[0].ScrollIntoView();", market);
	market.click();
	
	
  
	
	
   
}
}