package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
driver.findElement(By.name("field-keywords")).sendKeys("Bag for boys");
driver.findElement(By.id("nav-search-submit-button")).click();
String print= driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]")).getText();
System.out.println(print);
driver.findElement(By.xpath("//span[text()='Puma']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Skybags']")).click();
driver.findElement(By.xpath("//span[text()='Featured']")).click();
driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
String bags=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
System.out.println(bags);
String printdetails=driver.findElement(By.xpath("//span[contains(text(),'Unisex-Adult Classics Archive Backpack')]")).getText();
System.out.println(printdetails);
String title=driver.getTitle();
System.out.println(title);
//driver.close();
	}
}
