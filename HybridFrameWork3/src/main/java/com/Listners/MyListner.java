package com.Listners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Base.TestBase;
import com.Utilities.DriverUtilitys;
import com.aventstack.extentreports.Status;

public class MyListner extends TestBase  implements ITestListener{
	public static WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		System.out.println("Testcase Start with name :" + result.getName());
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	//	System.out.println("Testcase Successed with name :" + result.getName());
		test.log(Status.PASS, "TestCase is Passed");
	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	//	System.out.println("Testcase Failed with name :" + result.getName());
		test.log(Status.FAIL, "tescase is failed");
		String path= DriverUtilitys.captureScreeshot(result.getName());
		test.addScreenCaptureFromPath(path);
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	//	System.out.println("Testcase Skipped with name :" + result.getName());
		test.log(Status.SKIP, "testcase is Skipped");
		
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("All Testcases or Testcase suit on Staret with name :" + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All Testcases or Testcase suit on Finished with name :" + context.getName());
		report.flush();
		
	}

}
