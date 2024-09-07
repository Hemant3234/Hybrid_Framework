package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.DashboardWebpage;
import com.pages.LoginWebPage;
import com.pages.UserWebPage;


public class UserTestcase extends TestBase{
	public static Logger log=Logger.getLogger(UserTestcase.class);
	public static  WebDriver driver;
	public LoginWebPage lp;
    public UserWebPage up;

	@BeforeMethod
	public void BrowerOpen() throws Exception {
		
		log.info("bowser open log4j ");
	
		driver=initialization();
		
		//lp = new LoginWebPage(driver);
		//up=new UserWebPage(driver);
	//	Dp=loadLoginpage().navigateToDashboard(driver);
		
		up=loadLoginpage().navigateToDashboardWithValidlogin(driver).navigateUserpage(driver);
	//up=loadLoginpage().navigateToDashboard(driver).navigateDownloadPage(driver)
		
	}
	
	@Test
	public void test()
	{
		Assert.assertEquals(true, true);
	}
}
