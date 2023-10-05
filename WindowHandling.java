package week4.day1.homeassignments;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//To click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//To click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on contacts
		driver.findElement(By.linkText("Contacts")).click();
		//click on merge contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		//To click widget from contact
		driver.findElement(By.xpath("(//input[@id='partyIdFrom'])/following::a")).click();
		//To handle windows
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);
				List <String>windows= new ArrayList<String>(windowHandles);
				driver.switchTo().window(windows.get(1));
		//to select first result
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		//To get back to main window
		windowHandles = driver.getWindowHandles();
		windows= new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		//To click widget To contact
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
		//child window
		driver.switchTo().window(windows.get(0));
  	  //To click merge
		driver.findElement(By.linkText("Merge")).click();	
		//To handle alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
	   String title= driver.getTitle();
	   System.out.println(title);
		

	}

}
