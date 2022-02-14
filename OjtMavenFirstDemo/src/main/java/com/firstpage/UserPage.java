package com.firstpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	WebDriver updriver;
	
	public UserPage(WebDriver driver)
	{
		this.updriver=driver;
		PageFactory.initElements(driver, this);
		System.out.println("hi hello i am in user page");
	}

}
