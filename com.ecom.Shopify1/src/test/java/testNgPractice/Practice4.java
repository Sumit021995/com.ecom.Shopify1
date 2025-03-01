package testNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice4 {
	@Test(groups= {"Sumit"})
	public void navigateToGithub() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/Sumit021995/");
		Reporter.log("Navigated to Github",true);
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(groups= {"Sumit"})
	public void navigateToPortfolio() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://sumitsauravportfolio.netlify.app/");
		Reporter.log("Navigated to Portfolo",true);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
