package sample;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoScenario2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement registerText = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
		if(registerText.getText().equals("Register"));
			System.out.println("Validated Register Page");
			Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Sumit Saurav");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("sumitsaurav@onmail.com");
		Thread.sleep(2000);
		WebElement passwordTextField = driver.findElement(By.name("password"));
		Thread.sleep(2000);
		passwordTextField.sendKeys("Infocus4999@");
		Thread.sleep(2000);
		passwordTextField.submit();
		Thread.sleep(2000);
		WebElement loginText = driver.findElement(By.xpath("//h1[contains(text(),'Login')]"));
		if(loginText.getText().equals("Login"));
		System.out.println("Validated Login Page");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("sumitsaurav@onmail.com");
		Thread.sleep(2000);
		WebElement passwordTextFieldLogin = driver.findElement(By.name("password"));
		Thread.sleep(2000);
		passwordTextFieldLogin.sendKeys("Infocus4999@");
		Thread.sleep(2000);
		passwordTextFieldLogin.submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Register Now')]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
}



