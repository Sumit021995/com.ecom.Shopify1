package testNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice2 {
	
	@Test
	public void navigateToAmazon() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		Reporter.log("Navigated to Amazon",true);
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void navigateToFlipkart() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Navigated to Flipkart",true);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
