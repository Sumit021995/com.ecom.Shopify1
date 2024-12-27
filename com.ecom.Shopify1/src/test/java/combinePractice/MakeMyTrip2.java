package combinePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip2 {
    public static void main(String[] args) throws InterruptedException {
        String fromCity = "new delhi";
        String toCity = "dubai";
        String expectedMonth = "April 2025";
        String expectedDay = "28";
        String expectedAdult = "2";
        String expectedChild = "1";
        String expectedTravelClass = "Premium Economy";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);

        // Close pop-ups
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        
        // Enter From City
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromCity);
        Thread.sleep(2000);
        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
        
        // Enter To City
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(toCity);
        Thread.sleep(2000);
        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
        
        // Select Travel Date
        WebElement month = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));
        int flag = 0;
        while (flag == 0) {
            if (month.getText().equals(expectedMonth)) {
                flag = 1;
            } else {
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
                Thread.sleep(2000);
            }
        }
        driver.findElement(By.xpath("//div[text()='" + expectedMonth + "']/../../div[@class='DayPicker-Body']//p[text()='" + expectedDay + "']")).click();
        Thread.sleep(2000);

        // Select Travelers
        driver.findElement(By.xpath("//label[@for='travellers']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='guestCounter font12 darkText gbCounter']//li[text()='" + expectedAdult + "']")).click();
        driver.findElement(By.xpath("//ul[@class='guestCounter font12 darkText gbCounter childCounter']//li[text()='" + expectedChild + "']")).click();
        driver.findElement(By.xpath("//ul[@class='guestCounter classSelect font12 darkText']//li[text()='" + expectedTravelClass + "']")).click();
        Thread.sleep(2000);

        // Apply and Search
        driver.findElement(By.xpath("//button[text()='APPLY']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        
        // Close the driver
        driver.quit();
    }
}
