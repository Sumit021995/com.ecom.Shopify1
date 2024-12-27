package combinePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleClockWebEle {
	
	public static void main(String[] args) throws InterruptedException {
		String hour = "10";
		String expectedMin = "50";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
		driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
		driver.findElement(By.id(":r3:")).click();
		Actions act = new Actions(driver);
		WebElement hourHand=driver.findElement(By.xpath("//span[text()='"+hour+"']"));
		act.moveToElement(hourHand).click().perform();
		WebElement minHand=driver.findElement(By.xpath("//span[text()='"+expectedMin+"']"));
		act.moveToElement(minHand).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='PM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(1000);
		
	}
}




