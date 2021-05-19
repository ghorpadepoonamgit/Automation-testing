package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailG
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	Thread.sleep(5000);
	
	
	WebElement FirstName= driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
	FirstName.sendKeys("Aarohi");
	Thread.sleep(1000);
	
	WebElement LastName= driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	LastName.sendKeys("Patil");
	Thread.sleep(1000);
	
	WebElement UserName=driver.findElement(By.xpath("//input[@id='username']"));
	UserName.sendKeys("patil56aaru");
	Thread.sleep(1000);
	
	WebElement PassWord=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	PassWord.sendKeys("Pune@123");
	Thread.sleep(1000);
	
	WebElement ConFirm=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	ConFirm.sendKeys("Pune@123");
	Thread.sleep(1000);
	
	WebElement CheckBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	CheckBox.click();
	Thread.sleep(5000);
	WebElement Next=driver.findElement(By.xpath("(//div[@class=\"VfPpkd-RLmnJb\"])[2]"));
	Next.click();
	Thread.sleep(5000);
	
	WebElement PhoneNo=driver.findElement(By.xpath("//input[contains(@id,'phoneNumberId')]"));
	PhoneNo.sendKeys("8976543567");
	Thread.sleep(1000);
	
	WebElement Next1=driver.findElement(By.xpath("(//div[contains(@class,'VfPpkd-RLmnJb')])[1]"));
	Next1.click();
	String b=driver.getCurrentUrl();
	System.out.println(b);
	Thread.sleep(5000);
	driver.quit();
}  


}