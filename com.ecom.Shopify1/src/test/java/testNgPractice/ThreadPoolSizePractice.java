package testNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadPoolSizePractice {
	@Test(dependsOnMethods = "instaLogin")
	public void fbLogin() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("FB login",true);
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void instaLogin() throws InterruptedException
	{
		int a=5,b=10;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Reporter.log("Insta login",true);
		Thread.sleep(2000);
		driver.quit();
		Assert.assertEquals(a, b);
	}
}
