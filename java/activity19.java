import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class activity19 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("Home page title:" + driver.getTitle());

        // Find the button to open a confirm alert and click it
        WebElement confirmButton = driver.findElement(By.cssSelector("button#confirm"));
        confirmButton.click();

        // Switch focus from the main window to the alert box
        Alert alert = driver.switchTo().alert();

        // Get the text in the alert and print it
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);

        // Close the alert with OK
        alert.accept();
        System.out.println("Alert closed with OK");

        // Click the confirm button again
        confirmButton.click();

        // Switch focus to the alert box again
        alert = driver.switchTo().alert();

        // Dismiss the alert with Cancel
        alert.dismiss();
        System.out.println("Alert closed with Cancel");

        // Close the browser
        driver.quit();
    }
}







