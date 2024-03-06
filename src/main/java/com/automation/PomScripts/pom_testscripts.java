package com.automation.PomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.Generic.constuctor_chaining;

public class pom_testscripts extends constuctor_chaining
{
	//Declaration 
	@FindBy(xpath = "//span[text()='Patient']")
	private WebElement patient_link;
	
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
	private WebElement addpatient_btn;
	
	@FindBy(name = "name")
	private WebElement name_field;
	
	@FindBy(name = "email")
	private WebElement email_field;
	
	@FindBy(name = "password")
	private WebElement pass_field;
	
	@FindBy(name = "address")
	private WebElement address_text_area;
	
	@FindBy(name = "phone")
	private WebElement phone_field;
	
	@FindBy(xpath = "//select[@name='sex']")
	private WebElement Sex_dropdown;
	
	@FindBy(name = "birth_date")
	private WebElement dateofbirth;
	
	@FindBy(name = "age")
	private WebElement age_field;
	
	@FindBy(xpath = "//select[@name='blood_group']")
	private WebElement Blood_dropdown;
	
	@FindBy(xpath = "//span[text()='Select image']")
	private WebElement image;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit_btn;
	
	
	//Initialization
	public pom_testscripts(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Utilization
	
	public WebElement Patient()
	{
		return patient_link;
	}
	public WebElement addPatient()
	{
		return addpatient_btn;
	}
	public WebElement Name()
	{
		return name_field;
	}
	public WebElement Email()
	{
		return email_field;
	}
	public WebElement Password()
	{
		return pass_field;
	}
	public WebElement AreaTextField()
	{
		return address_text_area;
	}
	public WebElement phoneNumber()
	{
		return phone_field;
	}
	public WebElement SexDropdown()
	{
		return Sex_dropdown;
	}
	public WebElement DateOfBirth()
	{
		return dateofbirth;
	}
	public WebElement AgeTextField()
	{
		return age_field;
	}
	public WebElement bloodGroup()
	{
		return Blood_dropdown;
	}
	public WebElement ImageUpload()
	{
		return image;
	}
	public WebElement SubmitButton()
	{
		return submit_btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


