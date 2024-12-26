package sample;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class FlipkartPNPValidate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
		searchBar.sendKeys("Iphone 16");
		Thread.sleep(2000);
		searchBar.submit();
		
		Thread.sleep(2000);
		WebElement textSearched =driver.findElement(By.xpath("//span[contains(text(),'Iphone 16')]"));
		Thread.sleep(2000);
		if(textSearched.getText().contains("Iphone 16"))
			System.out.println("Validated True");
		
	}
}
