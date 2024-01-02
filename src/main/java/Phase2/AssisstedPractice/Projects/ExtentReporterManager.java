package Phase2.AssisstedPractice.Projects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterManager {
	private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports();
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("target/extent-reports/report.html");
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }

}
