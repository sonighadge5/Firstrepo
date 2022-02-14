package com.ojt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.firstpage.DashboardPage;
import com.firstpage.LoginPage;
import com.firstpage.UserPage;

public class LoginTest {
	WebDriver driver;
	LoginPage lp=null;
	DashboardPage dp=null;
	UserPage up=null;
	
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		lp=new LoginPage(driver);
		
	}
	@Test
	public void verifyDpHeader()
	{
			DashboardPage dp=lp.validLogin();
			boolean b=dp.verifyHeader();
			System.out.println("verify header is ");
			Assert.assertTrue(b);
			//lp.loginToApplication("kiran@gmail.com", "123456");
	        //Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	}
	
	@Test
	public void verifyUserPage()
	{
		DashboardPage dp=lp.validLogin();
		up=dp.clickUser();
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | User");
		
	}
}
