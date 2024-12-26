package sample;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class Scenario1 {
	public static void main(String[] args) throws InterruptedException {
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://sumitsauravportfolio.netlify.app/");
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.manage().window().setPosition(new Point(200,300));
//		Thread.sleep(2000);
//		driver.manage().window().setSize(new Dimension(200,800));
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.youtube.com/@Qualime/playlists");
//		Thread.sleep(2000);
//		driver.navigate().to("https://github.com/Sumit021995");
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		String actualUrl = "https://github.com/Sumit021995";
//		String webPageUrl = driver.getCurrentUrl();
//		if(actualUrl.equals(webPageUrl))
//			System.out.println("WebPage validated True");
//		Thread.sleep(5000);
////		driver.close();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement logo = driver.findElement(By.xpath("//div[@id='app']/descendant::img[@alt='company-branding']"));
        if(logo.isDisplayed())
        {
        	System.out.println("True");
        }
	}
}
