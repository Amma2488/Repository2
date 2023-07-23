package PFM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	WebDriver driver;
	
	
public void Logout(WebDriver driver1) {	
	
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	
	
}
public void Logout66() {
	driver.close();
}
	

}
