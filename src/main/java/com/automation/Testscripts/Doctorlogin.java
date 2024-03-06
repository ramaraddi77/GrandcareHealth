package com.automation.Testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.automation.Generic.DropDown_class;
import com.automation.Generic.GrandCare_BaseClass;
import com.automation.Generic.Javascriptexecutor_generic;
import com.automation.PomScripts.pom_testscripts;

@Listeners(com.automation.Generic.Listeners_Health_class.class)
public class Doctorlogin extends GrandCare_BaseClass
{
	@Test
	public void Doctortest() throws InterruptedException
	{
		pom_testscripts test=new pom_testscripts(driver);
		Thread.sleep(2000);
		test.Patient().click();
		Thread.sleep(2000);
		test.addPatient().click();
		Thread.sleep(2000);
		test.Name().sendKeys("choku");
		Thread.sleep(2000);
		test.Email().sendKeys("ramaraddi21@gmail.com");
		Thread.sleep(2000);
		test.Password().sendKeys("123456789");
		Thread.sleep(2000);
		test.AreaTextField().sendKeys("Vijayanagar");
		Thread.sleep(2000);
		test.phoneNumber().sendKeys("9945212177");
		Thread.sleep(2000);
		DropDown_class.selectbyindex(test.SexDropdown(),1);
		Thread.sleep(5000);
		Javascriptexecutor_generic.ScrollByAddress(test.SexDropdown());
		Thread.sleep(5000);
		test.DateOfBirth().sendKeys("25/07/1994");
		Thread.sleep(5500);
		test.AgeTextField().sendKeys("28");
		Thread.sleep(3500);
		DropDown_class.selectbyindex(test.bloodGroup(), 7);
		Thread.sleep(4000);
		Javascriptexecutor_generic.ScrollByLoc(0,1800);
//		WebElement img = test.ImageUpload();
//		Thread.sleep(3000);
//		img.sendKeys("‪E:\\OnePlusNord\\DCIM\\Camera\\1610294515086.jpg");
//		Thread.sleep(5000);
		test.SubmitButton().click();

	}
}
