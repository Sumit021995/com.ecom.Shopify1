package combinePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FlipkartScenario 
{
	@FindBy(xpath="//span[text()='Electronics']") static WebElement electronicText;
	@FindBy(xpath="//a[text()='Cameras & Accessories']") static WebElement cameraIcon;
	@FindBy(xpath="//a[text()='All']") static WebElement allText;
	
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
//		WebElement electronicText = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(electronicText).perform();
//		WebElement cameraIcon = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		act.moveToElement(cameraIcon).perform();
//		WebElement allText = driver.findElement(By.xpath("//a[text()='All']"));
		act.moveToElement(allText).click().perform();
		
		
		
	}
}
