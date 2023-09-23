package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//h5[text()='Tri State Checkbox'])/following::div[5]")).click();
	  driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	  String status=  driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::div[3]")).getText();
	  System.out.println(status);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//li")).click();
	 
	 boolean enable=driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).isEnabled();
     System.out.println(enable);
     
   //  driver.close();




		
		
		
		
	}

}
