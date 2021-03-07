package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Base {
    public static Properties prop=new Properties();
	public static WebDriver driver;
	public static void initialise()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\eclipse-workspace\\zerodha-banking-application\\broweser\\chromedriver.exe");
		   ChromeOptions opt= new ChromeOptions();
		   opt.addArguments("--disable-notifications");
		   driver=new ChromeDriver(opt);
		   driver.get("https://kite.zerodha.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		 
	}
	
	public void readproperties() throws IOException
	{
		prop =new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Infotech\\eclipse-workspace\\zerodha-banking-application\\propertiesFiles\\config.proerties");
		prop.load(ip);
	}
}
