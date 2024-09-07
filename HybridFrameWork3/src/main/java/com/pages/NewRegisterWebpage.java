package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ElementorObjectRepo.NewRegisterObjectRepo;

public class NewRegisterWebpage extends NewRegisterObjectRepo {
	
	
	public NewRegisterWebpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Registerdata() {
		Newregister.click();
		Entername.sendKeys("Hemant");
		Entermobile.sendKeys("123456");
		Enteremail.sendKeys("HEM@gmailcom");
		Enterpass.sendKeys("123");
		signinbutton.click();
	}
	

}
