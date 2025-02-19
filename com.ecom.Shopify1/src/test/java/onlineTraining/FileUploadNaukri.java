package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadNaukri {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=23531");
		driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("E:\\Resume (2).pdf");
		
		Thread.sleep(2000);
//		driver.quit();
		
		//p[text()='  I have work experience (excluding internships)']
	}
}
