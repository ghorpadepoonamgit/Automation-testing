package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.Loginpage;

public class Base {

	public static WebDriver driver;
	public static void initialise()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
		   ChromeOptions opt= new ChromeOptions();
		   opt.addArguments("--disable-notifications");
		   driver=new ChromeDriver(opt);
		   driver.get("https://kite.zerodha.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		 
	}
}
