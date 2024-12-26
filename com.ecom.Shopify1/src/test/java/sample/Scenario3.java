package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for(WebElement w : allLinks)
		{
			
			System.out.println(w.getText());
		}
		System.out.println(allLinks.toArray().length);
		System.out.println(allLinks.size());
		driver.close();
	}
}
