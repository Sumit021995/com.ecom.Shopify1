package combinePractice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDownloadPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea")).sendKeys("Hello World",Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		String fileName = "mytextfile.txt";
//		String downloadPath = "C:\\Users\\sumit\\Downloads\\"+fileName+".txt";
		String downloadPath = "C:\\Users\\sumit\\Downloads";
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (!dirContents[i].getName().equals(fileName)) {
		          // File has been found, it can now be deleted:
//		          dirContents[i].delete();
		      }
		      else 
		      {
		    	  System.out.println("File founded Successfully");	
		    	  dirContents[i].delete();
		      }
		  }
		  Thread.sleep(2000);
		  driver.quit();
	}
}






