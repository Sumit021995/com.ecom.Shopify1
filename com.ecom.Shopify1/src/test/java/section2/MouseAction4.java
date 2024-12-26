package section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction4 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement eletronicLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a = new Actions(driver);
		a.moveToElement(eletronicLink).clickAndHold().perform();
		WebElement audio = driver.findElement(By.xpath("//a[text()='Audio']"));
		a.moveToElement(audio).perform();
		List<WebElement> moreInAudio = driver.findElements(By.xpath("//a[@class='_3490ry']"));
		List<String> ls = new ArrayList<String>();
		for(WebElement w:moreInAudio)
		{
			ls.add(w.getText());
		}
		Collections.sort(ls);
		for(String s: ls)
		{
			System.out.println(s);
		}
		
//		driver.close();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100000);");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		System.out.println("=======");
		driver.close();
	}
}


