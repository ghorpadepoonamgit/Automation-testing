package testclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.util.Utility;

import pages.Loginpage;
import pages.buyBSEshares;

public class SellBSE extends Base{

	WebDriver driver;
	@BeforeClass 
	public void beforeclass()
	{

		 Base.initialise();
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
	  buyshares.verifysellbutton();
	}
		
	@Test (priority=1)
	public void buysharesmarketorder() throws IOException
	{
		buyBSEshares h=new buyBSEshares(driver);
		Utility.takescreenshot("typename");
		h.BSEclick();
		h.sendqty();
		h.longtermclick();
		h.marketclick();
		h.verifypricemarketorder();
		h.verifytriggerpricemarket();
		h.buybuttonclick();		
	}
}
