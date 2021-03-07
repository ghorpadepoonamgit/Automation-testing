package com.testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pomclasses.PomLoginPage;
import com.pomclasses.VerifyHomePagesTabs;



public class VerifyHomeTest1  extends Base {
	WebDriver driver;
	@BeforeClass 
	public void beforeclass()
	{
	   Base.initialise();
		PomLoginPage a=new PomLoginPage(driver);
		a.sendusername();
	}
	
	@BeforeMethod
	public void logINkite()
	{
		PomLoginPage a=new PomLoginPage(driver);
	 // a.sendusername();
	  a.sendpassword();
	  a.clickloginbutton();
	  a.PIN();
	  a.clickcontinuebutton();
	}
	@Test (groups="first",priority=1,invocationCount=3)
	public void verifydashboardtab()
	{
		VerifyHomePagesTabs tab=new VerifyHomePagesTabs(driver);
		tab.verifyDashboard();
	}
	@Test(groups="first",priority=2)
	public void verifyOrderstab()
	{
		VerifyHomePagesTabs tab=new VerifyHomePagesTabs(driver);
		tab.verifyOrders();
	}
	@Test(groups="first",priority=3)
	public void verifyHoldingtab()
	{
		VerifyHomePagesTabs tab=new VerifyHomePagesTabs(driver);
		tab.verifyHoldings();
	}
	@Test(enabled=false)
	public void verifyPositionstab()
	{
		VerifyHomePagesTabs tab=new VerifyHomePagesTabs(driver);
		tab.verifyPositions();
	}
	
	@Test(enabled=false)
	public void verifyFundstab()
	{
		VerifyHomePagesTabs tab=new VerifyHomePagesTabs(driver);
		tab.verifyFunds();
	}
	@Test(enabled=false)
	public void verifyappstab()
	{
		VerifyHomePagesTabs tab=new VerifyHomePagesTabs(driver);
		tab.verifyApps();
	}
	@AfterMethod
	public void logout()
	{
		PomLoginPage c= new PomLoginPage(driver);
        c.clickCM();
	    c.clicklogout();
	}
	
	@AfterClass 
	public void afterclass()
	{
		
		driver.quit();
	}

}
