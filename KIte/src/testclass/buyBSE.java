package testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Loginpage;
import pages.buyBSEshares;


public class buyBSE
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
	  Loginpage a=new Loginpage(driver);
			a.sendusername();
			a.sendpassword();
			a.clickloginbutton();
			a.PIN();
			a.clickcontinuebutton();
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		buyBSEshares buyshares=new buyBSEshares(driver);
	  buyshares.searchbar("suzlon");
	  buyshares.stockname();
	  buyshares.verifybybutton();
	}
		
	@Test (priority=1)
	public void buysharesmarketorder()
	{
		buyBSEshares h=new buyBSEshares(driver);
		h.BSEclick();
		h.sendqty();
		h.longtermclick();
		h.marketclick();
		h.verifypricemarketorder();
		h.verifytriggerpricemarket();
		h.buybuttonclick();		
	}
		
	@Test(priority=2)
	public void buyshareslimitorder()
	{
		buyBSEshares k=new buyBSEshares(driver);
		k.BSEclick();
		k.longtermclick();
		k.limitclick();
		k.sendqty();
		k.verifypricelimit();
		k.verifytriggerpricelimit();
		k.buybuttonclick();
		
	}
	@Test(priority=3)
	public void buysharesSL()
	{
		buyBSEshares w=new buyBSEshares(driver);

		w.BSEclick();
		w.longtermclick();
		w.stoplossclick();
		w.sendqty();
		w.verifypriceSL();
		w.verifytriggerpriceSL();
		w.buybuttonclick();
		w.errorclose();
	}

	@Test(priority=4)
	public void buysharesSLM()
	{
		buyBSEshares s=new buyBSEshares(driver);

		s.BSEclick();
		s.longtermclick();
	    s.sendqty();
	    s.stoplossmarketclick();
		s.verifypriceSLM();
		s.verifytriggerpriceSLM();
		//s.cancle();
		s.buybuttonclick();
		
		}
		

	@AfterMethod
	public void aftermethod()
	{
		buyBSEshares k=new buyBSEshares(driver);
		k.errorclose();
	}
	
	@AfterClass 
	public void afterclass()
	{
		Loginpage c= new Loginpage(driver);
        c.clickCM();
	    c.clicklogout();
		driver.quit();
	}
	
}
