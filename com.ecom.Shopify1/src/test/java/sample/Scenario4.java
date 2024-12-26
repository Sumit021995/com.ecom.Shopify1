package sample;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(2000);
		WebElement checkoutPageText = driver.findElement(By.xpath("//h1[text()='Checkout Page']"));
		if(checkoutPageText.isDisplayed())
			System.out.println("Validated Checkout Page");
		Thread.sleep(2000);
		WebElement walletRadioButton = driver.findElement(By.xpath("//input[@value='wallet']"));
		Thread.sleep(2000);
		walletRadioButton.click();
		WebElement valueRadioButton = driver.findElement(By.xpath("//input[@value='office']"));
		Thread.sleep(2000);
		valueRadioButton.click();
		Thread.sleep(2000);
		List<WebElement> allRadioButton = driver.findElements(By.xpath("//input[@type='radio']"));
//		System.out.println(allLinks.toArray().length);
		System.out.println(allRadioButton.size());
		driver.findElement(By.id("btn")).click();
		Thread.sleep(2000);
		driver.close();
	}
}

