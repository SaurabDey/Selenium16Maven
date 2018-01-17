package com.selenium.test.Selenium16Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

/**
 * Hello world!
 *
 */
public class App 
{
	
 public static void main(String[] args)
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
       
        WebElement loginUserName= driver.findElement(By.id("email"));
        loginUserName.sendKeys("saurab@gamil.com");
        
        WebElement loginPassword=driver.findElement(By.name("pass"));
        loginPassword.sendKeys("my password");
        
        
      //  driver.findElement(By.xpath("//button[@value='1' and  @tabindex='1']")).click();
        
     //   driver.findElement(By.xpath("//button[text()='Log In']")).click();
        
       // driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
        
       // driver.findElement(By.id("loginbutton")).click();
        
        
      //input[@type='text'][@placeholder='Email address or phone number']
        
        driver.findElement(By.cssSelector("input[type='text'][placeholder='Email address or phone number']")).sendKeys("Saurab.com");
        
        driver.quit();
        
    }
}
