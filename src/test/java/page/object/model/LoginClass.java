package page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class LoginClass {
	WebDriver driver;
	ExtentTest test;
	 ReportClass report;

	

	

	@FindBy (id ="login-password")
	WebElement webLoginPassword;
	
	@FindBy (id="login-mobile")
	WebElement webOfloginmobile;
	
	@FindBy(how= How.ID, using="sub_btn")
	WebElement webSubButton;
	
	
	public LoginClass(WebDriver driver, ExtentTest test, ReportClass report) 
	{
		this.driver=driver;
		this.test=test;
		this.report=report;
		
		PageFactory.initElements(driver, this);;
	}

	public void loginFunction(String x,String y)
	{
		
		webOfloginmobile.sendKeys(x);
		
		webLoginPassword.sendKeys(y);		
		
		webSubButton.click();
		
	}

}
