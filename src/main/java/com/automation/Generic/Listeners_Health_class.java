package com.automation.Generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Health_class extends GrandCare_BaseClass implements ITestListener
{
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test case is pass"+"  "+result.getName());
	}
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test case is fail"+" "+result.getName());
		
		Screenshot_Health_class.GetPhoto(this.driver,result);
	}
}
