package onlineTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameCode {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/sumit/OneDrive/Desktop/mainPage.html");
		driver.switchTo().frame(0);
//		driver.findElement(RelativeLocator.with(By.xpath("//input")).toRightOf(By.xpath("//html//body//text()"))).sendKeys("Sumit021995");
		List<WebElement> textFields =driver.findElements(By.xpath("//input"));	
		
		Thread.sleep(2000);
		driver.quit();
		
	
		
	}
}
