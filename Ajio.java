package week3.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		
		//sending values to search in box
		
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		//click men in gender
		driver.findElement(By.xpath("//label[text()='Men (3,328)']")).click();
		//click fashion bags
		driver.findElement(By.xpath("//label[text()='Fashion Bags (921)']")).click();
		
		//print the numbers of bags found
		
		//String str=driver.findElement(By.id("products")).getText();
		String str=driver.findElement(By.xpath("//div[text()=' Items Found']")).getText();
		System.out.println(str);
		
		//print the list of brands found in the list
		String str1=driver.findElement(By.xpath("//div[@class='brand']")).getText();
		System.out.println(str1);

	}

}
