package testNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Practice3 {
	
	@Test
	public void navigateToGithub() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/Sumit021995/");
		Reporter.log("Navigated to Github",true);
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(groups= {"Social"})
	public void navigateToFacebook() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("Navigated to Facebook",true);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
