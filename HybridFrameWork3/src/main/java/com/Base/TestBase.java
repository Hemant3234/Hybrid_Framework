package com.Base;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.log4testng.Logger;

import com.Utilities.PropertiesUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.pages.LoginWebPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver = null;
	public static ExtentReports report=null;
	public static ExtentSparkReporter spark=null;
	public static ExtentTest test=null;
	

	public static Logger log = Logger.getLogger(TestBase.class);

	public WebDriver initialization() throws Exception {
		String Browsername = PropertiesUtils.readProprty("browser");

		if (Browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
	//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();

		}
		if (Browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		//	System.setProperty("webdriver.geko.driver", "gekodriver.exe");
			driver = new FirefoxDriver();

		}
		if (Browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
		//	System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.get(PropertiesUtils.readProprty("url"));
		
		driver.manage().window().maximize();

		return driver;
	}
	public void reportInit() {
		String reportpath=System.getProperty("user.dir"+"Teaget/extendreport.html");
		report=new ExtentReports();
		spark=new ExtentSparkReporter(reportpath);
		report.attachReporter(spark);
		
	}

	public LoginWebPage loadLoginpage() {
		LoginWebPage loginpage = new LoginWebPage(driver);
		return loginpage;
		// Create object of loginpage becoz every page required login 1st so therefore
		// here create object 1st.
	}

}
