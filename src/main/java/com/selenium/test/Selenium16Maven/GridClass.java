package com.selenium.test.Selenium16Maven;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridClass {

	@Parameters("browserName")
	@Test
	public void method(String bro)
	{
		
		DesiredCapabilities  capabilities= new DesiredCapabilities();
		
		String browser=bro;
		
		if (browser.equals("firefox")) 
		{
			capabilities.setBrowserName("firefox");
		}
		
		else if(browser.equals("chrome"))
		{
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.VISTA);
		
		}
		else if(browser.equals("ie"))
		{
		capabilities.setBrowserName("internet explorer");
		
		}
		
		
		
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.0.4:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://dev.tracko.co.in/");
		
		WebElement signUpButton=driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
		  signUpButton.click();	  
		  WebElement userName=driver.findElement(By.id("name"));
		  userName.sendKeys("saurab"); 
		  
		  
		  driver.quit();

		
		
	}

}
