package section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		WebElement calEle = driver.findElement(By.xpath("//input[@placeholder='Select A Date']"));
		calEle.click();
		Thread.sleep(2000);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,2);
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-YY hh-mm-ss");
//		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MMM-YY hh-mm-ss");
		String value = sdf.format(d);
//		String value2 = sdf1.format(d);
//		String value3 = sdf1.format(d);
		System.out.println(value);
//		System.out.println(value2);
//		System.out.println(value3);
		calEle.sendKeys(value,Keys.ENTER);
		Thread.sleep(2000);
	}
}
