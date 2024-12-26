package section2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Scenario1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']")));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		
		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		
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
		
		WebElement continueButton = driver.findElement(By.xpath("//button[text()='Continue']"));
		
		System.out.println(continueButton.getSize());
		System.out.println(continueButton.getLocation());
		
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		
		WebElement valueRadioButton = driver.findElement(By.xpath("//input[@value='wallet']"));
		
		if(!valueRadioButton.isEnabled())
			System.out.println("Wallet Button is Disabled");
		
		driver.findElement(By.xpath("//section[text()='Text Field']")).click();
		
		WebElement nameTextField = driver.findElement(By.xpath("//input[@name='name']"));
		
		nameTextField.sendKeys("Hello");
		
		nameTextField.clear();
		
		nameTextField.sendKeys("Sumit Saurav");
		 
		String value = nameTextField.getAttribute("value");
		
		if(value.equals("Sumit Saurav"))
		System.out.println("Validate Name Text Field As True");
		
		WebElement registerText = driver.findElement(By.xpath("//h1[text()='Register']"));
		
		System.out.println(registerText.getCssValue("color"));
		
		driver.close();
	}
}



