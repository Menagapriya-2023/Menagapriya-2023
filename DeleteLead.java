package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver page = new ChromeDriver();
		page.manage().window().maximize();
		page.get("http://leaftaps.com/opentaps/control/main");
		page.findElement(By.id("username")).sendKeys("demosalesmanager");
		page.findElement(By.id("password")).sendKeys("crmsfa");
		page.findElement(By.className("decorativeSubmit")).click();
		page.findElement(By.linkText("CRM/SFA")).click();
		page.findElement(By.linkText("Leads")).click();
		page.findElement(By.linkText("Find Leads")).click();
		page.findElement(By.linkText("Phone")).click();
		//page.findElement(By.name("phoneCountryCode")).sendKeys("1");
		//page.findElement(By.name("phoneAreaCode")).sendKeys("91");
		page.findElement(By.name("phoneNumber")).sendKeys("99");
		page.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(1000);
		page.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		page.findElement(By.linkText("Delete")).click();
		page.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		page.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		page.findElement(By.linkText("Find Leads")).click();
		page.findElement(By.name("id")).sendKeys("10059");
		page.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String s1="No records to display";
		 page.findElement(By.xpath("//div[text()='No records to display']")).getText();
		  String s2 ="No records to display";
			String Lead = page.getTitle();
			System.out.println(Lead);
			
			if (Lead.equals(s2))
			{
				System.out.println("No records to display");
			}
				else {
					System.out.println("Records found");
				}
		
		}
}
		
		 
		  //page.close();
		
		

