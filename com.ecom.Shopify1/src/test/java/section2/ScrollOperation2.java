package section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollOperation2 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		driver.findElement(By.xpath("//section[@class='ps-3']")).click();
		driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
//		driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[14px]']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Open In New Tab']")));
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String> allIds = driver.getWindowHandles();
		for(String s:allIds)
		{
			if(!s.equals(parentId))
			{
				
				driver.switchTo().window(s);
			}
		}
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(500,0);");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(500,0);");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(500,0);");
		Thread.sleep(2000);
		Robot r = new Robot();
		for(int i=0;i<=4;i++)
		{
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);	
		}
		System.out.println("++++++++++");
		String id2=driver.getWindowHandle();
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//a[text()='Vertical']")).click();
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		
		Set<String> allNewIds = driver.getWindowHandles();
		for(String s:allNewIds)
		{
			if(!s.equals(parentId) && !s.equals(id2))
			{
				
				driver.switchTo().window(s);
			}
		}
		
		jse.executeScript("window.scrollBy(0,600);");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,600);");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,600);");
		Thread.sleep(1000);
		
		System.out.println("++++++++++");
		
		driver.quit();
	}
}




