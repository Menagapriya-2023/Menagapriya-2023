package week4.day2.homeassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class SnapdealActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");

		// mouse over action on Men's fashion
		WebElement mouseOver = driver.findElement(By.linkText("Men's Fashion"));
		Actions obj = new Actions(driver);

		// perform()-mandatory
		obj.moveToElement(mouseOver).perform();

		// click actions on sport shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();

		// To print the number shoes
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Total number of shoes is " + count);

		// To click on training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		// To click on sort
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']/following-sibling::div")).click();

		// To click low to high
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		String s1 = "Price Low To High";

		String s2 = driver.findElement(By.xpath("//div[@class='sort-drop clearfix']/div")).getText();
		System.out.println(s2);

		// To Check if the displayed items are sorted correctly.
		if (s1.equals(s2)) {
			System.out.println("Sorted as expected order");
		} else {
			System.out.println("Sorted in Incorrect order");
		}

		WebElement clickable = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll left')]"));
		Actions obj1 = new Actions(driver);

		obj1.moveToElement(clickable, 200, 300).perform();
		// To click color
		driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list active-filter']//label")).click();

		// mouseover on the first resulting product
		WebElement mouseOver1 = driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"));
		Actions obje = new Actions(driver);
		obje.moveToElement(mouseOver1).perform();
		
		// To click quick view button
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		//To handle windows
		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		// Print the cost and the discount percentage.
		String text = driver.findElement(By.xpath("//span[text()='25% Off']")).getText();
		System.out.println("Discounted price is " + text);

		// step-1-snap
		File source = driver.getScreenshotAs(OutputType.FILE);

		// step-2-folder
		File destination = new File("./snap/img1.png");

		// step3
		FileUtils.copyFile(source, destination);
		
		driver.switchTo().window(windows.get(0));

		// driver.close();

	}

}
