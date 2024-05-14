package stepdefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity_3{
    WebDriver driver;
    WebDriverWait wait;

    @Given("User is on the page")
    public void userIsOnThePage() {
        // Initialize WebDriver and WebDriverWait
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Open the page
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    }

    @When("User clicks the Simple Alert button")
    public void userClicksTheSimpleAlertButton() {
        // Find and click Simple Alert button
        WebElement simpleAlertButton = driver.findElement(By.id("simple"));
        simpleAlertButton.click();
    }

    @When("User clicks the Confirm Alert button")
    public void userClicksTheConfirmAlertButton() {
        // Find and click Confirm Alert button
        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
    }

    @When("User clicks the Prompt Alert button")
    public void userClicksThePromptAlertButton() {
        // Find and click Prompt Alert button
        WebElement promptAlertButton = driver.findElement(By.id("prompt"));
        promptAlertButton.click();
    }

    @Then("Alert opens")
    public void alertOpens() {
        // Wait for alert to be present
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @And("Read the text from it and print it")
    public void readTheTextFromItAndPrintIt() {
        // Switch to the alert
        Alert alert = driver.switchTo().alert();
        // Get text from alert and print it
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);
    }

    @And("Close the alert")
    public void closeTheAlert() {
        // Close the alert
        driver.switchTo().alert().accept();
    }

    @And("Close the alert with Cancel")
    public void closeTheAlertWithCancel() {
        // Dismiss the alert (click Cancel)
        driver.switchTo().alert().dismiss();
    }

    @And("Write a custom message in it")
    public void writeACustomMessageInIt() {
        // Switch to the alert
        Alert promptAlert = driver.switchTo().alert();
        // Send keys to the prompt alert
        promptAlert.sendKeys("Custom Message");
        // Close the alert
        promptAlert.accept();
    }

    @And("Close Browser")
    public void closeBrowser() {
        // Close the browser
        driver.quit();
    }
}







