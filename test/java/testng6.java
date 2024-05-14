import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;
public class testng6 {
    @BeforeClass
    public void beforeclass() {
        System.out.println("execution before class");
    }
    @BeforeTest
    public void beforetest() {
        System.out.println("execution before test");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("execution before method");
    }
    @BeforeGroups(groups = "group1")
    public void beforegroups() {
        System.out.println("execution before groups");
    }
    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("execution before suite");
    }
    @AfterClass
    public void afterclass() {
        System.out.println("execution after class");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("execution after test");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("execution after method");
    }
    @AfterGroups (groups = "group1")
    public void aftergroups() {
        System.out.println("execution after groups");
    }
    @AfterSuite
    public void aftersuite() {
        System.out.println("execution after suite");
    }

    @Test (groups = "group1")
    public void test1() {
        System.out.println("test1 ");
    }

}






















