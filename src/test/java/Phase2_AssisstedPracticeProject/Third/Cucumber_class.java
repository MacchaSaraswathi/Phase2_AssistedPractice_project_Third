package Phase2_AssisstedPracticeProject.Third;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

public class Cucumber_class {
	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "stepDefinitions",
	    plugin = {"pretty", "html:target/cucumber-reports/report.html"}
	)
	public class TestRunner {
}
}
