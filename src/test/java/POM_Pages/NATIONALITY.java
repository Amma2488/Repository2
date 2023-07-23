package POM_Pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NATIONALITY {
	
	WebDriver driver;

	//Object Repository
	String AdminButton= "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span";
	String NationalityButton= "//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a";
	String AddNationalityButton= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button";
	String TextBox= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input";
	String Save= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]";
	
	public void NATIONALITY(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public void AddNationality(DataTable dataTable) throws Exception {
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<Map<String, String>> NationalityData=dataTable.asMaps(String.class,String.class);
		
		for(int i=0;i<NationalityData.size();i++) 
		{
			
			String Nation = NationalityData.get(i).get("Nationality");
			
			System.out.println("____________________________");
			

		driver.findElement(By.xpath(AdminButton)).click();
		driver.findElement(By.xpath(NationalityButton)).click();
		driver.findElement(By.xpath(AddNationalityButton)).click();
		driver.findElement(By.xpath(TextBox)).sendKeys(Nation);
		driver.findElement(By.xpath(Save)).click();
  
	}
}
}
