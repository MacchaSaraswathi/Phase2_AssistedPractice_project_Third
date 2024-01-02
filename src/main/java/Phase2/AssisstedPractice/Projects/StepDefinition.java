package Phase2.AssisstedPractice.Projects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Given("I have a step definition file")
    public void givenStepDefinitionFile() {
        System.out.println("Given I have a step definition file");
    }

    @When("I execute the step definition")
    public void whenExecuteStepDefinition() {
        System.out.println("When I execute the step definition");
    }

    @Then("I should see the output")
    public void thenSeeOutput() {
        System.out.println("Then I should see the output");
    }
}


