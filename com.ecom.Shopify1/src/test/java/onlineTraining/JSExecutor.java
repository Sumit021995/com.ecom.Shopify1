package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement customTextfield = driver.findElement(By.id("custom_gender"));
		jse.executeScript("arguments[0].value='Selenium'",customTextfield);
//		Thread.sleep(3000);
//		driver.quit();
		System.out.println("Program Ends");
	}
}


