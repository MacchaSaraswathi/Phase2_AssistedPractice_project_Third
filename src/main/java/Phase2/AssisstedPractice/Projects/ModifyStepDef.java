package Phase2.AssisstedPractice.Projects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifyStepDef {
	private int firstNumber;
    private int secondNumber;
    private int result;

    @Given("the first number is {int}")
    public void theFirstNumberIs(int firstNumber) {
        ExtentReportConfig.getExtentTest().info("Given the first number is " + firstNumber);
        this.firstNumber = firstNumber;
    }

    @Given("the second number is {int}")
    public void theSecondNumberIs(int secondNumber) {
        ExtentReportConfig.getExtentTest().info("Given the second number is " + secondNumber);
        this.secondNumber = secondNumber;
    }

    @When("I add the numbers")
    public void iAddTheNumbers() {
        ExtentReportConfig.getExtentTest().info("When I add the numbers");
        result = Calculator.add(firstNumber, secondNumber);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expectedResult) {
        ExtentReportConfig.getExtentTest().info("Then the result should be " + expectedResult);
        assertEquals(expectedResult, result);
    }
}


