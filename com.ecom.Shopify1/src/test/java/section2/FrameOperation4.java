
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

public class FrameOperation4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_1.html']")));
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Admin1",Keys.TAB,"Admin2",Keys.TAB,"Admin3");
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_4.html']")));
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Admin4",Keys.TAB,"Admin5");
		
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_3.html']")));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe")));
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		driver.findElement(By.xpath("//span[text()='General Web Automation']")).click();
		driver.findElement(By.xpath("//span[text()='Choose']")).click();
		WebElement yesOption = driver.findElement(By.xpath("//span[text()='Yes']"));
		Actions act = new Actions(driver);
		act.doubleClick(yesOption).perform();

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("I am Sumit Saurav",Keys.TAB,"My birth palce is Sitamarhi");
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Thank you')]"));
		if(text.getText().contains("Thank you"))
			System.out.println("Validated True");
		
		System.out.println("===============");
		driver.quit();
		
	}
}


