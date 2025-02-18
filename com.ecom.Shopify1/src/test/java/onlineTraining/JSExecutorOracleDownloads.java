package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorOracleDownloads {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.findElement(By.linkText("jdk-17.0.14_linux-x64_bin.deb")).click();
		WebElement downloadLink = driver.findElement(By.linkText("Download jdk-17.0.14_linux-x64_bin.deb"));
		jse.executeScript("arguments[0].click()", downloadLink);
	}
}
