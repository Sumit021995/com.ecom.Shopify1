package sample;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7
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
		Thread.sleep(2000);
		WebElement plp = driver.findElement(By.xpath("//span[contains(text(),'Iphone 16')]"));
		Thread.sleep(2000);
		if(plp.isDisplayed())
			System.out.println("Product List Page is Validated");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.xpath("//div[@data-id='MOBH4DQFPP3ZHHXW']/descendant::div[@class='KzDlHZ']"));
		WebElement productPrice = driver.findElement(By.xpath("//div[@data-id='MOBH4DQFPP3ZHHXW']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(product.getText()+"--------"+productPrice.getText());
		Thread.sleep(2000);
		product.click();
		Thread.sleep(2000);
		driver.quit();
	}
}



