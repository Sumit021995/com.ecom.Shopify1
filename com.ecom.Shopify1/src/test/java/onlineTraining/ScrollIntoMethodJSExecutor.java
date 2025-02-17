package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoMethodJSExecutor {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textEle = driver.findElement(By.xpath("//h2[contains(text(),'Welcome to')]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollIntoView(true),");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,200)");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Program Ends");
		
	}
}


