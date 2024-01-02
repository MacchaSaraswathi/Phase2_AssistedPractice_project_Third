package Phase2.AssisstedPractice.Projects;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeAfterHooks {

    @Before
    public void beforeScenario() {
        System.out.println("Before the scenario: Performing setup");
    }

    @After
    public void afterScenario() {
        System.out.println("After the scenario: Performing teardown");
    }
}

