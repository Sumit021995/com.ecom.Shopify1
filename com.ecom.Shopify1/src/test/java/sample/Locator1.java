package sample;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.*;
public class Locator1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement emailTextField = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		emailTextField.sendKeys("scsauravkaku");
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		Thread.sleep(2000);
		passwordTextField.sendKeys("Infocus4999@123");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.name("login"));
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		WebElement logoutButton = driver.findElement(By.id(":ru:"));	
		
		Thread.sleep(4000);
		logoutButton.click();
		
	}
}
