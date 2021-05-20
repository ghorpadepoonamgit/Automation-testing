package com.datadrivenactivetime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Helloeactivetime 
{
	WebDriver driver;
  @FindBy (xpath="//input[@id='username']")
  private WebElement user;
  
  @FindBy (xpath="//input[contains(@name,'pwd')]")
  private WebElement password;
  
  @FindBy (xpath="(//div[contains(text(),'Login')])[1]")
  private WebElement login;
  
  @FindBy (xpath="//a[@id='logoutLink']")
  private WebElement logout;
  
 public Helloeactivetime(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
  
 
  
}
