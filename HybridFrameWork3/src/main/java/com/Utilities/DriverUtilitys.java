package com.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.TestBase;

public class DriverUtilitys extends TestBase {
	
	public static String captureScreeshot(String name) {
		
		TakesScreenshot ts =(TakesScreenshot)driver;  
		File src =ts.getScreenshotAs(OutputType.FILE);
		String path=(System.getProperty("user.dir")+"/Screenshot/"+name+".jpg");
		File dest =new File(path);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return path;
	}

}
