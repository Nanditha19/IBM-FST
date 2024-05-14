import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng2 {

    // Declare the WebDriver object
    WebDriver driver;
    //
    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }
    @Test
    public void Testmethod1(){
        String Title = driver.getTitle();
        Assert.assertEquals("Target Practice", Title);
    }

    @Test
    public void incorrectAssertionTest() {
        // Look for the black button
        WebElement blackButton = driver.findElement(By.id("blackButton"));

        // Incorrect assertion
        Assert.assertTrue(blackButton.isDisplayed(), "Black button is not displayed");
    }

    @Test(enabled = false)
    public void skippedTest() {
        // This method will be skipped but won't be shown as skipped
        System.out.println("This test is skipped but won't be shown as skipped");
    }

    @Test
    public void skippedWithExceptionTest() {
        // This method will be skipped and shown as skipped
        throw new SkipException("Skipping this test with SkipException");
    }

    @AfterClass
    public void afterMethod() {
        // Close the browser
        driver.quit();
    }
}







