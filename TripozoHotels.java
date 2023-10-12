package marathon.week2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripozoHotels {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tripozo.com/");

		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[2]")).click();

		// To enter the city
		driver.findElement(By.id("CityData")).sendKeys("Goa");
		driver.findElement(By.xpath("(//div[@class='f-vcenter f-spbetween'])[3]")).click();

		// To select check in date
		driver.findElement(By.xpath("(//div[@class='ant-picker-cell-inner'])[12]")).click();
		// To select check out date
		driver.findElement(By.xpath("(//div[@class='ant-picker-cell-inner'])[13]")).click();
		// To click search button
		driver.findElement(By.xpath("//span[text()=' Search']")).click();
		// To select air conditioning from the filter

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='ant-checkbox-input']")).click();
		driver.findElement(By.xpath("//span[text()='Laundry Facility']")).click();
		driver.findElement(By.xpath("(//span[text()='Parking'])")).click();
		driver.findElement(By.xpath("//span[text()='Restaurant']")).click();
		// To select star rating
		driver.findElement(By.xpath("(//ul[@class='ant-rate ant-rate-disabled starRating'])[5]")).click();
		// To select first resulting one (choose button)
		driver.findElement(By.xpath("//span[text()='Choose']")).click();

		// To verify the check in date
		String string = driver.findElement(By.xpath("//p[@class='pl-2']")).getText();
		System.out.println(string);
		String s1 = "Check In : 12 Oct 2023";

		if (s1.equals(string)) {
			System.out.println("Check in date is verified");
		} else {
			System.out.println("Not verified");
		}

		// To click view rooms
		driver.findElement(By.xpath("//button[text()='View Rooms']")).click();

		// choose room
		driver.findElement(By.xpath("//span[text()='Choose Room ']")).click();

		driver.findElement(By.xpath("//span[text()='Amenities & Details']")).click();

		// To take screenshot
		// step-1-snap
		File scr = driver.getScreenshotAs(OutputType.FILE);

		// step-2-folder
		File des = new File("./tripozo/img1.png");

		// step3
		FileUtils.copyFile(scr, des);
		// To close the window
		driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
	}

}
