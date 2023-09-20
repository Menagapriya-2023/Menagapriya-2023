package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver edit = new ChromeDriver();
		edit.manage().window().maximize();
		edit.get("http://leaftaps.com/opentaps/control/main");
		edit.findElement(By.id("username")).sendKeys("demosalesmanager");
		edit.findElement(By.id("password")).sendKeys("crmsfa");
		edit.findElement(By.className("decorativeSubmit")).click();
		edit.findElement(By.linkText("CRM/SFA")).click();
		edit.findElement(By.linkText("Leads")).click();
		edit.findElement(By.partialLinkText("Create")).click();
		edit.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		edit.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Menaga");
		edit.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Priya");
		edit.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Megna");
		edit.findElement(By.name("departmentName")).sendKeys("Testing");
		edit.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Testing Team");
		edit.findElement(By.name("primaryEmail")).sendKeys("menagapriyak91@gmail.com");
		 WebElement state = edit.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select option1=new Select(state);
		option1.selectByVisibleText("New York");
		edit.findElement(By.name("submitButton")).click();
		edit.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(1000);
		edit.findElement(By.xpath("//textarea[@name='description']")).clear();
		edit.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Team working on critical release");
		edit.findElement(By.className("smallSubmit")).click();
		String Lead = edit.getTitle();
		System.out.println(Lead);
		//edit.close();
		
		
		
		
		
		
		
		
	}

}
