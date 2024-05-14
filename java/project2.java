import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
public class project2 {
    public static void main(String[] args) {
        // Set the path to the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Open the browser and navigate to the Alchemy CRM site
        driver.get("https://alchemy.hguy.co/crm/");
        // Login
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"username_password\"]"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"bigbutton\"]"));
        usernameField.sendKeys("admin");
        passwordField.sendKeys("password");
        loginButton.click();
        // Navigate to Activities -> Meetings -> Schedule a Meeting
        WebElement activitiesMenu = driver.findElement(By.id("activities-menu"));
        activitiesMenu.click();
        WebElement meetingsSubMenu = driver.findElement(By.id("meetings-sub-menu"));
        meetingsSubMenu.click();
        WebElement scheduleMeetingButton = driver.findElement(By.id("schedule-meeting-button"));
        scheduleMeetingButton.click();
        // Enter meeting details
        WebElement titleField = driver.findElement(By.id("meeting-title"));
        WebElement dateField = driver.findElement(By.id("meeting-date"));
        WebElement timeField = driver.findElement(By.id("meeting-time"));
        WebElement locationField = driver.findElement(By.id("meeting-location"));
        WebElement agendaField = driver.findElement(By.id("meeting-agenda"));
        titleField.sendKeys("Meeting Title");
        dateField.sendKeys("2024-05-15");
        timeField.sendKeys("10:00 AM");
        locationField.sendKeys("Meeting Room 1");
        agendaField.sendKeys("Agenda Item 1, Agenda Item 2");
        // Search for members and add them to the meeting
        WebElement searchField = driver.findElement(By.id("member-search"));
        searchField.sendKeys("nandhu");
        WebElement searchResults = driver.findElement(By.id("search-results"));
        List<WebElement> searchResultItems = searchResults.findElements(By.tagName("li"));
        WebElement button = searchResultItems.getFirst();
        button.click();
        // Click Save
        WebElement saveButton = driver.findElement(By.id("save-meeting-button"));
        saveButton.click();
        // Navigate to View Meetings page and confirm creation of the meeting
        WebElement viewMeetingsButton = driver.findElement(By.id("view-meetings-button"));
        viewMeetingsButton.click();
        // Close the browser
        driver.quit();
    }
}

