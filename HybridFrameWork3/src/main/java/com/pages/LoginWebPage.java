package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.ElementorObjectRepo.LoginObjectRepo;

public class LoginWebPage extends LoginObjectRepo {
	public static Logger log = Logger.getLogger(LoginWebPage.class);

	public LoginWebPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public DashboardWebpage navigateToDashboardWithValidlogin(WebDriver driver ) {

		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
		log.info("correctcred successfully login ");
		return new DashboardWebpage(driver);
	}
	
	

	

}
