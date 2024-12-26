package section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		StringSelection path = new StringSelection("C:\\Users\\sumit\\OneDrive\\Desktop\\screenshot\\image.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		driver.findElement(By.xpath("//div[text()='Upload File']")).click();
		
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		// //*[@id="selectFile"]
//		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//*[name()='svg'and @class='text-red-600 text-lg cursor-pointer']")).click();
//		act.scrollToElement(uploaded).click().perform();
		Thread.sleep(2000);
//		act.scrollByAmount(20, 0).click().perform();
//		Thread.sleep(2000);
		
		
	}
}
