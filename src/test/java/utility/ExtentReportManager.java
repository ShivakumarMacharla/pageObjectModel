package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportManager implements ITestListener{

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	 	  public void onTestStart(ITestResult result) {
	 		  sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/report/extent.html");
	 		  sparkReporter.config().setDocumentTitle("Automation Report");
	 		  sparkReporter.config().setReportName("Regression Testing");
	 		  sparkReporter.config().setTheme(Theme.DARK);
	 		  
	 		  extent = new ExtentReports();
	 		  extent.attachReporter(sparkReporter);
	 		  
	 		  extent.setSystemInfo("OS","Windows 11");
	 		  extent.setSystemInfo("TesterName","Shiva");
	 		  extent.setSystemInfo("Browser","Chrome");
	 		  
	 		  
	 		  
		  }

		  public void onTestSuccess(ITestResult result) {
			  test = extent.createTest(result.getName());
			  test.log(Status.PASS, "Test Cases is PASSED :"+result.getName());
		  }

		  public void onTestFailure(ITestResult result) {
			  test = extent.createTest(result.getName());
			  test.log(Status.FAIL, "Test Case is FAILED :"+result.getName());
			  test.log(Status.FAIL,"Test Case FAILED cause is :"+result.getThrowable());
		  }

		  public void onTestSkipped(ITestResult result) {
			  test = extent.createTest(result.getName());
			  test.log(Status.SKIP, "Test Case is SKIPPD :"+result.getName());
		  }

		  public void onStart(ITestContext context) {
		  }

		  public void onFinish(ITestContext context) {
			  extent.flush();
		  }

	
//	public static ExtentReports getReportObject() {
//		String reportPath = System.getProperty("user.dir")+"/reports/AutomationReports.html";
//		
//		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
//		
//		reporter.config().setReportName("Autoamtion Test Report");
//		reporter.config().setDocumentTitle("Selenium Execution Report");
//		
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(reporter);
//		
//		extent.setSystemInfo("Tester", "Shivakumar");
//		extent.setSystemInfo("OS", "Windows");
//		extent.setSystemInfo("Browser", "Chrome");
//		
//		extent.flush();
//		return extent;
//		
//		
//	}
}
