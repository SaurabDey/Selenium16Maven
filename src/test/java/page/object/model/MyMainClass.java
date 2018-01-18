package page.object.model;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.util.CommonMethod;

public class MyMainClass 
{
	WebDriver driver;
	ExtentTest test;
	ExtentReports extent;
	CommonMethod commonUtil;
	ReportClass report;
	String phoneNumber="8080877777";
	String passwordtext="test@123";
	String emailText="saurab88888@gmail.com";
	
	

	@BeforeTest
	public void setup()
	{
		

		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver= new ChromeDriver();

		commonUtil= new CommonMethod(driver);
		
		report=new ReportClass();
		report.createReport("Tracko Test");
		extent=report.getExtent();
		test=report.getTest();
		
		
		test.log(Status.PASS, "Our browser got initiated");

		driver.get("https://dev.tracko.co.in/");
		
		test.pass("My URL launched succssfully");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	public void signUp()
	{
		try {
			test.pass("Starting with SignUp Process");
			
			SignUpClass sign= new SignUpClass(driver,test,report);
			sign.signupFunction(emailText,phoneNumber,passwordtext);
			test.pass("SuccessFully executed SignUp Process");
		} 
		catch (Exception e) {
			report.takeReportScreenshot(CommonMethod.getCurrentClassAndMethodNames());
		}

	}

	@Test(priority=2)
	public void login() throws IOException
	{
		try{
			test.pass("Starting with Login Process");
			LoginClass login= new LoginClass(driver,test,report);
			login.loginFunction(phoneNumber,passwordtext);
			test.pass("SuccessFully executed Login Process");

		}
		catch (Exception e) {
			
			report.takeReportScreenshot(CommonMethod.getCurrentClassAndMethodNames());
		}
	}
	@Test(priority=3)
	public void product()
	{

	}
	@AfterTest
	public void teardown()
	{
		test.info("End of execution");
		driver.quit();
		extent.flush();
	}

}
