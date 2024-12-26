package sample;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TitleFetch {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		EdgeDriver e = new EdgeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		e.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://sumitsauravportfolio.netlify.app/");
		Thread.sleep(2000);
		e.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String givenTitle = "Sumit Saurav | Portfolio";
		String givenTitleFB = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		if(givenTitle.equals(actualTitle))
		{
//			driver.navigate().to("https://github.com/Sumit021995");
			System.out.println("Validated True");
		}
		String actualTitleFB = e.getTitle();
		if(givenTitleFB.equals(actualTitleFB))
		{
			System.out.println("Validated True");	
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(e.getCurrentUrl());
//		System.out.println(driver.getPageSource());
//		System.out.println(e.getPageSource());
		
		

		Thread.sleep(5000);
		driver.close();
		e.close();
		
	}
}




