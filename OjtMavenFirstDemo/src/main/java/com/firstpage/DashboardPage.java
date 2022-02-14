package com.firstpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver dpdriver;
	@FindBy(tagName="h1")
	WebElement header;
	
	@FindBy(xpath="//span[text()='Users']")
	WebElement userBtn;
	
	
	DashboardPage(WebDriver driver)
	{
	this.dpdriver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public boolean verifyHeader()
	{
		return header.isDisplayed();
	}
	
	public UserPage clickUser()
	{
		userBtn.click();
		return new UserPage(dpdriver); 
	}
	
}
