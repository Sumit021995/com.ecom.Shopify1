package trainingUdemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("shoe");
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		for(int i=0;i<suggestions.size();i++)
		{
			System.out.println(suggestions.get(i).getText());
			System.out.println("----");
		}
		Thread.sleep(2000);
		driver.quit();
		
	}
}
