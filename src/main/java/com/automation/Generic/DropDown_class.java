package com.automation.Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown_class 
{
	public static Select selectclass(WebElement ele)
	{
		Select sel=new Select(ele);
		return sel;
	}
	public static void selectbyindex(WebElement ele,int index)
	{
		selectclass(ele).selectByIndex(index);
	}	
}
