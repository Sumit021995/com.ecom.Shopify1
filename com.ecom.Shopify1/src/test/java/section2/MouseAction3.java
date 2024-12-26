package section2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		Actions a = new Actions(driver);
		WebElement firstBtn = driver.findElement(By.id("btn30"));		
		a.contextClick(firstBtn).perform();		
		driver.findElement(By.xpath("//div[text()='Yes']")).click();		
		WebElement secondBtn = driver.findElement(By.id("btn31"));		
		a.contextClick(secondBtn).perform();
		driver.findElement(By.xpath("//div[text()='No']")).click();		
		WebElement thirdBtn = driver.findElement(By.id("btn32"));
		a.contextClick(thirdBtn).perform();
		driver.findElement(By.xpath("//div[text()='3']")).click();	
		Thread.sleep(2000);
		System.out.println("===========");
		driver.quit();	
	}
}

