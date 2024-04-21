package com.Tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.WCart.pageObject.LoginPage;
import com.WCart.pageObject.MyAccountInfo;
import com.WCart.pageObject.MyAccountPage;
import com.base.BaseClass;

public class MyAccountInfoTest extends BaseClass {
	
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
	public void test01() throws Exception 
	{
		map= lp.validLogin();
		MAI=new MyAccountInfo(driver);
		Thread.sleep(3000);
		MAI.clickonDPoonam();
		MAI.clickonMyAccount();
	}

}
