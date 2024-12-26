package section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.io.Files;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException , IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement mouseActionBtn = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		Actions a = new Actions(driver);
		a.moveToElement(mouseActionBtn).click().perform();
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		WebElement circle =driver.findElement(By.id("circle"));
		a.clickAndHold(circle).perform();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File location = new File("C:\\Users\\sumit\\OneDrive\\Desktop\\screenshot\\image.png");
		Files.copy(file,location);
		a.release(circle).perform();		
		
	}
}
