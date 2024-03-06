package com.automation.Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class Screenshot_Health_class implements Framework_constants_GrandCare
{
	public static void GetPhoto(WebDriver driver, ITestResult result)
	{
		Date d=new Date();
		String date = d.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(PHOTO_PATH+date);
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
