package sample;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchTextField = driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(2000);
		searchTextField.sendKeys("Iphone 16");
		Thread.sleep(2000);
		searchTextField.submit();
		WebElement firstProductText = driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
		Thread.sleep(2000);
		System.out.println(firstProductText.getText());
		Thread.sleep(2000);
		driver.close();
	}
}

