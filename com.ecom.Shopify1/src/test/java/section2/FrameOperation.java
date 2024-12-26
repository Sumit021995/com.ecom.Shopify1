package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameOperation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		
		WebElement frame = driver.findElement(By.xpath("//section[text()='Frames']"));
		a.moveToElement(frame).click().perform();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe")));
//		WebElement iframe = driver.findElement(By.xpath("//iframe"));
		
		Thread.sleep(2000);
//		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("name",Keys.TAB,"Name@123",Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("===============");
		
	}
}
