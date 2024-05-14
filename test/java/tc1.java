//package Demo;
//import Demo.A2;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
public class tc1 {
    WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void a(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
        Object[][] x = tc2.credentials();
    }
    @AfterClass
    public void b(){
        driver.close();
    }
    @Test(dataProviderClass =  tc1.class, dataProvider = "Authentication")
    public void A2 (String username,String lastname,String email,String number){
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).click();
        new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).sendKeys(username).sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).sendKeys(lastname).sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).sendKeys(email).sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).sendKeys(number).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }
}










