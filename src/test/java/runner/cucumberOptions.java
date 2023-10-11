package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:feature"
		,glue={"stepDefinitions"},
		tags = "@tagtest",
		plugin = {"pretty", "html:target/Report.html","json:target/report.json"}		
		)
public class cucumberOptions {

}
