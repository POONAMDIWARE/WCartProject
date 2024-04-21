package com.Tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.WCart.pageObject.LoginPage;
import com.WCart.pageObject.MyAccountPage;
import com.WCart.pageObject.SearchPage;
import com.base.BaseClass;
import com.listeners.MyListeners;

@Listeners(MyListeners.class)
public class SearchTest extends BaseClass{
	LoginPage LP=null;
	MyAccountPage map =null;
	SearchPage sp= null;
	
	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
		LP = new LoginPage(driver);
	}
	
	@Test
	public void test01() throws Exception  
	{
		map= LP.validLogin();
		sp=new SearchPage(driver);
		Thread.sleep(3000);
		sp.validsearch();
		
    }

}
