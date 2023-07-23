package Hybrid_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ExcelUtil.ExcelApiTest4;
import Reporter_Example_Word.ImageAttachmentInDocument1;
import Reporter_Example_Word.Reporter1;

public class HYBNATION {
	
	WebDriver driver;
	ImageAttachmentInDocument1 IA1;
	Reporter1 R1;
	
	//Object Repository
		String AdminButton= "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span";
		String NationalityButton= "//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a";
		String AddNationalityButton= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button";
		String TextBox= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input";
		String Save= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]";
		
		
		public void HYBNATION(WebDriver driver1, ImageAttachmentInDocument1 IA2, Reporter1 R2) {
			this.driver=driver1;
			this.IA1=IA2;
			this.R1=R2;
		}
		
		public void AddNationality(String Nationality) {
			driver.findElement(By.xpath(AdminButton)).click();
			driver.findElement(By.xpath(NationalityButton)).click();
			driver.findElement(By.xpath(AddNationalityButton)).click();
			driver.findElement(By.xpath(TextBox)).sendKeys(Nationality);
			driver.findElement(By.xpath(Save)).click();
	  
		}
	}

		
		
	
	
	
	


