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

public class FrameOperation2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		
		WebElement frame = driver.findElement(By.xpath("//section[text()='Frames']"));
		a.moveToElement(frame).click().perform();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe")));
//		WebElement iframe = driver.findElement(By.xpath("//iframe"));
		
		Thread.sleep(2000);
//		driver.switchTo().frame(iframe);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com",Keys.TAB,"Admin@1234",Keys.TAB,"Admin@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe")));
		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com",Keys.TAB,"SuperAdmin@1234",Keys.ENTER);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		System.out.println("===============");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		System.out.println("===============");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com",Keys.TAB,"Admin@1234",Keys.TAB,"Admin@1234");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame(3);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com",Keys.TAB,"Admin@1234",Keys.TAB,"Admin@1234",Keys.ENTER);
		
		
		System.out.println("===============");
		driver.quit();
		
	}
}

