package section2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		RandomString r = new RandomString();
		Calendar cal = Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YY hh-mm-ss");
		String dateStamp = sdf.format(d);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File location = new File(".\\Screenshots\\image-"+dateStamp+".png");
		Files.copy(file, location);
		driver.quit();
	}
}
