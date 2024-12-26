package sample;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Scenario8 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchTextField = driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(2000);
		searchTextField.sendKeys("Iphone 16"); 
		Thread.sleep(2000);
		searchTextField.submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(2000);
		List<WebElement> addToCompareCheckBox = driver.findElements(By.xpath("//span[text()='Add to Compare']"));
		Thread.sleep(2000);
		for(int i=0;i<addToCompareCheckBox.size();i++) 
		{
			if(i==0 || i==2 || i==4|| i==addToCompareCheckBox.size()-1)
			{
				addToCompareCheckBox.get(i).click();
				Thread.sleep(500);	
			}								
		}
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("addToCompareCheckBox.get(10).scrollIntoView()", addToCompareCheckBox); 
//		addToCompareCheckBox.get(10).click();
		Actions act =  new Actions(driver);
		act.moveToElement(addToCompareCheckBox.get(10)).click().perform();
		Thread.sleep(500);
		WebElement popup = driver.findElement(By.xpath("//div[@class='eIDgeN']"));
		Thread.sleep(500);
		System.out.println(popup.getText());
		driver.close();
	}
}
