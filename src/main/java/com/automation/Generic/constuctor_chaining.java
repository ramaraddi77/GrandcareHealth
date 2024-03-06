package com.automation.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class constuctor_chaining
{
	public constuctor_chaining(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
