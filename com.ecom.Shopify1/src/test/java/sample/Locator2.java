package sample;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.*;
public class Locator2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://sumitsauravportfolio.netlify.app/");
		Thread.sleep(2000);
		WebElement contactLinkText = driver.findElement(By.linkText("contact"));
		Thread.sleep(2000);
		contactLinkText.click();
		Thread.sleep(3000);
		WebElement nameTextField = driver.findElement(By.name("name"));
		Thread.sleep(2000);
		nameTextField.sendKeys("Sumit Saurav");
		Thread.sleep(2000);
		WebElement emailTextField = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		emailTextField.sendKeys("sumitsaurav@onmail.com");
		Thread.sleep(2000);
		WebElement messageTextArea = driver.findElement(By.name("message"));
		Thread.sleep(2000);
		messageTextArea.sendKeys("Hi My name is Sumit Saurav");
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.className("text-white bg-[#41BF61] px-6 py-2 mx-auto flex items-center rounded-md hover:scale-110 duration-300"));
		Thread.sleep(2000);
		submitButton.click();	
		Thread.sleep(4000);
		
	}
}

