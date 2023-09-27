package week3.day2.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		//click fashion bags
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		//print the numbers of bags found
		
		//String str=driver.findElement(By.id("products")).getText();
		String str=driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(str);
		
		//print the list of brands found in the list
		List <WebElement> bags= driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(bags);
		
		for(int i=0;i<bags.size();i++)
		{
			String text=bags.get(i).getText();
			System.out.println(text);
		}

	}

}
