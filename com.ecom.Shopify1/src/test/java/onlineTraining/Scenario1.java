package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act = new Actions(driver);
		for(int i=1;i<=7;i++)
		{
			WebElement capitals = driver.findElement(By.id("box"+i));
		
			WebElement countrys = driver.findElement(By.id("box"+(100+i)));
			Thread.sleep(2000);
			act.dragAndDrop(capitals, countrys).perform();
		}
	
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Program Ends");
	}
}
