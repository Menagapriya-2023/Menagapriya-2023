package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_dataSourceId")).click();
		WebElement Select=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt=new Select(Select);
      opt.selectByValue("LEAD_EMPLOYEE");
      opt.selectByVisibleText("Employee");
      opt.selectByIndex(4);
      WebElement Select1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
      Select opt1=new Select(Select1);
      opt1.selectByVisibleText("Automobile");
      WebElement Select2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
      Select opt2=new Select(Select2);
      opt2.selectByValue("OWN_CCORP");
      driver.findElement(By.name("submitButton")).click();
     // driver.close();
      
      
      
      
    
      
      
      
      
      
      
      
      
      
      
      
      
		
		
		
		

	}

}
