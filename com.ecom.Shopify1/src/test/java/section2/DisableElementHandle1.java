package section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementHandle1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		driver.findElement(By.xpath("//a[text()='Icon Trigger']")).click();
//		WebElement calElement=driver.findElement(By.xpath("//input[@placeholder='Select A Date']"));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='react-datepicker-wrapper']/following-sibling::*[name()='svg']")).click();
		Thread.sleep(3000);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR,30/01/25);
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
		String inputDateStamp = sdf.format(d);
		System.out.println(inputDateStamp);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.querySelector(\"#demoUI > main > section > article > aside > div > aside > div > article > div > div > div > div > input\").value='26/01/25';");
		jse.executeScript("document.querySelector(\"#demoUI > main > section > article > aside > div > aside > div > article > div > div > div > div > input\").value=arguments[0];",inputDateStamp);
		Thread.sleep(3000);
	}
}
