package testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomepageVerifytabs;
import pages.Loginpage;

public class Verifytabsonhomepage 
{
	WebDriver driver;
	@BeforeClass 
	public void beforeclass()
	{
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	   ChromeOptions opt= new ChromeOptions();
	   opt.addArguments("--disable-notifications");
	   driver=new ChromeDriver(opt);
	   driver.get("https://kite.zerodha.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	  
	}
	
	@BeforeMethod
	public void logINkite()
	{
	  Loginpage a=new Loginpage(driver);
	  a.sendusername();
	  a.sendpassword();
	  a.clickloginbutton();
	  a.PIN();
	  a.clickcontinuebutton();
	}
	@Test
	public void verifydashboardtab()
	{
		HomepageVerifytabs tab=new HomepageVerifytabs(driver);
		tab.verifyDashboard();
	}
	@Test
	public void verifyOrderstab()
	{
		HomepageVerifytabs tab=new HomepageVerifytabs(driver);
		tab.verifyOrders();
	}
	@Test
	public void verifyHoldingtab()
	{
		HomepageVerifytabs tab=new HomepageVerifytabs(driver);
		tab.verifyHoldings();
	}
	@Test
	public void verifyPositionstab()
	{
		HomepageVerifytabs tab=new HomepageVerifytabs(driver);
		tab.verifyPositions();
	}
	
	@Test
	public void verifyFundstab()
	{
		HomepageVerifytabs tab=new HomepageVerifytabs(driver);
		tab.verifyFunds();
	}
	@Test
	public void verifyappstab()
	{
		HomepageVerifytabs tab=new HomepageVerifytabs(driver);
		tab.verifyApps();
	}
	@AfterMethod
	public void logout()
	{
		Loginpage c= new Loginpage(driver);
        c.clickCM();
	    c.clicklogout();
	}
	
	@AfterClass 
	public void afterclass()
	{
		
		driver.quit();
	}

}
