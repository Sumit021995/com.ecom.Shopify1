package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame3 {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/sumit/OneDrive/Desktop/mainPage.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[1]")).sendKeys("Sumit021995");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input")).sendKeys("Sumit Saurav");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[2]")).sendKeys("Sumit@123");
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Google")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}

