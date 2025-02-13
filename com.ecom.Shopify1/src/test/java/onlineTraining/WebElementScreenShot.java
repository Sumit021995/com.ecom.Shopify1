package onlineTraining;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sumitsauravportfolio.netlify.app/");
		WebElement ele = driver.findElement(By.xpath("//img[@alt='ProjectThumbnail']"));
		File projectPic = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("/Screenshot/img.png");
		FileHandler.copy(projectPic, dest);
	}
}
