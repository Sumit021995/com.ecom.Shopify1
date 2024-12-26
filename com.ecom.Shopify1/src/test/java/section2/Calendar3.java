package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		driver.findElement(By.xpath("//a[text()='Icon Trigger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='react-datepicker-wrapper']/following-sibling::*[name()='svg']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//div[text()='26']")).click();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.querySelector(\"#demoUI > main > section > article > aside > div > aside > div > article > div > div > div > div > input\").removeAttribute('disabled');");
//		WebElement calEle = driver.findElement(By.xpath("//input[@placeholder='Select A Date']"));
//		calEle.click();
//		Thread.sleep(2000);
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.JANUARY, 26);
//		Date d = cal.getTime();
//		SimpleDateFormat spf= new SimpleDateFormat("dd/MM/YY");
//		String dateStamp = spf.format(d);
//		calEle.sendKeys(dateStamp,Keys.ENTER);
		
		
	}
}
