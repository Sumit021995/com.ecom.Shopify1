package sample;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationOperation {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://sumitsauravportfolio.netlify.app/");
		Thread.sleep(2000);
		driver.navigate().to("https://github.com/Sumit021995");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
		
	}
}



