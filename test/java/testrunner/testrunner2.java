package testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature",
        glue = {"stepdefinition"},
        tags = "@activity2"
)

public class testrunner2{
}
