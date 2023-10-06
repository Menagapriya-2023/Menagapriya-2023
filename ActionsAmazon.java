package week4.day2.homeassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");

		// to search the phone
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");

		// To click search button
		driver.findElement(By.id("nav-search-submit-button")).click();

		// to get the first displayed mobile price
		String str = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(str);

		// To get the customer ratings
		// String str1 = driver.findElement(By.xpath("//span[text()='8,201ratings']")).getText();
		// System.out.println(str1);

		// To click the first text link of the first page
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();

		// To handle windows
		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));

		// step-1-snap
		File source = driver.getScreenshotAs(OutputType.FILE);

		// step-2-folder
		File destination = new File("./Screenshot/img1.png");

		// step3
		FileUtils.copyFile(source, destination);

		Thread.sleep(3000);

		// Add to cart button
		driver.findElement(By.xpath("(//input[@name='submit.add-to-cart'])[1]")).click();

		// Get the cart subtota1
		String str3 = driver.findElement(By.xpath("//span[@id='sc-subtotal-label-buybox']")).getText();
		System.out.println(str3);

		// driver.close();

	}

}
