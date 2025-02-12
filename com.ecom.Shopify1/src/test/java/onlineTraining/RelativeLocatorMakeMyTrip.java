package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RelativeLocatorMakeMyTrip {
	@FindBy(xpath=("")) private WebElement mmtPopUp;
	public WebElement getMmtPopUp()
	{
		return mmtPopUp;
	}
	public RelativeLocatorMakeMyTrip(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void removePopup()
	{
		
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
	}
}
