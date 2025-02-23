package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripCalender {
	public static void main(String[] args) throws Exception {
		String expectedMonthAndYear="March 2025";
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.className("commonModal__close")).click();
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Kolkata");
		
		Thread.sleep(2000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		while(true)
		{
			try {
				
				driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div/div[text()='"+expectedMonthAndYear+"']"));	
				driver.findElement(By.xpath("//div[@aria-label='Thu Mar 20 2025']")).click();	
				
				break;
			}catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();	
				Thread.sleep(2000);
			
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Program Ends");
	}
}
