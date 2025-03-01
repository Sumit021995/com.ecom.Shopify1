package testNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrderPriority {
	@Test(priority=2)
	public void navigateToGithub() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/Sumit021995/");
		Reporter.log("Navigated to Github",true);
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(priority=1)
	public void navigateToPortfolio() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://sumitsauravportfolio.netlify.app/");
		Reporter.log("Navigated to Portfolo",true);
		Thread.sleep(2000);
		driver.quit();
		
	}
	@Test
	public void navigateToAmazon() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		Reporter.log("Navigated to Amazon",true);
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(priority=3)
	public void navigateToFlipkart() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Navigated to Flipkart",true);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
