import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng3{

    // Declare the WebDriver object
    WebDriver driver;

    //
    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    @Test
    public void logindata() {
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        System.out.println("username of the user:" + usernameField);
        usernameField.sendKeys("admin");
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordField.sendKeys("password");


        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        button.click();
    }
    @Test
    public void readmessage(){
        WebElement confirmationMessage = driver.findElement(By.id("action-confirmation"));
        String expectedMessage = "Welcome Back, admin";
        String actualMessage = confirmationMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect confirmation message");
    }

    @AfterClass
    public void afterMethod() {
        driver.quit();


    }
}


















