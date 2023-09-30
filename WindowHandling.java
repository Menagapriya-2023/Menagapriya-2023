package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.irctc.co.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//i[@class='fa fa-align-justify']")).click();
		 driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		 
		 Set<String> windowHandles=driver.getWindowHandles();
		 System.out.println(windowHandles);
		 
		 //set to List
		 
		List<String>windows= new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
			driver.close();
			//take back parent window 
			driver.switchTo().window(windows.get(0));
			//driver.switchTo().parentFrame();
			System.out.println(driver.getTitle());
		    driver.close();
			
	}
	       
	      

	}

