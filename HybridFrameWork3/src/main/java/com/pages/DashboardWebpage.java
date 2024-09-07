package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ElementorObjectRepo.DashboradObjectRepo;

public class DashboardWebpage extends DashboradObjectRepo  {
	
	public DashboardWebpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean  DashboardHeadingVerfiy(){
		
		String actultext=headingDashboard.getText();
		String Expectedtext="Java By Kiran";
		if(actultext.equals(Expectedtext)) {
			System.out.println("Heading matched");
			return true;
			
		}else {
			System.out.println("Heading not matched");
		return false;
			
			
		}
		}
	public UserWebPage navigateUserpage(WebDriver driver ) {
		 userbutton.click();
		
		return new UserWebPage(driver);
	}

}
