package seleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest
{
	 WebDriver driver;
		@Parameters({"bname"})
	
  @Test
  public void parallelTest(String bname) throws MalformedURLException, InterruptedException 
  
  {
	  if(bname.equals("chrome"))
	  {
	  ChromeOptions opt = new ChromeOptions();
	 URL url = new URL("http://localhost:4444/");
	  driver = new RemoteWebDriver(url,opt);
	 System.out.println("Remote connected with chrome");
	  
	  }else if(bname.equals("firefox"))
	  {
		  FirefoxOptions opt = new FirefoxOptions();
			 URL url = new URL("http://localhost:4444/");
			  driver = new RemoteWebDriver(url,opt);
			 System.out.println("Remote connected with firefox");
	  }else if(bname.equals("edge"))
	  {
		  EdgeOptions opt = new EdgeOptions();
			 URL url = new URL("http://localhost:4444/");
			  driver = new RemoteWebDriver(url,opt);
			 System.out.println("Remote connected with edge");
	  }
	  
	    Thread.sleep(15000);
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(10000);
	    System.out.println("Application title is:"+driver.getTitle());
	    
	    driver.quit();
	  
  }
}
