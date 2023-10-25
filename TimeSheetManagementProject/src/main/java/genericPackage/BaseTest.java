package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest extends Flib implements IautoConstant{ 
   
	protected static WebDriver driver;
	
   @BeforeMethod
   public void setUp() throws IOException
   {
	     Flib flib = new Flib(); 
	     String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
	     String url = flib.readPropertyData(PROP_PATH,"Url");
	      
	     if(browserValue.equalsIgnoreCase("chrome"))
	     {
	    	  driver=new ChromeDriver();
	     }
	     else if(browserValue.equalsIgnoreCase("firefox"))
	     {
	        driver=new FirefoxDriver();
	     }
	     else if(browserValue.equalsIgnoreCase("edge"))
	     {
	    	   driver=new EdgeDriver();
	     }
	     else
	     {
	    	 Reporter.log("Enter a Correct Browser Value",true);
	     }
	     
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get(url);
	     
	     
   }
   
   
   //create a generic resuable Method To take Screenshot Of Failed Method
   public void failedmethod(String failedMethodname) 
   {
 	         TakesScreenshot ts = (TakesScreenshot)driver;
 	         File src = ts.getScreenshotAs(OutputType.FILE);
 	         File dest = new File("./Screenshots/"+failedMethodname+".png");
 	      
 	         try
 	         {
 	        	 Files.copy(src, dest);
 	         }
 	         catch (IOException e)
 	         {
 	        	 
 	         }
   }
   
   @AfterMethod
   public void tearDown()
   {
	   driver.quit();
   }
}
