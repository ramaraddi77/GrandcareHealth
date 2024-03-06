package com.automation.Generic;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenersclass extends GrandCare_BaseClass implements ITestListener
{

	public void onTestSuccess(ITestResult res)
	{
		System.out.println("Test case is pass");
	}

	public void onTestFailure(WebDriver driver) 
	{
		System.out.println("Test case is fail :");
		
		Screenshotclass.Getphoto(this.driver);
		
	}
	
}
