import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class activity17{
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Home page title:" + driver.getTitle());

        // Find the single select dropdown
        WebElement singleSelect = driver.findElement(By.xpath("//*[@id=\"single-select\"]"));
        WebElement singleSelect2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]"));

        // Select the second option using visible text
        Select select = new Select(singleSelect);
        select.selectByVisibleText("Option 2");

        // Select the third option using index
        select.selectByIndex(2);

        // Select the fourth option using value
        select.selectByValue("4");

        // Get all the options and print them to the console
        List<WebElement> options = select.getOptions();
        System.out.println("Options:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}





















