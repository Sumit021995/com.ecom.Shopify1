package onlineTraining;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotDemoWebShop {
	public static void main(String[] args) throws Exception {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.className("login-button")).click();
		WebElement errorEle = driver.findElement(By.className("validation-summary-errors"));
		File location = new File(".\\Screenshots\\img1.png");
		File errImgElement = errorEle.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(errImgElement, location);
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Program Ends");
		
	}
}


