package Phase2.AssisstedPractice.Projects;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MavenLocalMachine {
	private int firstNumber;
    private int secondNumber;
    private int result;

    @Given("the first number is {int}")
    public void theFirstNumberIs(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Given("the second number is {int}")
    public void theSecondNumberIs(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @When("I add the numbers")
    public void iAddTheNumbers() {
        result = Calculator.add(firstNumber, secondNumber);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expectedResult) {
        assertEquals(expectedResult, result);
    }

}
