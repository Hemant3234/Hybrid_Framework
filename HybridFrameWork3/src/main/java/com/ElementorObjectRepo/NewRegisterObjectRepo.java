package com.ElementorObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRegisterObjectRepo {
	
	@FindBy(xpath="//a[text()='Register a new membership']")
	public WebElement Newregister;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement Entername;
	
	@FindBy(id="mobile")
	public WebElement Entermobile;
	
	@FindBy(id="email")
	public WebElement Enteremail;
	
	@FindBy(id="password")
	public WebElement Enterpass;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement signinbutton;

}
