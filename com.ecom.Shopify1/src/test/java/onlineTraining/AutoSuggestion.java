package onlineTraining;

	import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class AutoSuggestion {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in/");
			WebElement searchTextField= driver.findElement(By.id("twotabsearchtextbox"));
			searchTextField.sendKeys("Iphone");
			Thread.sleep(2000);
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
			for(WebElement e:elements)
				System.out.println(e.getText());
			driver.quit();
			
		}
	}

