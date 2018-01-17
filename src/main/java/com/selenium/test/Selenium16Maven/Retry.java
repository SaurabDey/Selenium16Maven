package com.selenium.test.Selenium16Maven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer
{

	int min=0;
	int max=1;

	public boolean retry(ITestResult result) 
	{
		if (!result.isSuccess())
		{
			if (min<max)
			{
				System.out.println(result.getName()+" is failing");
				min++;
				
				result.setStatus(ITestResult.FAILURE);
				return true;
			}
		}

		else
		{
			result.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

}
