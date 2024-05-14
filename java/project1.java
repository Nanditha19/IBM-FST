import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class project1{
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        // Find username and password fields and input your credentials
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"user_name\"]")); // Replace "username" with the actual ID of the username field
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"username_password\"]")); // Replace "password" with the actual ID of the password field
        usernameField.sendKeys("admin");
        passwordField.sendKeys("password");
        passwordField.sendKeys(Keys.RETURN);
        // Wait until the Activities menu is clickable and click it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement activitiesMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Activities')]")));
        activitiesMenu.click();
        // Navigate to Meetings
        WebElement meetingsOption = driver.findElement(By.xpath("//a[contains(text(),'Meetings')]"));
        meetingsOption.click();
        // Click on Schedule a Meeting
        WebElement scheduleMeetingButton = driver.findElement(By.xpath("//button[contains(text(),'Schedule a Meeting')]"));
        scheduleMeetingButton.click();
        // Fill in meeting details
        WebElement titleField = driver.findElement(By.id("title"));
        titleField.sendKeys("Meeting Title");
        // You can continue with filling in other details like date, time, location, etc.
        // Search for members and add them to the meeting
        WebElement searchMemberField = driver.findElement(By.id("searchMembers"));
        searchMemberField.sendKeys("Member Name");
        // Add code to select members from the search results and add them to the meeting
        // Click Save
        WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
        saveButton.click();
        // Wait for the confirmation message or navigate to View Meetings page to confirm creation
        // Close the browser
        driver.quit();
    }
}

