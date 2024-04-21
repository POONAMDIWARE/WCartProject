package com.WCart.pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
WebDriver driver=null;
	
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//div[@class='caption']/h4/a")//8 element
	List<WebElement> products;
	
	public List<String> getAllProducts() {
		
		List<String> productNames= new ArrayList<String>();
		for(WebElement product : products)
		{
			String text=product.getText();
			productNames.add(text);
		}
		return productNames;
	}

}	

