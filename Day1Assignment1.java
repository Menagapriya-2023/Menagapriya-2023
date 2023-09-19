package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();

	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
		 
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Menaga");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("K");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Menaga2023@gmail.com");
		 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("test@123");
		 WebElement aa=driver.findElement(By.xpath("//select[@id='day']"));
		    Select option=new Select(aa);
		    option.selectByIndex(3);
		    WebElement bb=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		    Select option1=new Select(bb);
		    option1.selectByVisibleText("May");
		    WebElement cc=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		    Select option2=new Select(cc);
		    option2.selectByValue("1984");
		 driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		 driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Menaga2023@gmail.com");
		 
		 
		    
		    
		    
		   
		    
		    
		    
		    

	}

}
