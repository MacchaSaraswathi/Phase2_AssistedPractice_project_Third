package Phase2.AssisstedPractice.Projects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedScenario {
	@Given("the application is running")
    public void givenApplicationIsRunning() {
        System.out.println("Given the application is running");
    }

    @When("I perform a smoke test")
    public void whenPerformSmokeTest() {
        System.out.println("When I perform a smoke test");
    }

    @Then("the smoke test should pass")
    public void thenSmokeTestShouldPass() {
        System.out.println("Then the smoke test should pass");
    }

    @When("I perform a high-priority regression test")
    public void whenPerformHighPriorityRegressionTest() {
        System.out.println("When I perform a high-priority regression test");
    }

    @Then("the high-priority regression test should pass")
    public void thenHighPriorityRegressionTestShouldPass() {
        System.out.println("Then the high-priority regression test should pass");
    }

    @When("I perform a low-priority regression test")
    public void whenPerformLowPriorityRegressionTest() {
        System.out.println("When I perform a low-priority regression test");
    }

    @Then("the low-priority regression test should pass")
    public void thenLowPriorityRegressionTestShouldPass() {
        System.out.println("Then the low-priority regression test should pass");
    }
}

