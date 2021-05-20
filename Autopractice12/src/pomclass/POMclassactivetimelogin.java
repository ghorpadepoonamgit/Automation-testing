package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class POMclassactivetimelogin 
{

	 @FindBy (xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[contains(@name,'pwd')]")
	private WebElement password;
	
	@FindBy (xpath="(//div[contains(text(),'Login')])[1]")
	private WebElement login;
	
	POMclassactivetimelogin(WebDriver driver_1)
	{
		PageFactory.initElements(driver_1, this);
	}
	
	public void sendUserName()
	{
		username.sendKeys("admin");
	}
	
	public void sendPassword()
	{
		password.sendKeys("manager");
	}
	
	public void Clickonloginbutton()
	{
		login.click();
		
	}
	
	public void gettextoflogin()
	{
		System.out.println(login.getText());
		
	}
}
