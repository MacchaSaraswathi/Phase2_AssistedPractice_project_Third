package Phase2.AssisstedPractice.Projects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StePDef {
	@Given("I have a scenario")
    public void givenIHaveAScenario() {
        ExtentReportConfig.getExtentTest().info("Given I have a scenario");
        System.out.println("Given I have a scenario");
    }

    @When("I perform an action")
    public void whenIPerformAnAction() {
        ExtentReportConfig.getExtentTest().info("When I perform an action");
        System.out.println("When I perform an action");
    }

    @Then("the scenario should pass")
    public void thenTheScenarioShouldPass() {
        ExtentReportConfig.getExtentTest().info("Then the scenario should pass");
        System.out.println("Then the scenario should pass");
    }

}
