import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class activity18 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Home page title:" + driver.getTitle());
        // Get the title of the page and print it to the console
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Locate the multi-select dropdown element
        WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));

        // Initialize a Select object with the multi-select element
        Select select = new Select(multiSelect);

        // Select the "javascript" option using the visible text
        select.selectByVisibleText("Javascript");

        // Select the 4th, 5th, and 6th options using the index
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);

        // Select the "nodejs" option using the value
        select.selectByValue("node");

        // Deselect the 5th option using index
        select.deselectByIndex(4);

        // Close the browser
        driver.quit();
    }
}










