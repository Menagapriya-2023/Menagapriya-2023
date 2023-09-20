package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String s1="Dashboard";
		String boardtitle=driver.getTitle();
		System.out.println(boardtitle);
		
		if (boardtitle.equals(s1))
		{
			System.out.println("Dashboard is dispalyed");
		}
			else {
				System.out.println("Dashboard is not displayed");
			}
		boolean aa= driver.findElement(By.xpath("(//div[@class='card'])[2]")).isEnabled();
		System.out.println(aa);
		Point loc =  driver.findElement(By.xpath("//span[text()='Submit'][1]")).getLocation();
		System.out.println(loc);
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println(cssValue);
		Dimension size =  driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println(size);
		}
		
		

	}

