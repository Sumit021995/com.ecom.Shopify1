package onlineTraining;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sumitsauravportfolio.netlify.app/");
		WebElement portfolioBtn = driver.findElement(By.xpath("//a[text()='Portfolio']"));
		File ele = portfolioBtn.getScreenshotAs(OutputType.FILE);
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YY hh-mm-ss");
		String value = sdf.format(d);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\image"+value+".png");
		File newDest = new File(".\\Screenshots\\eleImage"+value+".png");
//		Files.copy(screenshot, dest);
		FileHandler.copy(screenshot, dest);
		FileHandler.copy(ele, newDest);
		driver.quit();
	}
	
}
