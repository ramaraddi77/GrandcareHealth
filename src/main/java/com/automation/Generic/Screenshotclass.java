package com.automation.Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class Screenshotclass implements Framework_constants_GrandCare
{
	public static void Getphoto(WebDriver driver)
	{
		Date d=new Date();
		String date = d.toString().replace(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(PHOTO_PATH+date);
		try 
		{
			FileHandler.copy(src, dest);
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
	
}
