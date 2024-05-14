import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class activity14 {
public static void main(String[] args) {

    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://v1.training-support.net/selenium/tables");
    System.out.println("Home page title: 11" + driver.getTitle());

    WebElement secondTable = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody"));
    int rowCount = secondTable.findElements(By.xpath("./tr")).size();
    int columnCount = secondTable.findElements(By.xpath("./tr[1]/td")).size();
    System.out.println("Number of rows in the second table: " + rowCount);
    System.out.println("Number of columns in the second table: " + columnCount);

    // Find and print the cell value at the second row, second column
    WebElement cellValueBeforeSorting = secondTable.findElement(By.xpath("./tr[2]/td[2]"));
    System.out.println("Cell value at second row, second column before sorting: " + cellValueBeforeSorting.getText());

    // Click the header of the first column to sort by name
    WebElement headerName = secondTable.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/thead/tr/th[1]"));
    headerName.click();

    // Find and print the cell value at the second row, second column after sorting
    WebElement cellValueAfterSorting = secondTable.findElement(By.xpath("./tr[2]/td[2]"));
    System.out.println("Cell value at second row, second column after sorting: " + cellValueAfterSorting.getText());

    // Print the cell values of the table footer
    WebElement tableFooter = secondTable.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/tfoot"));
    for (WebElement cell : tableFooter.findElements(By.tagName("td"))) {
        System.out.println("Footer Cell value: " + cell.getText());
    }

    // Close the browser
    driver.quit();
}
}









