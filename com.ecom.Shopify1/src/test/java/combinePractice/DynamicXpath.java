package combinePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicXpath {
	
	public static void main(String[] args) throws InterruptedException {
		String hour = "10";
		String expectedMin = "55";
		String timeStamp="AM";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
		driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
		driver.findElement(By.id(":r3:")).click();
		WebElement hourHand=driver.findElement(By.xpath("//div[@class='MuiClockPointer-thumb css-118whkv']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(hourHand,driver.findElement(By.xpath("//span[text()='"+hour+"']"))).perform();
		Thread.sleep(1000);
//		act.dragAndDropBy(hourHand, -80, 51).perform();
		act.dragAndDrop(hourHand,driver.findElement(By.xpath("//span[text()='"+expectedMin+"']"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='"+timeStamp+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(1000);
		
	}
}



