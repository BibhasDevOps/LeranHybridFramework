package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataProvider.ConfigDataProvider;

public class BrowserFactory {
	
	     static WebDriver driver;
	
	public static WebDriver getBrowser(String Browsername)
	
	    {
		
		if(Browsername.equalsIgnoreCase("Firefox")) 
		{
			
			driver= new FirefoxDriver();
			
		}
		
		else if (Browsername.equalsIgnoreCase("Chrome"))
			
		{
			
			ConfigDataProvider config = new ConfigDataProvider();
			
			//System.getProperty("webdriver.chrome.driver",config.getChromePath());
			String Chrome=System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bibhas.barman\\\\Desktop\\\\Practice_Selenium\\\\chromedriver.exe");
             			
			driver = new ChromeDriver();
			
		}
		
		else if (Browsername.equalsIgnoreCase("IE"))
		
		{
			ConfigDataProvider config = new ConfigDataProvider();
			
			System.getProperty("webdriver.IE.driver",config.getIEPath());
			driver = new InternetExplorerDriver();
		
		}
		
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  return driver;
		  
		  
		}
	
	  
	         
	     public void closeBrowser(WebDriver ldriver)
	     {
	      
	    	    ldriver.quit();
	    	 
	     }

}
