package Phase2.AssisstedPractice.Projects;

public class EstentReportConfigJenkhins {
	private static ExtentReports extentReports;

    public static ExtentReports getExtentReports() {
        if (extentReports == null) {
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/extent-reports/extent-report.html");
            sparkReporter.config().setDocumentTitle("Cucumber Extent Report");
            sparkReporter.config().setReportName("Cucumber Test Results");
            sparkReporter.config().setTheme(Theme.DARK);

            extentReports = new ExtentReports();
            extentReports.attachReporter(sparkReporter);
        }
        return extentReports;
    }
}
