package com.automation.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automation.PomScripts.Health_Pom_Class;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GrandCare_BaseClass implements Framework_constants_GrandCare
{
	public ExtentReports reports;
	public static WebDriver driver;
	public Health_Pom_Class pom;
	@BeforeTest
	public void ExtentReport()
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(Extent_Report);
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		ExtentTest test = reports.createTest(report_path);
	}
	@BeforeClass
	public void OpenApp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() throws InterruptedException
	{
		driver.get(PropertyClass.propertyfile("URL"));
		Thread.sleep(1500);
		pom=new Health_Pom_Class(driver);
		Thread.sleep(1500);
		pom.email().sendKeys(PropertyClass.propertyfile("EMAIL"));
		Thread.sleep(1500);
		pom.password().sendKeys(PropertyClass.propertyfile("PASSWORD"));
		Thread.sleep(1500);
		pom.logIn().click();
	}
	@AfterClass
	public void closeApp()
	{
		driver.quit();
	}
	@BeforeTest
	public void flush()
	{
		reports.flush();
	}
	@AfterMethod
	public void logout()
	{
		pom.logOut().click();
	}
}
