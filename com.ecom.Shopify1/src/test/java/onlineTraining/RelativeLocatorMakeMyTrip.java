package onlineTraining;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RelativeLocatorMakeMyTrip {
	@FindBy(xpath=("//span[@class='commonModal__close']")) private WebElement mmtPopUp;
	public WebElement getMmtPopUp()
	{
		return mmtPopUp;
	}
	@FindBy(xpath=("//li[text()='Round Trip']")) private WebElement roundTripText;
	public WebElement getRoundTripText()
	{
		return roundTripText;
	}
	public RelativeLocatorMakeMyTrip(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void removePopup()
	{
		getMmtPopUp().click();
	}
	public void clickOnRoundTripText()
	{
		getRoundTripText().click();
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		RelativeLocatorMakeMyTrip r = new RelativeLocatorMakeMyTrip(driver);
		r.removePopup();
		r.clickOnRoundTripText();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}
}
