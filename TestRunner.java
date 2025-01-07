package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(
		feature = {"features"},
		glue = {"steps"},
		plugin = {"Pretty", "json:target/json-report/cucumber.json"},
		dryRun = false,
		monochrome = true,
		tags = "book"
		
		)

public class TestRunner {
}
