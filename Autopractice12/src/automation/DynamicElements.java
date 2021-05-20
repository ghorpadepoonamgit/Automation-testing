package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements 

{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Infotech\\Videos\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/s?k=oneplus&rh=n%3A1389432031&ref=nb_sb_noss");
  // driver.manage().window().fullscreen();
   driver.manage().window().maximize();
     WebElement link=driver.findElement(By.xpath("(//div[@class='a-row a-size-small']//span[2]//a[1]//span)[4]"));
  link.click();;
}
}

//dynamic xpath for rating
//(//div[@class='a-row a-size-small']//span[2]//a[1]//span)[4]