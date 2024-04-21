package com.WCart.pageObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
   WebDriver driver=null;
   int j=0;
   String[] productneeded={"test mobile","Sony Vaio 30","Sony Vaio 29"};
	
	public AddToCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='caption']/h4/a")
	List<WebElement> products;
	
	@FindBy(xpath="//div//button//span[text()='Add to Cart']") 
	WebElement cart;
	
	
	public List<String> getProducts() throws Exception
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		List<String> productNames= Arrays.asList(productneeded);
		for(int i=0;i<productNames.size();i++)
		{
			String xpath="//a[contains(text(),'"+productNames.get(i).trim()+"')]";
			System.out.println(xpath);
			js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(xpath)));
			WebElement name=driver.findElement(By.xpath(xpath));
			name.click();
			Thread.sleep(3000);
			driver.findElement(By.id("button-cart")).click();
			driver.findElement(By.xpath("//a[text()='Home']")).click();
		}
			
		return productNames;
		}
}
