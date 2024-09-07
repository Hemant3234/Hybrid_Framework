package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.NewRegisterWebpage;


public class NewRegisterTestcase extends TestBase{
	public static Logger log=Logger.getLogger(NewRegisterTestcase.class);
//	public static  WebDriver driver;
	NewRegisterWebpage regi=null;
	@BeforeMethod
	public void BrowerOpen() throws Exception {
		
		log.info("bowser open log4j ");
	
		driver=initialization();
		
		regi = new NewRegisterWebpage (driver);
	   
	}
	@Test 
	public void VerifiyRegister() {
		regi.Registerdata();
		String alert=driver.switchTo().alert().getText();
		Assert.assertEquals(alert, "User registered successfully.");
		driver.switchTo().alert().accept();
		log.info("VerifiyRegister passed ....");
		
		
	}
	
	
	

}
