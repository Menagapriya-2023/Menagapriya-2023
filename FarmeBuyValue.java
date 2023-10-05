package week4.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FarmeBuyValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://buythevalue.in/");
		Thread.sleep(3000);
		
		//clicking first resulting product
		driver.findElement(By.linkText("URBAN FIT X SMART WATCH")).click();
		//To print the result
		String string = driver.findElement(By.linkText("URBAN FIT X SMART WATCH")).getText();
		System.out.println(string);
		Thread.sleep(3000);
		//To enter the zip code
		driver.findElement(By.id("wk_zipcode")).sendKeys("603103");
		//click on button to check the delivery availability
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		//add item to the cart
	   driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
		//To click view cart
	    driver.findElement(By.xpath("//span[text()='View Cart']")).click();
		//To click on checkout button
		driver.findElement(By.id("checkout")).click();
		//To handle the alert
		Alert alertprompt = driver.switchTo().alert();
		String message=alertprompt.getText();
		System.out.println(message);
		alertprompt.accept();

	}

}
