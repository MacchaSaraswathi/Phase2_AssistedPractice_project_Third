package Phase2.AssisstedPractice.Projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AND_OR {
	@Given("I have a scenario with logical AND")
    public void givenScenarioWithLogicalAND() {
        System.out.println("Given I have a scenario with logical AND");
    }

    @When("I perform action A")
    public void whenPerformActionA() {
        System.out.println("When I perform action A");
    }

    @And("I perform action B")
    public void andPerformActionB() {
        System.out.println("And I perform action B");
    }

    @Then("the scenario should pass")
    public void thenScenarioShouldPass() {
        System.out.println("Then the scenario should pass");
    }

    @Given("I have a scenario with logical OR")
    public void givenScenarioWithLogicalOR() {
        System.out.println("Given I have a scenario with logical OR");
    }

    @When("I perform action X")
    public void whenPerformActionX() {
        System.out.println("When I perform action X");
    }

    @And("I perform action Y")
    public void andPerformActionY() {
        System.out.println("But I perform action Y");
    }
}
