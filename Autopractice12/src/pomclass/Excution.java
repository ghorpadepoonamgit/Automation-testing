package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excution {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://localhost/login.do");
	    
	    POMclassactivetimelogin a=new POMclassactivetimelogin(driver);
	    a.sendUserName();
	    a.sendPassword();
	    a.Clickonloginbutton();
	    a.gettextoflogin();
	    
	    ActiveHOmepage p=new ActiveHOmepage(driver);
	    p.SelectUsernameFromdropdown();		
	    
	}

}
