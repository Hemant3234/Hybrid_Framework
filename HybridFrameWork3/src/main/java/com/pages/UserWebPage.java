package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ElementorObjectRepo.UserObjectRepo;

public class UserWebPage extends UserObjectRepo{
	public UserWebPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean Usertext() {
		userbutton.click();
		String text=usertext.getText();
		if(text.equals("Users")) {
			System.out.println("Title matched");
			return true;
			
		}
		return false;
		
		
		
		
	
	}
	

}
