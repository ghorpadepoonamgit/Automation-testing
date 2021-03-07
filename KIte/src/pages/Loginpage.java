package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;

public class Loginpage extends Base
{
	WebDriver driver;
 @FindBy (xpath="//input[@id='userid']")
 private WebElement Username;
 
 @FindBy (xpath="//input[@id='password']")
 private WebElement Password;
 
 @FindBy (xpath="//button[@class='button-orange wide']")
 private WebElement Loginbutton;
 
 @FindBy (xpath="//input[@id='pin']")
 private WebElement PIN;
 
 @FindBy (xpath="//button[@type='submit']")
 private WebElement Continue;
 
 @FindBy (xpath="//span[@class='user-id']")
 private WebElement CM;

 
 @FindBy (xpath="//a[@target='_self']")
 private WebElement logout;
 
 public Loginpage(WebDriver driver)
 {   
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void sendusername()
 {
	 Username.sendKeys("TG2076");
	 
 }
 
 public void sendpassword()
 {
	Password.sendKeys("3422280204");
	 
 }

 public void clickloginbutton()
 {
	 Loginbutton.click(); 
 } 
 
 public void PIN()
 {   
	 
	 PIN.sendKeys("891996");
 }
 
 public void clickcontinuebutton()
 {
	 Continue.click();
 }
 
 
 public void clickCM()
 {  
	 CM.click();
 }
 

 public void clicklogout()
 {

	  WebDriverWait wait1 = new WebDriverWait(driver,30);
	  wait1.until(ExpectedConditions.visibilityOf(logout));
	  Actions act=new Actions(driver);
	  act.moveToElement(logout).click().build().perform();
 }

}
