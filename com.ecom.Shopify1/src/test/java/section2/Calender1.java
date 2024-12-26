package section2;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		driver.findElement(By.xpath("//div[text()='5']")).click();
		Calendar cal =Calendar.getInstance();
		Date d=cal.getTime();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
		System.out.println(sdf.toString());
//		cal.add(Calendar.DAY_OF_MONTH,5);
		Thread.sleep(3000);
		
		
		
		
	}
}
