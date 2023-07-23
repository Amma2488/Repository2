package TEST_CASES66;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;
import POM_Pages.LOGIN;
import POM_Pages.LOGOUT;
import POM_Pages.NATIONALITY;

public class HybridNation {
	
	WebDriver driver; 
	String UserName,PassWord,Nationality;
	
  @Test
  public void M1() throws Exception {
	 
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver(); //111222 driver id
	  driver.manage().window().maximize(); 
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  ExcelApiTest4 E1=new ExcelApiTest4();
	  UserName=E1.getCellData("C:\\Users\\DELL\\OneDrive\\Documents\\Testcase.xlsx","Sheet4", 1, 0);
	  PassWord=E1.getCellData("C:\\Users\\DELL\\OneDrive\\Documents\\Testcase.xlsx","Sheet4", 1, 1);
	  Nationality=E1.getCellData("C:\\Users\\DELL\\OneDrive\\Documents\\Testcase.xlsx","Sheet4", 1, 2);
	  
	  LOGIN L1=new LOGIN(); //Creating an object
	  L1.LOGIN(driver);//111222 calling a driver
	  L1.Login(); //calling a method
	  
	  NATIONALITY N1=new NATIONALITY();
	  N1.NATIONALITY(driver);
	  N1.AddNationality();
	  
	  LOGOUT L2=new LOGOUT();
	  L2.LOGOUT(driver);
	  L2.Logout();
	  
  }
  
  
  
}
