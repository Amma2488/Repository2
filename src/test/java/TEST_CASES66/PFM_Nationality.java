
package TEST_CASES66;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PFM_Pages.*;

public class PFM_Nationality{
	WebDriver driver;
	
	
  @Test
  public void M1() {
	  
	  

			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver(); //11112222
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
			driver.manage().window().maximize() ;	
			driver.get("https://opensource-demo.orangehrmlive.com/");
	
	       Login66 L1=new Login66();
	       L1.Login66(driver);
	       L1.Login6("Admin","admin123");
	       
	       Nation66 J1=new Nation66();
	       J1.Nation66(driver);
	       J1.addJobs("KKRvsRCB");
	       
	       Logout L2=new Logout();
	       L2.Logout(driver);
	       L2.Logout66();
	    		   
	  
	  
	  
  }
}
