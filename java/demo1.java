import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class demo1{
    public static  void main(String[] args){
        WebDriverManager.firefoxdriver();
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://v1.training-support.net/selenium/login-form");
        driver.findElement(By.name("username")).isDisplayed();
        driver.findElement(By.name("username")).isEnabled();
        driver.findElement(By.id(" check box")).isSelected();
        driver.navigate().forward();
        driver.navigate().back();
        driver.quit();
    }
}
