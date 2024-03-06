package com.automation.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_generic_class extends GrandCare_BaseClass
{
	public static Actions actions(WebDriver driver)
	{
		Actions act=new Actions(driver);
		return act;
	}
}
