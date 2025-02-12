package onlineTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement searchTextField= driver.findElement(By.name("q"));
		searchTextField.sendKeys("Cars");
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		for(WebElement e:elements)
		{
			
			System.out.println(e.getText());
			System.out.println("=======");
		}
		driver.quit();
		
	}
}


