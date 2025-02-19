package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertW3school {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("Sumit Saurav");
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}


