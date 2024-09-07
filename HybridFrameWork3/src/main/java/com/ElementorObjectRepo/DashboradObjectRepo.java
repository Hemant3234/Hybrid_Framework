package com.ElementorObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboradObjectRepo {
	
	@FindBy(xpath="//b[text()='Java By Kiran']")
	public WebElement headingDashboard;
	@FindBy(xpath="//span[text()='Users']")
	public WebElement userbutton;

}
