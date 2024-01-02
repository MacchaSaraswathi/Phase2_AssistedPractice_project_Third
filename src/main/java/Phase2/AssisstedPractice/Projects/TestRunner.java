package Phase2.AssisstedPractice.Projects;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestRunner {
	@Before
    public void setup() {
        // Initialize Extent Reports
        ExtentReportManager.getInstance();
    }

    @After
    public void tearDown() {
        // Flush Extent Reports
        ExtentReportManager.getInstance().flush();
    }

}
