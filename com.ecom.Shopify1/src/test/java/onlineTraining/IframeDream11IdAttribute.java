package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDream11IdAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame("send-sms-iframe");
		WebElement ele = driver.findElement(By.id("regEmail"));
		ele.sendKeys("112233445566",Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		
	}
}

