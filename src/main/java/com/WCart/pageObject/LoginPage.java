package com.WCart.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	
WebDriver driver=null;
	
	//LoginPage lp= new LoginPage(driver);
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//*[@id='top-links']/ul/li[1]") WebElement DropDown;
	
	@FindBy(xpath="//*[@id='w13']/li[2]/a") WebElement login;
	
	@FindBy(id="loginform-username")
	WebElement username;
	
	@FindBy(id="loginform-password")
	WebElement password;
	
	@FindBy(id="loginform-rememberme")
	WebElement remember;
	
	@FindBy(id="savebutton")
	WebElement loginBtn;
	
@FindBy(xpath="//li[@class='dropdown open']/span[text()='DPoonam']") 
WebElement Dpoonam;
	
	@FindBy(xpath="//ul[@id='w5']/li/a[text()='My Account']")
	WebElement account;
	
    
	public MyAccountPage validLogin() {
		DropDown.click();
		login.click();
		username.sendKeys("Dpoonam");
		password.sendKeys("Poonam@1994");
		loginBtn.click();
		
		return new MyAccountPage(driver);
	}
	public void loginToApplication(String uname, String pass) {
		DropDown.click();
		login.click();
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}

}
