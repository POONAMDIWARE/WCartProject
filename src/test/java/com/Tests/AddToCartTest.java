package com.Tests;

import java.util.List;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.WCart.pageObject.AddToCart;
import com.WCart.pageObject.LoginPage;
import com.WCart.pageObject.MyAccountPage;
import com.base.BaseClass;

public class AddToCartTest extends BaseClass {
	
	LoginPage LP=null;
	MyAccountPage map =null;
	AddToCart ATC=null;
	
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
		ATC=new AddToCart(driver);
		Thread.sleep(3000);
		//List<String>products =ATC.getProducts();
		ATC.getProducts();
		
    }

}
