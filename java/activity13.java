import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class activity13 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

// Create the Wait object

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page

        driver.get("https://v1.training-support.net/selenium/tables");

        // Print the title of the page
        System.out.println("Home page title: 11" + driver.getTitle());

        // Find the number of rows and columns in the first table using XPath
        WebElement firstTable = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/thead"));
        int rowCount = firstTable.findElements(By.xpath("./tr")).size();
        int columnCount = firstTable.findElements(By.xpath("./tr[1]/td")).size();
        System.out.println("Number of rows in the first table: " + rowCount);
        System.out.println("Number of columns in the first table: " + columnCount);

        // Find and print all cell values in the third row of the table
        WebElement thirdRow = firstTable.findElement(By.xpath("./tr[3]"));
        for (WebElement cell : thirdRow.findElements(By.tagName("td"))) {
            System.out.println("Cell value: " + cell.getText());
        }

        // Find and print the cell value at the second row, second column
        WebElement cellValue = firstTable.findElement(By.xpath("./tr[2]/td[2]"));
        System.out.println("Cell value at second row, second column: " + cellValue.getText());

        // Close the browser
        driver.quit();
    }
}
