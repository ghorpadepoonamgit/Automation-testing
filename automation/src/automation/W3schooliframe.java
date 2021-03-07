package automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class W3schooliframe 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_iframe.asp");
		driver.manage().window().maximize();
		WebElement TRY=driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		TRY.click();
		
	ArrayList<String> P=new ArrayList<String>(driver.getWindowHandles());
	System.out.println(P.get(0));
    System.out.println(P.get(1));
    driver.switchTo().window(P.get(1));  
    
    driver.switchTo().frame("iframeResult");
    WebElement ifrmae2=driver.findElement(By.xpath("//iframe[@title='W3Schools Free Online Web Tutorials']"));
    driver.switchTo().frame(ifrmae2);
    
    WebElement login=driver.findElement(By.xpath("//button[@id='w3loginbtn']"));
    login.click();
    String V=login.getText();
    System.out.println(V);
    
    driver.switchTo().parentFrame();
    driver.switchTo().parentFrame();
    WebElement run=driver.findElement(By.xpath("//button[text()='Run »']"));
    run.click();
		
	}

}
