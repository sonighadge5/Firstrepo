package com.ojt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassFirst {
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
        driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.tagName("button")).click();
        Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	}
	
}
