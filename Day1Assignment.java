package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	    driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("BusinessAccount3");
	    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	    WebElement aa=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	    Select option=new Select(aa);
	    option.selectByIndex(3);
	    WebElement bb=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	    Select option1=new Select(bb);
	    option1.selectByVisibleText("S-Corporation");
	    WebElement cc=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
	    Select option2=new Select(cc);
	    option2.selectByValue("LEAD_EMPLOYEE");
	    WebElement dd=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	    Select option3=new Select(dd);
	   option3.selectByIndex(6);
	   WebElement ee=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
	    Select option4=new Select(ee);
	   option4.selectByValue("TX");
	   driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	   String s1 ="BusinessAccount3";
	 String AccountName = driver.getTitle();
	 System.out.println(AccountName);
	   
	  if(AccountName.equals(s1)) {
		  System.out.println("Account created");
	   }else {
	   System.out.println("Account creation is failed");
	  }
	   
	   
	  // driver.close();
	    
	}
	

}
