package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class buySellNSEshares {

	WebDriver driver;
	
 
  @FindBy (xpath="//input[@id='search-input']")
  private WebElement search;
  
  @FindBy (xpath="//div//li[@class='search-result-item selected isadded']")
  private WebElement stockName; 
  
  @FindBy (xpath="(//button[@type='button'])[1]")
  private WebElement buy;
  
  @FindBy (xpath="(//button[@type='button'])[2]")
  private WebElement sell;
  
  @FindBy (xpath="(//label[@class='su-radio-label'])[2]")
  private WebElement NSE;
  
  @FindBy (xpath="(//label[@class='su-radio-label'])[1]")
  private WebElement BSE;
  
  @FindBy (xpath="(//label[@class='su-radio-label'])[3]")
  private WebElement regular;
  
  @FindBy (xpath="(//label[@class='su-radio-label'])[6]")
  private WebElement intraday;
  
  @FindBy (xpath="(//label[@class='su-radio-label'])[7]")
  private WebElement longterm;
  
  @FindBy (xpath="(//input[@type='number'])[1]")
  private  WebElement selectqty ;
  
  @FindBy (xpath="(//input[@type='number'])[2]")
  private WebElement price;
   
  @FindBy (xpath="(//input[@type='number'])[3]")
  private WebElement triggerPrice;
  
  @FindBy (xpath="(//label[@class='su-radio-label'])[8]")
  private WebElement market;
  
  @FindBy (xpath="(//label[@class='su-radio-label'])[9]")
  private WebElement limit;
  
  @FindBy (xpath="(//label[@class='su-radio-label'])[10]")
  private WebElement SL;
  
  @FindBy (xpath="(//label[@class='su-radio-label'])[11]")
  private WebElement SLM;
  
  @FindBy (xpath="//button[@class='submit']")
  private WebElement buyclick;
  
  @FindBy (xpath="//button[@class='button-outline cancel']")
  private WebElement cancle;
  
  @FindBy (xpath="//span[@class='icon icon-times close']")
  private WebElement errorclose;
  
  @FindBy (xpath="//div[@class='message']")
  private WebElement verifymsg;
  
  public  buySellNSEshares(WebDriver driver)
  {
	 this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void searchbar(String stockname)
  {   Actions act =new  Actions(driver);
      WebDriverWait wait=new WebDriverWait(driver,20);
      wait.until(ExpectedConditions.visibilityOf(search));
      act.moveToElement(search).perform();
	  search.sendKeys(stockname);
	  
  }
 
  public void stockname()
  {    Actions act =new  Actions(driver);
       WebDriverWait wait=new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.visibilityOf(stockName));
	  act.moveToElement(stockName).perform();
	  
  }
  
  public void verifybybutton()
  { Actions act =new  Actions(driver);
   WebDriverWait wait=new WebDriverWait(driver,20);
   wait.until(ExpectedConditions.visibilityOf(buy));
   act.moveToElement(buy).click().build().perform();
  }
  
  public void verifysellbutton()
  { Actions act =new  Actions(driver);
    WebDriverWait wait=new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.visibilityOf(sell));
    act.moveToElement(sell).click().build().perform();
	  
  }
 public void BSEclick()
 {
	 WebDriverWait wait = new WebDriverWait(driver,20);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='su-radio-label'])[1]")));
	  Actions act=new Actions(driver);
	  act.moveToElement(BSE).click().build().perform();
	  boolean a=BSE.isSelected();
	  if(a==true)
	  {
		  System.out.println("BSE is selected by default");
	  }
	  else
	  {
		  System.out.println(" BSE not selectd by default");
	  }
	 
 }
  
  public void NSEclick()
  { 
	  WebDriverWait w = new WebDriverWait(driver,20);
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='su-radio-label'])[2]")));
	  Actions act1=new Actions(driver);
	  act1.moveToElement(NSE).click().build().perform();
	  boolean a=NSE.isSelected();
	  if(a==true)
	  {
		  System.out.println(" NSE is selected by default");
	  }
	  else
	  {
		  System.out.println(" NSE is  not selectd by default");
	  }
  }
  
  
  public void longtermclick()
  {
	  longterm.click();
  }
  
  public void marketclick()
  {
	  market.click();
  }
  
  public void sendqty()
  {   selectqty.clear();
	  selectqty.sendKeys("5");
  }
  public void verifypricemarketorder()
  {
	Assert.assertFalse(price.isEnabled());

  }
  public void verifytriggerpricemarket()
  {
	 Assert.assertFalse(triggerPrice.isEnabled());

  }
  public void verifypricelimit()
  {
	Assert.assertTrue(price.isEnabled());
//	price.clear();
//	price.sendKeys("5");
  }
  public void verifytriggerpricelimit()
  {
	  Assert.assertFalse(triggerPrice.isEnabled());
	  
  }
  public void verifypriceSL()
  {
	  Assert.assertTrue(price.isEnabled());
  }
  public void verifytriggerpriceSL()
  {
	  Assert.assertTrue(triggerPrice.isEnabled());
  }
  public void verifypriceSLM()
  {
	  Assert.assertFalse(price.isEnabled());
  }
  public void verifytriggerpriceSLM()
  {
	  Assert.assertTrue(triggerPrice.isEnabled());
  }
  public void limitclick()
  {   WebDriverWait w = new WebDriverWait(driver,20);
      w.until(ExpectedConditions.visibilityOf(limit));
	  limit.click();
  }
   public void stoplossclick()
   {
	   SL.click();
   }
  public void stoplossmarketclick()
  {
	  SLM.click();
  }
   
  public void buybuttonclick()
  {
	  buyclick.click();
  }
  public void cancle()
  {
	  cancle.click();
  }
  
 /* public void verifyerrormsg()
  {
	  WebDriverWait wait1 = new WebDriverWait(driver,20);
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='message']")));
	  Actions act=new Actions(driver);
	  act.moveToElement(verifymsg).click().build().perform();
	  String b=verifymsg.getText();
	  if(b=="Markets are closed right now. Use GTT for placing long standing orders instead. Read more." )
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
	  errorclose.click();
  }
 */
  public void errorclose()
  {
	 // WebDriverWait wait1 = new WebDriverWait(driver,20);
	//  wait1.until(ExpectedConditions.visibilityOf(errorclose));
	  Actions m=new Actions(driver); 
	  m.moveToElement(errorclose).click().build().perform();
  }
  

}
