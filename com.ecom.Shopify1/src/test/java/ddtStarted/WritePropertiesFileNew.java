package ddtStarted;

import java.io.FileOutputStream;
import java.util.Properties;

public class WritePropertiesFileNew {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sumit\\OneDrive\\Desktop\\DDT\\TestData1.properties");
		Properties prop = new Properties();
	
		
		prop.setProperty("browser", "edge");
		prop.setProperty("url", "https://github.com/login");
		prop.store(fos, " Configuration Data");
	}
}
