package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		Actions a = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Feed Back On Shopping Registration']")));
		WebElement ele = driver.findElement(By.xpath("//h3[text()='Feed Back On Shopping Registration']"));
		System.out.println(ele.getText());
		if(ele.getText().equals("Feed Back On Shopping Registration"))
			System.out.println("Validated True");
		else 	System.out.println("Validated False");
		WebElement yesBtn = driver.findElement(By.id("btn20"));		
		a.doubleClick(yesBtn).perform();		
		WebElement noBtn = driver.findElement(By.id("btn23"));		
		a.doubleClick(noBtn).perform();
		WebElement btn3 = driver.findElement(By.id("btn26"));
		a.doubleClick(btn3).perform();
		System.out.println("===========");
		driver.quit();	
	}
}
