package ddtStarted;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesUtility {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\sumit\\OneDrive\\Desktop\\DDT\\TestData.properties");
		Properties prop = new Properties();
		prop.load(file);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String uname = prop.getProperty("uname");
		String password = prop.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(uname);
		System.out.println(password);
		
		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else if (browser.equalsIgnoreCase("Edge"))
			driver = new EdgeDriver();
		else driver = new ChromeDriver();
	}
}
