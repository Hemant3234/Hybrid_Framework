package com.Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListner implements IRetryAnalyzer {
	int count = 1;
	int maximumlimt = 3;

	@Override
	public boolean retry(ITestResult result) {
	if(count<maximumlimt) {
		count++;
		
		return true;
	}
		return false;
	}

}
