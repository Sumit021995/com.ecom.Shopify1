package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedFrame4 {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/sumit/OneDrive/Desktop/mainPage.html");
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		act.moveToLocation(485, 155).click().sendKeys("Sumit021995",Keys.TAB,"Sumit@123",Keys.TAB,Keys.TAB,"Sumit Saurav").perform();

		Thread.sleep(2000);
		driver.quit();
		
		
	}
}


