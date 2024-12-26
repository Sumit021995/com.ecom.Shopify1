package combinePractice;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		WebElement fromCity = driver.findElement(By.id("fromCity"));
		fromCity.click();
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
	
		WebElement toCity = driver.findElement(By.id("toCity"));
		toCity.click();
		driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']")).click();
//		toCity.sendKeys("Bangkok");
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		Thread.sleep(2000);
		System.out.println("===========");
		WebElement ele = driver.findElement(By.xpath("//div[text()='February 2025']/following::p[text()='5']"));
		driver.findElement(By.xpath("//div[text()='February 2025']/following::p[text()='5']")).click();
//		Actions act = new Actions(driver);
//		act.contextClick(ele).perform();
		driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-3']")).click();
		driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
		driver.findElement(By.xpath("//li[text()='First Class']")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
		Thread.sleep(3000);
		
		
		
		
	}
}
