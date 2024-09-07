package com.ElementorObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserObjectRepo {
	
	@FindBy(xpath="//span[text()='Users']")
	public WebElement userbutton;
	
	@FindBy(tagName="h1")
	public WebElement usertext;
	
	
	

}

