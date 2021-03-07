package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomepageVerifytabs 
{
	WebDriver driver;
  @FindBy (xpath="//span[text()='Dashboard']")
  private WebElement dashBoard;
  
  @FindBy (xpath="(//span[text()='Orders'])[1]")
  private WebElement orders;
  
  @FindBy (xpath="(//span[text()='Holdings'])[1]")
  private WebElement holdings;
  
  @FindBy (xpath="//span[text()='Positions']")
  private WebElement positions;
  
  @FindBy (xpath="//span[text()='Funds']")
  private WebElement funds;
  
  @FindBy (xpath="//span[text()='Apps']")
  private WebElement apps;
   
  public HomepageVerifytabs(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
  
  public void verifyDashboard()
  {
	  dashBoard.click();
	  Assert.assertTrue(dashBoard.isDisplayed());  
  }
  public void verifyOrders()
  {
	  orders.click();
	  Assert.assertTrue(orders.isDisplayed());  
  }
  public void verifyHoldings()
  {
	  holdings.click();
	  Assert.assertTrue(holdings.isDisplayed());  
  }
  
  public void verifyPositions()
  {
	  positions.click();
	  Assert.assertTrue(positions.isDisplayed());  
  }
  public void verifyFunds()
  {
	  funds.click();
	  Assert.assertTrue(funds.isDisplayed());  
  }
  public void verifyApps()
  {
	  apps.click();
	  Assert.assertTrue(apps.isDisplayed());  
  }
}
