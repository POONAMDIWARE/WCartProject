package com.WCart.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountInfo {
	
WebDriver driver=null;
	
	public MyAccountInfo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//a[@title='My Account']/span") 
    WebElement DPoonam;
	
	@FindBy(xpath="//a[text()='My Account']")
	WebElement MyAccount;

	
	public void clickonDPoonam()
	{

		DPoonam.click();
	}
	

	public void clickonMyAccount()
	{
		MyAccount.click();
	}
	
}
