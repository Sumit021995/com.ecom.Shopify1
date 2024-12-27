package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleClock {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
		driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
		Thread.sleep(3000);
		String inputDateStamp = "8:50 PM";
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
//		jse.executeScript("document.querySelector(\"#demoUI > main > section > article > aside > div > aside > div > article > div > div > div > div > input\").value='';");
		jse.executeScript("document.getElementById(':r1:').value='8:50 PM';");
//		jse.executeScript("document.querySelector(\"#\\\\:r8\\\\:\").value=arguments[0];",inputDateStamp);
		Thread.sleep(3000);
	}
}

