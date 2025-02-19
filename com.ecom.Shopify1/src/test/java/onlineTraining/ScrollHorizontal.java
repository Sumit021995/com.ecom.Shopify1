package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHorizontal {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
//		WebElement textEle = driver.findElement(By.xpath("//h2[contains(text(),'Welcome to')]"));
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(document.body.scrollWidth,0)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(-document.body.scrollWidth,0)");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Program Ends");
		
	}
}





