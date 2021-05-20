package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class AA
{
public static void main(String[] args) throws Exception
  {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\Captures\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
    driver.get("https://wanikirtesh.github.io/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
   // WebElement selectfilters=driver.findElement(By.xpath("//select[@id='selDetails']/option"));
 //   Actions actions=new Actions(driver);
//    Select s=new Select(selectfilters);
//    List<WebElement> lst = s.getOptions();
//  
//    System.out.println("The dropdown options are:"+lst);
//    for (WebElement option : lst) {
//
//        if("region".equals(option.getText()))
//
//            option.click(); 
    List<WebElement> l= driver.findElements(By.xpath("//select[@id='selDetails']/option"));
    for (int i = 0; i < l.size(); i++) 
    {
		if (l.get(i).getText().equalsIgnoreCase("region"))
		{
			l.get(i).click();
			Thread.sleep(3000);
		}
		
	}
    for (int j = 0; j < l.size(); j++) 
    {
		if (l.get(j).getText().equalsIgnoreCase("department"))
		{
			l.get(j).click();
			Thread.sleep(6000);
		}
		
	}
    
//    driver.findElement(By.xpath("//select[@id='fltregion']/option[text()='UAE']")).isEnabled();
//    driver.findElement(By.xpath("//select[@id='fltregion']/option[text()='UAE']")).click();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//select[@id='fltregion']/option[text()='UAE']")).click();
//    Thread.sleep(3000);
    
//    Select s= new Select(driver.findElement(By.xpath("//select[@id='fltregion']")));
//    s.selectByVisibleText("UAE");
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//select[@id='fltdepartment']/option[text()='Marketing']")).isEnabled();
//    driver.findElement(By.xpath("//select[@id='fltdepartment']/option[text()='Marketing']")).click();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//select[@id='fltdepartment']/option[text()='Marketing']")).click();
//    Thread.sleep(3000);
//  
//    Select s1= new Select(driver.findElement(By.xpath("//select[@id='fltdepartment']")));
//    s1.selectByVisibleText("Marketing");
//    Thread.sleep(3000);
    List<WebElement> l2= driver.findElements(By.xpath("//select[@id='fltregion']/option"));
    for (int m = 0; m< l2.size(); m++) 
    {
    l2.get(2).click();
    break;
//		if (l2.get(m).getText().equalsIgnoreCase("UAE"))
//		{
//			l2.get(m).click();
//			Thread.sleep(7000);
//		}
//		
	}
//    
//    List<WebElement> l1= driver.findElements(By.xpath("//select[@id='fltdepartment']/option"));
//    for (int k = 0; k < l1.size(); k++) 
//    {
//		if (l1.get(k).getText().equalsIgnoreCase("Marketing"))
//		{
//			l1.get(k).click();
//			Thread.sleep(7000);
//		}
//		
//	}
    
    WebElement report=driver.findElement(By.xpath("//button[@id='btnGen']"));
    report.click();
    Thread.sleep(7000);
   
//    List<WebElement> l3= driver.findElements(By.xpath("//table[@id='rpt']/tbody/tr"));
//    if (l1.size()==9) 
//    {
//    	System.out.println("there are 9 records");
//    	//Assert.assertTrue(true);
//	} 
//    else
//	     {
//		//Assert.assertTrue(false);
//		System.out.println("no 9 records");
//	     }
//    
//   List<WebElement> tb=driver.findElements(By.xpath("//table[@id='rpt']/tbody/tr/td/input"));
//    for(int s=0;s<=tb.size();s++)
//    {
//       if(tb.get(s).isSelected())
//       {
//    	   System.out.println("pass");
//       }
//       else
//       {
//    	   System.out.println("fail");
//       }
//    }
   
       
   // s.selectByVisibleText("region");
   // WebElement  dept=driver.findElement(By.xpath("(//select[@id=\\\"selDetails\\\"]//option)[1]"));
   // Actions Act=new Actions(driver);
    //Act.moveToElement(dept).click().build().perform();
 
   // S.selectByValue("region");
        }
    }
//}
