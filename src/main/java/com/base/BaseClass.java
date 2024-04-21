package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.WCart.utilities.PropertyUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	
	public static WebDriver driver =null;
	public static ExtentReports report= null;
	public static ExtentSparkReporter spark=null;
	public static ExtentTest test=null;
	
	Logger log = Logger.getLogger(BaseClass.class);
	
	public void initialization() {
		
		System.out.println("Reading property file for browser");// console
		log.info("Reading property file for browser");// file 
		
		String browserName= PropertyUtils.readproperty("browser");
		String productsName= PropertyUtils.readproperty("String[] productneeded");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver= new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver= new FirefoxDriver();
		}
		 if(browserName.equals("edge"))
		    {
		    	System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		    	driver=new EdgeDriver();
		    }

		driver.manage().window().maximize();
		driver.get(PropertyUtils.readproperty("url"));
		
	}
	
	public void reportInit() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReports.html");
		report.attachReporter(spark);
	}
	

}
