package com.selenium.test.Selenium16Maven;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Overrriding {

	public static void main(String[] args) 
	{
//	 FirstClass ref = new FirstClass();
//	 ref.methodFirst();
//	 ref.methodSecond();
//	 
//	 
//	 SecondClass ref2= new SecondClass();
//	 ref2.methodSecond();

//	 SecondClass ref3= new FirstClass();// Run time polymorphism
//	 ref3.methodSecond();
	 
	// FirstClass ref3= new SecondClass();
	 

	 WebDriver driver = new ChromeDriver();// Inheritance
	 driver.get("");
	 
	List<WebElement> xyz=driver.findElements(By.tagName("a"));
	
	int count=0;
	for (WebElement webElement : xyz) {
		
		if (!webElement.getText().isEmpty()) 
		{
			count++;
			
		} 
	}
	
	 
	 
	}

}
