package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldYono {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("userName")).sendKeys("asdfgh",Keys.TAB,"abc@123");
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(eyeIcon).clickAndHold().perform();
//		act.clickAndHold(eyeIcon).perform();
		Thread.sleep(2000);
		act.moveToElement(eyeIcon).release().perform();
//		act.release(eyeIcon).perform();
		
		
		
	}
}
