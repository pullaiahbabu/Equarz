package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class searchproductaddtocart extends Testbase {
	
	@FindBy(xpath="//button[@class='close __close']")
	WebElement close;
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	
	@FindBy(xpath="//span[@class='input-group-text __text-20px']")
	WebElement button;
	
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/us-polo-assn-kids-boys-boys-shirts-C7anpx']")
	WebElement product;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addcart;
	
	

	
	
	
	
	public searchproductaddtocart(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public homepage Verifylogin() throws InterruptedException {
		
		close.click();

		search.sendKeys(props.getProperty("search"));
		button.click();
		
		Thread.sleep(5000);
		product.click();
		Thread.sleep(5000);
		addcart.click();
		
		

		return new homepage();
	}
	
	
	

}
