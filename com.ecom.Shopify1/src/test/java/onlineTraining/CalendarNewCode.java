package onlineTraining;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarNewCode {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		Date dateObj= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YY");
		String todayDate = sdf.format(dateObj);
		System.out.println(todayDate);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 7);
		String requestDate = sdf.format(cal.getTime());
		System.out.println(requestDate);
	}
}
