package PFM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login66 {

	WebDriver driver;
	
	//Object Repository
	@FindBy(name="username")
	WebElement USERNAME;
	
	@FindBy(name="password")
	WebElement PASSWORD;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginButton;
	
public void Login66(WebDriver driver1) {
	
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	
}
	
public void Login6(String UserName, String PassWord) {
		
	USERNAME.sendKeys(UserName);
	PASSWORD.sendKeys(PassWord);
	LoginButton.click();
		
	}
}
