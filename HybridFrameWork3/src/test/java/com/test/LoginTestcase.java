package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.LoginWebPage;

public class LoginTestcase extends TestBase {
	public static Logger log = Logger.getLogger(LoginTestcase.class);
//	public static WebDriver driver
	public LoginWebPage lp;

	@BeforeSuite
	public void BrowerOpen() throws Exception {

		log.info("bowser open log4j ");

		initialization();
	//	reportInit();
		lp = new LoginWebPage(driver);

	}

	@Test
	public void verifyTitle() {
		// lp.correctcred();
		lp.navigateToDashboardWithValidlogin(driver);
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboardd");
		log.info("1st testcase excuted with log4j");

	}

	
}
