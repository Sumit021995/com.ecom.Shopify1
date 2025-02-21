package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YTScenario {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.youtube.com/");
		
		WebElement searchTextField= driver.findElement(By.name("search_query"));
		searchTextField.sendKeys("armonia",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Theme of Lord Shiva")).click();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Program Ends");
	}
}
