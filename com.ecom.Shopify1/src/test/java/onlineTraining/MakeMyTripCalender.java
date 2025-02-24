package onlineTraining;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTripCalender {
	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,15);
		Date d = cal.getTime();
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM YYYY"); //  March 2025
		System.out.println(sdf.format(d));
		System.out.println(d1.getTime());
		String expectedMonthAndYear=sdf.format(d);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEE MMM dd YYYY");
		System.out.println(sdf1.format(d));// <Current day like(Mon)> Mon Apr 21 2025
		String expectedDateNewFormat=sdf1.format(d);
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
				driver.findElement(By.xpath("//div[@aria-label='"+expectedDateNewFormat+"']")).click();	
				
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
