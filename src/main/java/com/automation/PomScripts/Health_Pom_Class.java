package com.automation.PomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.Generic.constuctor_chaining;

public class Health_Pom_Class extends constuctor_chaining
{
	
	//Declaration 
	
	@FindBy(id = "email")
	private WebElement email_textfield;
	
	@FindBy(id = "password")
	private WebElement pass_textfield;
	
	@FindBy(xpath = "//button[@type='submit']") 
	private WebElement login_button;
	
	@FindBy(xpath = "//a[@href='http://106.51.87.42:9007/index.php?login/logout']")
	private WebElement logoutlink;
	
	
	
	//Initialization
	
	public Health_Pom_Class(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	//Utilization
	public WebElement email()
	{
		return email_textfield;
	}
	public WebElement password()
	{
		return pass_textfield;
	}
	public WebElement logIn()
	{
		return login_button;
	}
	
	
	
	public WebElement logOut()
	{
		return logoutlink;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
