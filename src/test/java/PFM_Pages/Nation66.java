package PFM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nation66 {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
	WebElement AdminButton;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")
	WebElement NationalityButton;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
	WebElement AddNationalityButton;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	WebElement TextBox;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
	WebElement Save;
	
	
	public void Nation66(WebDriver driver1){
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void addJobs(String Tesxtbox) {
		
		AdminButton.click();
		NationalityButton.click();
		AddNationalityButton.click();
		TextBox.sendKeys(Tesxtbox);
		Save.click();
		
	}
}

