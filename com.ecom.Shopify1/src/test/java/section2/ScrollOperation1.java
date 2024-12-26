package section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollOperation1 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("IQOO neo 6 pro",Keys.ENTER);
		WebElement plpText = driver.findElement(By.xpath("//span[text()='IQOO neo 6 pro']"));
		if(plpText.isDisplayed()) System.out.println("Validated true");
		else System.out.println("Validate False");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement footerEle = driver.findElement(By.xpath("//a[text()='EPR Compliance']"));
		Thread.sleep(2000);
		a.scrollToElement(footerEle).perform();
		System.out.println("=======");
		Thread.sleep(2000);
		driver.close();
	}
}



