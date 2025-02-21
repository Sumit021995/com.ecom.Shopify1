package onlineTraining;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotDemowebShopNew {
	public static void main(String[] args) throws Exception {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
//		Point p = new Point(0, 0);
//		Dimension d = new Dimension(0, 0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.className("login-button")).click();
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd_hhmmss");
		String value = sdf.format(d);
		//ScreenShot name Screenshot_20250219_165653
		System.out.println(value);
	
		WebElement errorEle = driver.findElement(By.className("validation-summary-errors"));
		File location = new File(".\\Screenshots\\Screenshot"+value+".png");
		File errImgElement = errorEle.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(errImgElement, location);
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Program Ends");
		
	}
}


