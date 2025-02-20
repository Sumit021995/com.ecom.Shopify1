package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsEasyMyTrip {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--disable-notifications");
//		option.addArguments("--incognito");
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		WebElement ele = driver.findElement(By.id("dday"));
		System.out.println(ele.getText());
	}
}
