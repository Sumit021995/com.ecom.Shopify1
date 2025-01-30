package relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator_AboveMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(RelativeLocator.with(By.tagName("a")).above(By.xpath("//input[@value='Search']"))).click();
//		driver.findElement(RelativeLocator.with(By.tagName("a")).above(By.xpath("//input[@value='Search']"))).click();
	}
}
