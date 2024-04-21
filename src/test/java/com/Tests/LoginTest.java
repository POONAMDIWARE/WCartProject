package com.Tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.WCart.pageObject.LoginPage;
import com.WCart.pageObject.MyAccountInfo;
import com.WCart.pageObject.MyAccountPage;
import com.WCart.pageObject.SearchPage;
import com.base.BaseClass;

public class LoginTest extends BaseClass
{
	
	LoginPage lp=null;
	MyAccountPage map =null;
	MyAccountInfo MAI=null;
	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
		lp = new LoginPage(driver);
	}

	@Test
	public void test01() 
	{
	map= lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "Login");
	}
	@Test
	public void test02() throws Exception {
		Thread.sleep(3000);
		List<String>products =map.getAllProducts();
		
		System.out.println(products);
		
	}
	@Test
	public void test03()
	{
		throw new SkipException("Testcase skipped");
	}
	
	@Test
	public void test04()
	{
		throw new SkipException("Testcase skipped");
	}
	
	
}
