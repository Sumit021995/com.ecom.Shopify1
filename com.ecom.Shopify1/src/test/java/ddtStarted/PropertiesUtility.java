package ddtStarted;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesUtility {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\TestData\\TestData.properties");
		Properties prop = new Properties();
		prop.load(file);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String uname = prop.getProperty("username");
		String password = prop.getProperty("password");
	
		Set<Object> keyStr = prop.keySet();
		for(Object o:keyStr)
			System.out.println(o);
		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else if (browser.equalsIgnoreCase("Edge"))
			driver = new EdgeDriver();
		else driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.id("login_field")).sendKeys(uname,Keys.TAB,password,Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		}
}
