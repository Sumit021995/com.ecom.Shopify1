package ddtStarted;

import java.io.FileInputStream;
import java.util.Properties;

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
	}
}
