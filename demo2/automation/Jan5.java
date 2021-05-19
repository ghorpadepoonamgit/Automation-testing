package automation;




import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jan5 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Infotech\\Videos\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
driver.get("https://www.joinindiannavy.gov.in/");
	Thread.sleep(5000);
	
	String b=driver.getCurrentUrl();
	System.out.println(b);
	
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().refresh();
	
	driver.navigate().back();
	driver.navigate().forward();
	Thread.sleep(5000);
	
	String a=driver.getTitle();
	System.out.println(a);
	
	

	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	Dimension d=new Dimension(500,900);
	driver.manage().window().setSize(d);
	Thread.sleep(5000);
	
	
	Point p=new Point(200,100);
	driver.manage().window().setPosition(p);
	Thread.sleep(5000);
	
driver.close();
Thread.sleep(5000);





}
}
