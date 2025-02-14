package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFrame2 {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/sumit/OneDrive/Desktop/mainPage.html");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[contains(text(),'username')]/input[1]")).sendKeys("Sumit021995");
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
