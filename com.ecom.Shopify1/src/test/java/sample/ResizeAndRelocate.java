package sample;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeAndRelocate {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://sumitsauravportfolio.netlify.app/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d = new Dimension(200,300);
		driver.manage().window().setSize(new Dimension(300,800));
		Thread.sleep(3000);
		Point p = new Point(300,500);
		driver.manage().window().setPosition(new Point(100,200));
		
	}
}


