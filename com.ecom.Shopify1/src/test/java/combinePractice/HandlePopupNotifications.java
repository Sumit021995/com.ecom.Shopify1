package combinePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlePopupNotifications {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
//		options.addArguments("--headless");
//		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		WebElement popUpBtn = driver.findElement(By.xpath("//button[text()='Notification']"));
		popUpBtn.click();
		if(popUpBtn.isDisplayed())
			System.out.println("+++++++++++");
		System.out.println("================");
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
	}
}





