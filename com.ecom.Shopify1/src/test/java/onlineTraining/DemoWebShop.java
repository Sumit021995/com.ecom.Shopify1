package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		driver.findElement(By.id("add-to-cart-button-14")).click();
		WebElement ele = driver.findElement(By.className("content"));
		System.out.println("Color of Message :"+ele.getCssValue("color"));
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Program Ends");
		
	}
}

