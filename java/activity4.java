import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        String title = driver.getTitle(); // Get the title of the webpage
        System.out.println("Title of the webpage: " + title);
        WebElement header3 = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        System.out.println("third header is" + header3.getText());
        //finding 5th header
        WebElement header5 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        //finding the color of the 5th header
        String color = header5.getCssValue("color");
        System.out.println("Color of the text: " + color);
        WebElement buttonviolet = driver.findElement(By.cssSelector(".violet"));
        String ss = buttonviolet.getAttribute("class");
        System.out.println("Classes of the button: " + ss);
        WebElement buttongrey = driver.findElement(By.cssSelector(".ui.grey.button"));
        String buttonText = buttongrey.getText();
        System.out.println("The Text of the button:" + buttonText);
        driver.quit();


    }
}




















