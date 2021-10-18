package calculator1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		strict = true,
		monochrome = true,
		plugin = {"pretty", "html:target/report.html"}
		)
public class TestRunner
{

}
