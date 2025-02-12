package trainingUdemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserInvoking {

	public static void main(String[] args) throws InterruptedException {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

//         ChromeOptions options = new ChromeOptions();
//
//         options.addArguments("--remote-allow-origins=*");

//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
		WebDriver driver;

//		driver = new ChromeDriver();

//Firefox

//		System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

//		WebDriver driver1 = new FirefoxDriver();

//Microsoft Edge

//		System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

//		WebDriver driver2 = new EdgeDriver();

		for(int i=0;i<=2;i++)
		{
			if(i==0)
				driver = new ChromeDriver();
			else if(i==1)
				driver = new EdgeDriver();
			else
				driver = new FirefoxDriver();
			
			Thread.sleep(2000);
			driver.get("https://sumitsauravportfolio.netlify.app/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
			driver.close();
		}

//driver.quit();

	}

}
