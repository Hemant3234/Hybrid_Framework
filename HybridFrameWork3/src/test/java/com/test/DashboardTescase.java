package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.DashboardWebpage;
import com.pages.LoginWebPage;


public class DashboardTescase extends TestBase{
	public static Logger log=Logger.getLogger(LoginTestcase.class);
	//public static  WebDriver driver;
	public LoginWebPage lp;
	public DashboardWebpage Dp;

	@BeforeMethod
	public void BrowerOpen() throws Exception {
		
		log.info("bowser open log4j ");
	
		initialization();
		
		lp = new LoginWebPage(driver);
		Dp=new DashboardWebpage(driver);
		Dp=loadLoginpage().navigateToDashboardWithValidlogin(driver);
	}
	@Test
	public void ValidBashboard() {
		Assert.assertTrue(Dp.DashboardHeadingVerfiy());
		
		
		
		
	}
}
