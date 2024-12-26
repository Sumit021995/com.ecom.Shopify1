package sample;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.*;
public class DemoAppQspiderScenario 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Sumit Saurav");
		Thread.sleep(2000);
		WebElement emailTextField = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		emailTextField.sendKeys("sumitsaurav@onmail.com");
		Thread.sleep(2000);
		WebElement passwordTextField = driver.findElement(By.name("password"));
		Thread.sleep(2000);
		passwordTextField.sendKeys("Infocus4999@");
		passwordTextField.submit();
		Thread.sleep(2000);
		
	}
}


