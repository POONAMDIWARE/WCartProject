package com.WCart.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
WebDriver driver=null;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(id="navbarsearchform-keyword") 
    WebElement search;
	
	@FindBy(xpath="//span//button[@type='submit']")
	WebElement button;
	
	public void validsearch() {
		search.sendKeys("test mobile");
		button.click();

	}
	
	public void searchProduct(String name) {
		search.sendKeys(name);
		
		button.click();
	}
}
