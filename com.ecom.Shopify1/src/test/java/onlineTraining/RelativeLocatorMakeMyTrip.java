package onlineTraining;

//import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RelativeLocatorMakeMyTrip {
	@FindBy(xpath=("//span[@class='commonModal__close']")) private WebElement mmtPopUp;
	public WebElement getMmtPopUp()
	{
		return mmtPopUp;
	}
	@FindBy(xpath=("//span[@class='headerIconWrapper']")) private WebElement icon;
	public WebElement getIcon()
	{
		return icon;
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
		WebElement element = driver.findElement(RelativeLocator.with(By.xpath("//a")).below(By.xpath("//span[text()='Introducing myBiz']")));
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
//		r.getIcon().click();
//		Point p = r.getIcon().getLocation();
//		Dimension pd = r.getIcon().getSize();
//		Rectangle rd = r.getIcon().getRect();
//		driver.findElement().click();
		Thread.sleep(2000);
		driver.quit();
//		Options opt =driver.manage();
//		Navigation n = driver.navigate();
//		TargetLocator t =driver.switchTo();
		
		
		
		
	}
}
