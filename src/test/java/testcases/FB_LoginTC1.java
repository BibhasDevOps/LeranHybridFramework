package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Homepage;

public class FB_LoginTC1

{
	@Test
    public void FBLoginTest() 
    {
        WebDriver driver= BrowserFactory.getBrowser("Chrome");
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
        
        driver.get(DataProviderFactory.getConfig().ApplicationURL());
    
            Homepage FB_Home = PageFactory.initElements(driver, Homepage.class);
        
    }
	
	

}
