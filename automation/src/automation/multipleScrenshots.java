package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class multipleScrenshots 
{
	
	//code for active time alert popups
	
	
    public static void main(String[] args) throws IOException 
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	    
		driver.manage().window().maximize();
	
		WebElement Uname=driver.findElement(By.xpath("//input[@id='username']"));
		Uname.sendKeys("admin");
		
		WebElement Password=driver.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		Password.sendKeys("manager");
		if(Uname.equals(Uname) && Password.equals(Password))
		{
			
	     WebElement login=driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]"));
		login.click();
		}
		else 
		{
			
			WebElement f2=driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
			f2.getText();
		}
		WebElement user=driver.findElement(By.xpath("(//img[@class='sizer'])[3]"));
		user.click();
		
		WebElement ADD=driver.findElement(By.xpath("//span[@unselectable='on']"));
		ADD.click();
		
		WebElement Fname=driver.findElement(By.xpath("//input[@id='userDataLightBox_firstNameField']"));
        Fname.sendKeys("komal");
        
        WebElement Lname=driver.findElement(By.xpath("//input[@id='userDataLightBox_usernameField']"));
        
 //       WebElement createuser=driver.findElement(By.xpath("//div[text()='Create User']"));
 //       createuser.click();
        
       WebElement cancle=driver.findElement(By.xpath("//div[text()='Cancel']"));
       cancle.click();
       Alert alt =driver.switchTo().alert();
       alt.dismiss();
    
       Lname.sendKeys("pawar");
     
      driver.close();
      
      
      
     
       
    }                   
}




















