package section2;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		driver.manage().window().maximize();
		WebElement dragElement = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		System.out.println(dragElement.getLocation());
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDropBy(dragElement,500,0).perform();
		WebElement mouseActionBtn = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		a.moveToElement(mouseActionBtn).click().perform();
		WebElement mouseHoverBtn = driver.findElement(By.xpath("//section[text()='Mouse Hover']"));
		mouseHoverBtn.click();
		Thread.sleep(2000);
		WebElement toHover= driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		Thread.sleep(2000);
		
		a.moveToElement(toHover).perform();
//		a.contextClick();
		Thread.sleep(2000);
		
		
		
	}
}

