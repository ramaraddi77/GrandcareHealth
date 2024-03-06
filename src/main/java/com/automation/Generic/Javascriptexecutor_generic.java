package com.automation.Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Javascriptexecutor_generic extends GrandCare_BaseClass
{
	public static JavascriptExecutor scrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js;
	}
	public static void ScrollByAddress(WebElement ele)
	{
		scrollDown().executeScript("arguments[0].scrollIntoView();",ele);
	}
	
	public static void ScrollByLoc(int x,int y)
	{
		scrollDown().executeScript("window.scrollBy("+x+","+y+")");
	}
	
}
