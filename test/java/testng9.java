import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class testng9 {

    WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @DataProvider(name = "FormData")
    public Object[][] formData() {
        return new Object[][]{
                {"abc", "nandhu", "nanditha@gmail,com", "1233428288"},
                {"jerry", "Tom", "tomjerry@gmail.com", "2345637373"},
                {"Tom", "Jerry", "jerrytom@gmail.com", "7890746474"}

        };
    }

    @Test(dataProvider = "FormData")
    public void fillSimpleForm(String firstName, String lastName, String emailName, String number) {
        WebElement firstNameField = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        WebElement lastNameField = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement contactfield = driver.findElement(By.xpath("//*[@id=\"number\"]"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[1]/input"));

        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(emailName);
        contactfield.sendKeys(number);

        submitButton.click();
    }
}