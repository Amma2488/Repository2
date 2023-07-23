package Hybrid_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Reporter_Example_Word.ImageAttachmentInDocument1;
import Reporter_Example_Word.Reporter1;

public class HYBLOGOUT {
	WebDriver driver;
	
	ImageAttachmentInDocument1 IA1;
	Reporter1 R1;
	
	//ObjectRepository
	
	public void HYBLOGOUT(WebDriver driver1,ImageAttachmentInDocument1 IA2,Reporter1 R2) {	
		
		this.driver=driver1;
		this.IA1=IA2;
		this.R1=R2;
		
		
		
	}
	public void Logout() {
		driver.close();
	}
 
	

}
