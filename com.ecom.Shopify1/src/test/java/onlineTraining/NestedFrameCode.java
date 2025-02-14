package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		WebElement textFieldUserName =driver.findElement(By.xpath("//input"));	
		textFieldUserName.sendKeys("Sumit021995",Keys.TAB,"Sumit@123",Keys.TAB,Keys.TAB,"Sumit Saurav");	
		Thread.sleep(3000);
		driver.quit();
		
	
		
	}
}
