import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class testng8{
    WebDriver driver;
    @BeforeTest
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    @AfterMethod
    public void teardown() {
        if (driver!= null) {
            driver.close();
        }
    }
    @DataProvider(name = "authentication")
    public Object[][] credentials() {
        return new Object[][]{{"admin", "password"}};
    }
    @Test(dataProvider = "authentication")
    public void test(String Username,String Password){
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        System.out.println("username of the user:" + usernameField);
        usernameField.sendKeys(Username);
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordField.sendKeys(Password);
        WebElement loginbutton = driver.findElement(By.cssSelector("button[type = 'submit']"));
        loginbutton.click();
    }

}





