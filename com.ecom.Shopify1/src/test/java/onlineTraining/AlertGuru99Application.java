package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertGuru99Application {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("computer",Keys.ENTER);
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}

