package StepRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\THIS PC\\eclipse-workspace\\CucumberBatchTweleve\\Features",
		glue = "StepDefinition",monochrome = true ,
		plugin = {"pretty","html:Reports/index.html", "junit:Reports/junitReport.xml",
				"json:Reports/JsonReport.json"},
		dryRun = false, tags = "not @Smoke"
		
		)

public class Runner {

}
