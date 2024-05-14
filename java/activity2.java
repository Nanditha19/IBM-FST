import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class activity2{
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/Selenium/login-form");
        WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[1]/label"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/label"));
        password.sendKeys("nanditha");
       WebElement button=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        button.click();

        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}