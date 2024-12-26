package sample;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class PortfolioTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://sumitsauravportfolio.netlify.app/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='contact']")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sumit Saurav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sumitsaurav@onmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("My name is Sumit Saurav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
	}
}

