package section2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		Thread.sleep(2000);
		String parentWindowId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		Iterator<String> i = allIds.iterator();
		while(i.hasNext())
		{
			
				System.out.println(i.next().toString());
				driver.switchTo().window(i.next().toString());
		}
//		for(String id:allIds)
//		{
//			System.out.println(id);
//			if(!id.equals(parentWindowId))
//			{
//				driver.switchTo().window(id);
//			}
//		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("Abc@gmail.com",Keys.TAB,"Abc123@",Keys.TAB,"Abc123@",Keys.ENTER);
		
//		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//a[text()='New Tab']")).click();
		System.out.println("==========");
		driver.quit();
	
	}
}
