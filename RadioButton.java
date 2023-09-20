package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Edge']")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		//driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled();
		boolean value = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled();
		System.out.println(value);
		boolean selected= driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		System.out.println(selected);
		//driver.close();	

	}

}
