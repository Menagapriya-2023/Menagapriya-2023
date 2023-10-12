package marathon.week2;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");

		// mouse over action on Brands
		WebElement mouseOver = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions obj = new Actions(driver);

		// perform()-mandatory
		obj.moveToElement(mouseOver).perform();

		// To mouseover on Watches & Accessories
		WebElement element = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));

		// perform()-mandatory
		obj.moveToElement(element).perform();

		// To select first resulting brand
		driver.findElement(By.xpath("//div[text()='Casio']")).click();

		driver.findElement(By.xpath("//button[text()='Ask me later']")).click();

		Thread.sleep(3000);

		// To sort by New Arrivals
		WebElement aa = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select option1 = new Select(aa);
		option1.selectByVisibleText("New Arrivals");

		// To select Men watches in category
		driver.findElement(By.xpath("//div[text()='Men']")).click();

		// To print all the price of listed watches
		List<WebElement> watches = driver.findElements(By.xpath("//div[@class='ProductModule__dummyDiv']"));

		int total = watches.size();

		System.out.println("Price for all watches " + total);

		Thread.sleep(3000);

		// To click on the first resulting watch
		driver.findElement(By.xpath("//a[@aria-label='Casio']/parent::div")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));

		// To compare the price
		String price = driver.findElement(By.xpath("//h3[text()='MRP:  ₹9195']")).getText();
		System.out.println(price);
		String s1 = "MRP: ₹9195";

		if (s1.equals(price)) {
			System.out.println("Watch price is verified");
		}

		else {
			System.out.println("Price is mismatched");
		}

		// To click on Add to bag
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();

		// To get the count in cart
		String cart = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("No.of items in the cart is " + cart);

		// To show my bag
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		Thread.sleep(2000);
		
		// To take screenshot
		// step-1-snap
		File scr = driver.getScreenshotAs(OutputType.FILE);

		// step-2-folder
		File des = new File("./tripozo/img1.png");

		// step3
		FileUtils.copyFile(scr, des);

		driver.switchTo().window(windows.get(0));
		// driver.close();
		// driver.quit();
	}

}
