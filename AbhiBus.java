package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//span[text()='Bus']")).click();
	 driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	 
	 driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	//driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
	driver.findElement(By.xpath("//a[text()='Today']")).click();
	String print1 = driver.findElement(By.xpath("//h5[text()='Yolo Bus']")).getText();
	System.out.println(print1);
	driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
	String print2=driver.findElement(By.xpath("//div[@class='text-grey']")).getText();
	System.out.println(print2);
	driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='DU10']")).click();
	//driver.findElement(By.xpath("//div[@class='container checkbox-container  md ']")).click();
	driver.findElement(By.xpath("//p[text()='Sirsuri']")).click();
	driver.findElement(By.xpath("//p[text()='Attibele Toll Gate']")).click();
	String print3=driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']")).getText();
	System.out.println(print3);
	 String title = driver.getTitle();
	 System.out.println(title);
	 //driver.close();
	
	
	
	
	 
	 
	 
		

	}

}
