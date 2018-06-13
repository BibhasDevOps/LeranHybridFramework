package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage 

{

WebDriver driver;
	
	public  Homepage (WebDriver driverl) 
	    {
		
	       this.driver=driverl;
		}

	@FindBy(how=How.CLASS_NAME, using="inputtext")
	
	WebElement Phone;
	
	@FindBy(how=How.ID, using="pass")
	WebElement Password;
	
	@FindBy(how=How.XPATH, using ="//*[contains(@type,'submit')]")
	WebElement Loginbtn;
	
	
	
	public void FB_Login(String usename, String password) 
	   {
		
		Phone.sendKeys(usename);
		Password.sendKeys(password);
		Loginbtn.click();
	
	   }
}
