package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOptionsUNPwd {
	public static void main(String[] args) {
//		https://the-internet.herokuapp.com/basic_auth
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--disable-notifications");
//		option.addArguments("--incognito");
//		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		// To login throught passing credentials like username and password code format is given below
		// in the url pass "https://username:password@URL"
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}
}


