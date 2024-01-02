package Phase2.AssisstedPractice.Projects;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	 @Before("@smoke")
	    public void beforeSmokeScenario() {
	        System.out.println("Before @smoke scenario: Performing setup");
	    }

	    @After("@smoke")
	    public void afterSmokeScenario() {
	        System.out.println("After @smoke scenario: Performing teardown");
	    }

	    @Before("@regression")
	    public void beforeRegressionScenario() {
	        System.out.println("Before @regression scenario: Performing setup");
	    }

	    @After("@regression")
	    public void afterRegressionScenario() {
	        System.out.println("After @regression scenario: Performing teardown");
	    }
	}


