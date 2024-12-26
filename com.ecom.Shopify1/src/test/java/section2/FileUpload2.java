package section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class FileUpload2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		driver.findElement(By.id("fileInput")).sendKeys("C://Users//sumit//OneDrive//Desktop//interviewPrepration//1.pdf");
		
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='select2']"));
		Select option = new Select(dropdown);
//		option.selectByIndex(1);
		List<WebElement> ele = option.getOptions();
		Iterator<WebElement> i = ele.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().getText());
		}
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File location = new File("C:\\Users\\sumit\\OneDrive\\Desktop\\screenshot\\newImage.png");
		Files.copy(f, location);
		Thread.sleep(2000);
		driver.quit();
	
	}
}
