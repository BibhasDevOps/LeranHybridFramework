package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	   public ConfigDataProvider() {
		   
		   
		   File src = new File ("./Configuration File/config.properties");
		   
		   try {
			   
			   
			FileInputStream fis = new FileInputStream(src);
			
			 pro = new Properties();
			
			
		} catch (FileNotFoundException e) 
		   
		{
			
			System.out.println("Exception display" + e.getMessage());
			
		}
		   
	    }
	   
	      public String getIEPath() 
	      {
	    	  
	    	  String url = pro.getProperty("url");
	    	  
	    	  return url;
	    	  
	      }
	
          public String getChromePath() 
          {
	    	  
	    	  String url = pro.getProperty("chromepath");
	    	  
	    	  return url;
	    	  
	      }
 
          public String getFirefoxPath() 
          {
	  
	      String url = pro.getProperty("FirefoxPath");
	  
	      return url;
	      
	      
	      }
          
          
          public String ApplicationURL() 
          {
        	  String url = pro.getProperty("url");
        	  
        	  return url;
          }
	

}
