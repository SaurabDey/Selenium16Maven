package page.object.model;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.util.CommonMethod;

public class ReportClass {

	ExtentTest test;
	ExtentReports extent;
	

	public void createReport(String testName)
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("resource/Tracko.html");
		//htmlReporter.setAppendExisting(true);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Saurab Tracko - ExtentReports");
		htmlReporter.config().setTheme(Theme.DARK);
		
		// initialize ExtentReports and attach the HtmlReporter
		extent= new ExtentReports();

		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);

		test= extent.createTest(testName);
		test.assignCategory("Regression");	
		test.assignAuthor("Saurab Dey");
		
		test.info("Starting with Automation");

	}
	
	
	public ExtentReports getExtent() {
		return extent;
	}

	public ExtentTest getTest() 
	{
		return test;
	}

	public void takeReportScreenshot(String name)
	{
		

		MediaEntityModelProvider mediaModel;
		try {
			mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(CommonMethod.screenshot(name)).build();
		
			test.fail("Something went wrong in: "+name, mediaModel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
