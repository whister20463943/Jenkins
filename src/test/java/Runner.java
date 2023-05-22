
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/SA20463943/Downloads/selenium/jenkinsDemo/src/main/resources/abc.feature", glue = {
		"jenkinsDemo" })

public class Runner extends AbstractTestNGCucumberTests {

}
