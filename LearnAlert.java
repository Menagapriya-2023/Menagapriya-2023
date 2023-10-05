package week4.day1.homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
List<WebElement> mobile = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		int total = mobile.size();
		
		System.out.println("Total number of mobiles "+total);
		
		List<Integer> numbers=new ArrayList<Integer> ();
		
		for(WebElement data: mobile) 
		{
			String price = (data.getText());
			
		String	priceText = price.replaceAll("[^0-9]", "");   
		
		int mobileprice = Integer.parseInt(priceText);
			numbers.add(mobileprice);
			
	  // System.out.println(mobileprice);

			}
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println("Lowest price mobilephone is " +numbers.get(0));

		
	}

}
