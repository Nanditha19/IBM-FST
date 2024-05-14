import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class activity15 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Home page title: 11" + driver.getTitle());

        // Find username and password input fields and type credentials
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[1]/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/input"));
        usernameInput.sendKeys("admin");
        passwordInput.sendKeys("password");

        // Click on the login button
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();

        // Wait for the login message to appear
        WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10) );
        WebElement loginMessage = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

        // Print the login message to the console
        System.out.println("Login message: " + loginMessage.getText());

        // Close the browser
        driver.quit();
    }
}





















