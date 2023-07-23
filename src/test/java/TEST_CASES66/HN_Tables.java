package TEST_CASES66;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;
import Hybrid_Pages.HYBLOGIN;
import Hybrid_Pages.HYBLOGOUT;
import Hybrid_Pages.HYBNATION;
import Reporter_Example_Word.ImageAttachmentInDocument1;
import Reporter_Example_Word.Reporter1;
import Reporter_Example_Word.*;

public class HN_Tables {
	
	 WebDriver driver;
	 String USERNAME,PASSSWORD,NATIONALITY;

	Map<String, HashMap<String, String>> DataTable = new HashMap<String, HashMap<String, String>>();

	 
	//Step1 - Reporter
		Reporter1 R1;
		ImageAttachmentInDocument1 IA1;
		String TestName;
		

  @Test
  public void M1() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();  // 111222
	  driver.manage().window().maximize() ;	
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		
	//changes start here
			SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
			Date now1 = new Date();
			String strDate1 = sdfDate1.format(now1);
			System.out.println("Date Time stamp :"+strDate1);
			TestName="ABC_Nationality_"+strDate1;
			// TestName="TC01_Add_Skills";
	  
	  
	  // Step2 changes start here
		IA1 = new ImageAttachmentInDocument1();
		IA1.CreateHeader("Test Case : " +TestName);
		R1= new Reporter1(driver, TestName );
		//changes end  here
		
		
		
		ExcelApiTest4 E1=new ExcelApiTest4();
		
		DataTable=E1.getDataTable("C:\\Users\\satis\\eclipse-workspace\\HYBRID666\\src\\test\\java\\Hybrid_Pages\\Test_INPUTS\\NewTest1.xlsx", "Sheet1");
		
		USERNAME=DataTable.get("ABC").get("USERNAME");
		PASSSWORD=DataTable.get("ABC").get("PASSSWORD");
		NATIONALITY=DataTable.get("ABC").get("NATIONALIT");
		
		
		HYBLOGIN L1=new HYBLOGIN();
		L1.HYBLOGIN(driver, IA1, R1); //111222
		L1.Login(USERNAME, PASSSWORD);
		
		HYBNATION J1=new HYBNATION();
		J1.HYBNATION(driver, IA1, R1);//111222
		J1.AddNationality(NATIONALITY);
		
		HYBLOGOUT H1=new HYBLOGOUT();
		H1.HYBLOGOUT(driver, IA1, R1);//111222
		H1.Logout();
		
		
		  
			 String Filename=IA1.WordOutput_File(TestName);		// to generate word document    
			 WordConvertPDF.main(Filename);// doc converted to PDF report
		
		


  }
}
