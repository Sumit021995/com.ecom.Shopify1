package onlineTraining;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarNewCode {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
//		Options opt = driver.manage();
//		Window win = opt.window();
//		win.maximize();
////		Point p = new Point(0, 0);
////		Dimension d = new Dimension(0, 0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd_hhmmss");
		String value = sdf.format(d);
		//ScreenShot name Screenshot_20250219_165653
		System.out.println(value);
	}
}
