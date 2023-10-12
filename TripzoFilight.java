package marathon.week2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TripzoFilight {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tripozo.com/");
		
		// To Enter 'MAA' from the Select Source input field
		driver.findElement(By.id("search-form_origin")).sendKeys("MAA");

		// choose the first resulting option.
		driver.findElement(By.xpath("//span[@class='flexG1 ellipsis pdr5']")).click();

		// Enter 'GOX' from the Select Destination input field
		driver.findElement(By.id("search-form_destination")).sendKeys("GOX");

		// choose the first resulting option.
		driver.findElement(By.xpath("//span[text()='GOX']")).click();

		// Choose tommorow date' from the journey
		driver.findElement(By.xpath("//input[@value='12']")).click();

		// To click search button
		driver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-default search')]")).click();

		Thread.sleep(3000);
		// To click Refundable
		driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[3]")).click();

		// To select time
		driver.findElement(By.xpath("	(//span[@class='fs11 mgu2 nowrap'])[2]")).click();
		
		// to select airlines from the filter
		driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[4]")).click();
		String airline = driver.findElement(By.xpath("//span[text()='Air India']")).getText();
		System.out.println("Selected ariline is " + airline);
		
		// To verify the selected airlines
		String s1 = "Air India";

		if (s1.equals(airline)) {
			System.out.println("Airlines is verified correctly");
		} else {
			System.out.println("inappropriate selection");
		}
		
		//Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='choose-button tpz-btn nowrap']")).click();

		// To verfiy whether the selected airline is refundable
		String refund = driver.findElement(By.xpath("//span[@class='ant-tag ant-tag-green']")).getText();
		System.out.println("Selected airline is refundable " + refund);
		
		Thread.sleep(3000);
		
		String s2 = "Refundable";
		if (s2.equals(refund)) {
			System.out.println("Airlines is refunable status is verified");
		} else {
			System.out.println("Airlines is refunable status is not verified");
		}

		// To click flight info
		driver.findElement(By.xpath("//span[text()='Flight Info']")).click();

		// To take screenshot
		// step-1-snap
		File scr = driver.getScreenshotAs(OutputType.FILE);

		// step-2-folder
		File des = new File("./tripozo/img1.png");

		// step3
		FileUtils.copyFile(scr, des);

		//To close the window
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		
		// To click fare info
		driver.findElement(By.xpath("//span[text()='Fare Info']")).click();

		// To take screenshot
		// step-1-snap
		File scr1 = driver.getScreenshotAs(OutputType.FILE);

		// step-2-folder
		File des1 = new File("./tripozo/img1.png");

		// step3
		FileUtils.copyFile(scr1, des1);
		
		//To close the window
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();

	}

}
