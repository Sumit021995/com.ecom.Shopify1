package sample;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.Object;
public class Scenario9
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
		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		Thread.sleep(2000);
		WebElement upiRadioBtn = driver.findElement(By.xpath("//input[@id='attended53']"));
		System.out.println("-------------");
		if(upiRadioBtn.isSelected())
		{
			System.out.println("Validated Checkout Page");
		}
		else
		{
			System.out.println("Not Validated Checkout Page");	
		}
		Thread.sleep(2000);
		WebElement continueButton = driver.findElement(By.xpath("//button[text()='Continue']"));
		Thread.sleep(2000);
		System.out.println(continueButton.getSize());
		System.out.println(continueButton.getLocation());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		Thread.sleep(2000);
		WebElement valueRadioButton = driver.findElement(By.xpath("//input[@value='wallet']"));
		Thread.sleep(2000);
		if(!valueRadioButton.isEnabled())
			System.out.println("Wallet Button is Disabled");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Text Field']")).click();
		Thread.sleep(2000);
		WebElement nameTextField = driver.findElement(By.xpath("//input[@name='name']"));
		Thread.sleep(2000);
		nameTextField.sendKeys("Hello");
		Thread.sleep(2000);
		nameTextField.clear();
		Thread.sleep(2000);
		nameTextField.sendKeys("Sumit Saurav");
		Thread.sleep(2000); 
		String value = nameTextField.getAttribute("value");
		Thread.sleep(2000);
		if(value.equals("Sumit Saurav"))
		System.out.println("Validate Name Text Field As True");
		Thread.sleep(2000);
		WebElement registerText = driver.findElement(By.xpath("//h1[text()='Register']"));
		Thread.sleep(2000);
		System.out.println(registerText.getCssValue("color"));
		Thread.sleep(2000);
		driver.close();
	}
}


