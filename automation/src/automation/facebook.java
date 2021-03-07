package automation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class facebook 
{
	//firstname=//input[@name='firstname']
	//surname=//input[@name='lastname']
	//email=//input[@id='contactpoint_step_input']
	//female=(//input[@id='sex'])[1]
	//date=//select[contains(@id,'day')]
	//month=//select[contains(@id,'month')]
	//year=//select[contains(@id,'year')]
	//password=//input[contains(@id,'password_step_input')]
	//submit=//input[contains(@name,'submit')]
 public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\Captures\\chromedriver.exe" );
	 WebDriver driver=new ChromeDriver();
     driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=http%3A%2F%2Fwww.google.com%2F&_rdr");
     driver.manage().window().maximize();
     
     WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
     firstname.sendKeys("Rohini");
     Thread.sleep(5000);
     WebElement Surname=driver.findElement(By.xpath("//input[@name='lastname']"));
     Surname.sendKeys("jagatap");
     WebElement Email=driver.findElement(By.xpath("//input[@id='contactpoint_step_input']"));
     Email.sendKeys("rohini678@gmail.com");
     WebElement Female=driver.findElement(By.xpath("(//input[@id='sex'])[1]"));
     Female.click();
     WebElement date=driver.findElement(By.xpath("//select[contains(@id,'day')]"));
     
     Select s=new Select(date);
     s.selectByVisibleText("10");
     
     WebElement month=driver.findElement(By.xpath("//select[contains(@id,'month')]"));
     Select p=new Select(month);
   //  p.selectByValue("5");
     List store=new ArrayList();
     List <WebElement> monthlist=p.getOptions();
     int totalmonth=monthlist.size();
     System.out.println(totalmonth);
   for(WebElement e:monthlist)
   {
	   String mon=e.getText();
	   System.out.println(mon);
	   store.add(mon);
	  
   }
     List temp=new ArrayList();
     temp.addAll(store);
    
     Collections.sort(temp);
     System.out.println(temp);
     
     WebElement year=driver.findElement(By.xpath("//select[contains(@id,'year')]"));
     Select g=new Select(year);
     g.selectByValue("1998");
     
     WebElement Password=driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]"));
     Password.sendKeys("Pune@4567");
     WebElement submit=driver.findElement(By.xpath("//input[contains(@name,'submit')]"));
     submit.click();
     
     driver.close();
     
 }
}
