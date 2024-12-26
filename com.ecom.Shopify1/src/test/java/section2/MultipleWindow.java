package section2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String expectedUrl = "https://www.facebook.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		
		String currentWindowUrl = driver.getCurrentUrl();
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id : allIds)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.equals(expectedUrl))
			{
				break;
			}
		}
		System.out.println("===========");
	
	}
}

