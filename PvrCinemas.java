package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
	 driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']")).click();
	 driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
   
	 WebElement aa=  driver.findElement(By.name("city"));
   Select option1=new Select(aa);
   option1.selectByVisibleText("Chennai");
   
   Thread.sleep(1000);
   
   WebElement bb=  driver.findElement(By.xpath("//select[@name='genre']"));
   Select option2 =new Select(bb);
   option2.selectByVisibleText("ANIMATION");
   

   WebElement cc=  driver.findElement(By.name("lang"));
   Select option3 = new Select(cc);
   option3.selectByVisibleText("ENGLISH");
   
   driver.findElement(By.xpath("//button[text()='Apply']")).click();
   WebElement element = driver.findElement(By.xpath("//div[text()='Paw Patrol']"));
   driver.executeScript("arguments[0].click();",element);
   
   //driver.findElement(By.xpath("//div[contains(text(),'English • ANIMATION')]")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
  
   WebElement dd=  driver.findElement(By.xpath("//select[@name='cinemaName']"));
   Select cinema =new Select(dd);
   cinema.selectByVisibleText("INOX The Marina Mall, OMR, Chennai");
   
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Menagapriya");
   //driver.findElement(By.name("name")).sendKeys("Menagapriya");
  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("menagapriyak91@gmail.com");
   driver.findElement(By.name("noOfTickets")).sendKeys("2");
  // driver.findElement(By.xpath("///input[@name='noOfTickets']")).sendKeys("2");
   
   WebElement timing=  driver.findElement(By.xpath("//select[@name='timings']"));
   Select showtime =new Select(timing);
   showtime.selectByValue("12:00 PM - 03:00 PM");
   
 //  driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9000304000");
   driver.findElement(By.name("mobile")).sendKeys("9000304000");
   
  // WebElement food=  driver.findElement(By.xpath(" //select[@name='food']"));
   WebElement food=  driver.findElement(By.name("food"));
    Select foodreq =new Select(food);
   foodreq.selectByIndex(0);
   
 // driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("It's movie time");
  driver.findElement(By.name("comment")).sendKeys("nil");
   
   driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
   driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
   driver.findElement(By.xpath("//button[text()='CANCEL']")).click();
    String s1="Movie Library";
	 String title = driver.getTitle();
	 System.out.println(title);
	 
	 if(title.equals(s1)) {
		  System.out.println("Title is matched");
	   }else {
	   System.out.println("Title is not matched");
	  }
	   
  
   
   
   
   
   
 
   
   
   
   
   

   
   
   
   
 
   
   
   
   
   
   
   
   

	
		
	}

}
