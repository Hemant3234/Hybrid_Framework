package com.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;



public class PropertiesUtils {
	public static WebDriver driver = null;
	public static FileInputStream fis = null;
	public static Logger log = Logger.getLogger(PropertiesUtils.class);

	public static String readProprty(String key) throws Exception {
		log.info("read data from proprty file");
		String userdir= System.getProperty("user.dir");
		
		
		Properties prop = new Properties();
		
		fis = new FileInputStream(userdir + "/src/main/resources/Config.properties");
		prop.load(fis);
		
		log.info("Value found in proprty file");
		
		return prop.getProperty(key);

	}

}
