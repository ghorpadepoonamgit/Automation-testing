package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ActiveHOmepage
{
	
 @FindBy (xpath="//img[@id='ext-gen7']")
 private WebElement selectuser;
 
 ActiveHOmepage(WebDriver driver_2)
 {
	 PageFactory.initElements(driver_2, this);
 }
 
 public void SelectUsernameFromdropdown()
 {
	 Select r =new Select(selectuser);
	r.selectByIndex(1);
	 
 }
	
	
}
