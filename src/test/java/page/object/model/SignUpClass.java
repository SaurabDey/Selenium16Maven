package page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.util.CommonMethod;

public class SignUpClass {
	
	WebDriver driver;
	ExtentTest test;
	 ReportClass report;
	
	@FindBy(xpath="//a[text()='Sign Up Free']")
	WebElement webOfSignUpForFree;

	
	@FindBy(how= How.ID, using="name")
	WebElement webOfname;
	
	
	By locatorOfemail=By.id("email");
	By locatorOfmobile= By.id("mobile");
	By loctorSignup= By.xpath("//button[text()='Sign up']");
	By locatorOfPassword= By.id("password");
	
	

	
	public SignUpClass(WebDriver driver, ExtentTest test, ReportClass report) 
	{
		this.driver=driver;
		this.test=test;
		this.report=report;
		PageFactory.initElements(driver, this);
	}

	public void signupFunction(String z, String x, String y)
	{
		
		try {
			
		
		test.pass("signupFunction()--I am in SignUp Process");

		
	
		webOfSignUpForFree.click();
		
		CommonMethod.waitMethod(2000);
		
	
		webOfname.sendKeys("Saurab");
		
		WebElement email=driver.findElement(locatorOfemail);
		email.sendKeys(z);
		
		WebElement mobile=driver.findElement(locatorOfmobile);
		mobile.sendKeys(x);
		
		WebElement signUpButton=driver.findElement(loctorSignup);
		signUpButton.click();
		
		CommonMethod.waitMethod(5000);
		
		
		WebElement otp=driver.findElement(By.id("otp"));
		otp.sendKeys("123456");
		
		WebElement mobileVerifyBtn=driver.findElement(By.id("sub_btn_verify"));
		mobileVerifyBtn.click();
		
		CommonMethod.waitMethod(5000);
		
		WebElement okBtn=driver.findElement(By.xpath("//button[text()='OK']"));
		okBtn.click();
		
		WebElement password=driver.findElement(locatorOfPassword);
		password.sendKeys(y);
		
		WebElement repassword=driver.findElement(By.id("repassword"));
		repassword.sendKeys(y);
		
		WebElement setpassBtn=driver.findElement(By.id("sub_btn_setpass"));
		setpassBtn.click();
		
		CommonMethod.waitMethod(5000);
		
		test.pass("signupFunction()--Finised SignUp Process");
		
		
		} catch (Exception e) {
			report.takeReportScreenshot(CommonMethod.getCurrentClassAndMethodNames());
		}
	}

}
