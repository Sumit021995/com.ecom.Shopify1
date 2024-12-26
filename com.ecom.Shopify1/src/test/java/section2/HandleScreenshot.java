package section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class HandleScreenshot
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchTextField = driver.findElement(By.xpath("//input[@name='q']"));
		searchTextField.sendKeys("Iphone 16");
//		searchTextField.submit();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File location = new File("C://Users//sumit//eclipse-workspace//com.ecom.Shopify1//src//test//java//section2//image.png");
		Files.copy(file, location);
		System.out.println("=======");
		driver.close();
		
	}
}



