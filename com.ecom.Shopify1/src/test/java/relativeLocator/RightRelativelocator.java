package relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RightRelativelocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
//		driver.findElement(By.name("search_query")).sendKeys("Kaal Bhairav Theme Music",Keys.ENTER);
//		Thread.sleep(3000);
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		driver.findElement(RelativeLocator.with(By.tagName("//input")).toRightOf(By.id("small-searchterms"))).click();
	}
}


