package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DateOfEaseMyTrip2 {
	public static void main(String[] args) throws Exception {
		String expectedMonth ="April";
		String expectedYear ="2025";
		String expectedDate ="24";
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("ddate")).click();
		String actualDate=driver.findElement(By.xpath("")).getText();
		String actualMonth=driver.findElement(By.xpath("")).getText();
		String actualYear=driver.findElement(By.xpath("")).getText();
		while(true)
		{
			try
			{
				if(expectedYear.equalsIgnoreCase(actualYear))
			
						
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.id("img2Nex")).click();
			}
			
		}
		Thread.sleep(2000);
//		driver.quit();
	}
}
