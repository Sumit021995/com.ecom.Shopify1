package testScenario;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScenarioTest1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String parentID = driver.getWindowHandle();
		WebElement fbLink = driver.findElement(By.linkText("Facebook"));
		Actions act = new Actions(driver);
		act.moveToElement(fbLink).click().perform();
		Set<String> allIds = driver.getWindowHandles();
		for(String s:allIds)
		{
			if(!s.equals(parentID))
				driver.switchTo().window(s);
			Thread.sleep(2000);
		}
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File location = new File(".\\Screenshots\\ErrorScreenShot.png");
		Thread.sleep(2000);
		FileHandler.copy(screenshotAs, location);
		driver.switchTo().window(parentID);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		System.out.println(errorMsg.getCssValue("color"));
		System.out.println(errorMsg.getCssValue("font-family"));
		Thread.sleep(3000);
		driver.quit();
	}
}
