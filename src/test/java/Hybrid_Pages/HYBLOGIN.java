package Hybrid_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Reporter_Example_Word.ImageAttachmentInDocument1;
import Reporter_Example_Word.Reporter1;

public class HYBLOGIN {

	WebDriver driver;
	ImageAttachmentInDocument1 IA1;
	Reporter1 R1;

	//Object Repository
	String LoginButton="//button[@type='submit']";

	
	
	public void HYBLOGIN(WebDriver driver1,ImageAttachmentInDocument1 IA2,Reporter1 R2 ) {
		this.driver=driver1; //111222
		this.IA1=IA2;
		this.R1=R2;
	}
	
	public void Login(String UserName, String PassWord) {
		
		driver.findElement(By.name("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(PassWord);
		driver.findElement(By.xpath(LoginButton)).click();
		
	}
	
	
	
	
}
