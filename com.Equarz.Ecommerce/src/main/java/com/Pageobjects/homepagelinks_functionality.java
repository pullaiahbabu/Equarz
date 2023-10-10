package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;
import com.graphbuilder.curve.Point;

public class homepagelinks_functionality extends Testbase {
	@FindBy(xpath="//h6[text()='Special']")
	WebElement scroll;
	@FindBy(xpath="//a[text()='Featured Products']")
	WebElement featureproduct;
	@FindBy(xpath="//a[text()='Latest Products']")
	WebElement latest;
	@FindBy(xpath="//a[text()='Best Selling Products']")
	WebElement sellingprod;
	@FindBy(xpath="//a[text()='Top Rated Products']")
	WebElement toprated;
	@FindBy(xpath="//a[text()='Profile Info']")
	WebElement profileinfo;
	@FindBy(xpath="//a[text()='Track Order']")
	WebElement trackorder;
	@FindBy(xpath="//a[text()='Refund policy']")
	WebElement refund;
	@FindBy(xpath="//a[text()='Return policy']")
	WebElement returnpolicy;
	@FindBy(xpath="//a[text()='Cancellation policy']")
	WebElement cancellation;
	@FindBy(xpath="//i[@class='fa fa-phone m-2']")
	WebElement phone;
	@FindBy(xpath="//i[@class='fa fa-envelope m-2']")
	WebElement mail;
	@FindBy(xpath="//i[@class='fa fa-user-o m-2']")
	WebElement supportticket;
	@FindBy(xpath="//i[@class='fa fa-twitter']")
	WebElement twitter;
	@FindBy(xpath="//i[@class='fa fa-linkedin']")
	WebElement linkedin;
	@FindBy(xpath="//i[@class='fa fa-google-plus-square']")
	WebElement google;
	@FindBy(xpath="//i[@class='fa fa-pinterest']")
	WebElement pinterest;
	@FindBy(xpath="//i[@class='fa fa-instagram']")
	WebElement insta;
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	WebElement facebook;
	//AddressUtils au;
	
	
	public homepagelinks_functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void validatelinks() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		featureproduct.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/products?data_from=featured&page=1", url);
	}
		//Thread.sleep(2000);
	public void latestproduct() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		latest.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/products?data_from=latest&page=1", url);
	}
	public void sellingproducts() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		sellingprod.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/products?data_from=best-selling&page=1", url);
	}
	public void toprated() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		toprated.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/products?data_from=top-rated&page=1", url);
	}
	public void profileinfo() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		profileinfo.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/user-account", url);
	}
	public void trackorder() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		trackorder.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/track-order", url);
	}
	public void refundpolicy() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		refund.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/refund-policy", url);
	}
	public void returnpolicy() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		returnpolicy.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/return-policy", url);
	}
	public void cancellation() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		cancellation.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/cancellation-policy", url);
	}
	
	public void mail() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		mail.click();
//		String url=driver.getCurrentUrl();
//		assertEquals("", url);
	}
	public void supportticket() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		supportticket.click();
		String url=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/account-tickets", url);
	}
	public void phone() 
	{
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		phone.click();
//		String url=driver.getCurrentUrl();
//		assertEquals("http://e-quarz.com/products?data_from=featured&page=1", url);
	}
	public void twitter() 
	{
		String str="";
		 String window1=driver.getWindowHandle();
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		twitter.click();
		String url=driver.getCurrentUrl();
		assertEquals("https://twitter.com/i/flow/login?redirect_after_login=%2F%3Flang%3Den-in", url);
	}
	public void linkedin() 
	{
		String str="";
		 String window1=driver.getWindowHandle();
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		linkedin.click();
		String url=driver.getCurrentUrl();
		assertEquals("https://in.linkedin.com/", url);
	}
	public void google() 
	{
		String str="";
		 String window1=driver.getWindowHandle();
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
	    google.click();
	    String url=driver.getCurrentUrl();
		assertEquals("https://www.marolix.com/", url);
	}
	public void pinterest() 
	{
		
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		String str="";
		 String window1=driver.getWindowHandle();
		pinterest.click();
		String url=driver.getCurrentUrl();
		assertEquals("https://www.pinterest.com/pinterest/", url);
	}
	public void insta() 
	{
		
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		String str="";
		 String window1=driver.getWindowHandle();
		insta.click();
		//au.windowhandles(window1);
		String url=driver.getCurrentUrl();
		driver.switchTo().window(window1);
		assertEquals("https://www.instagram.com/?hl=en", url);
	}
	public void facebook() 
	{
		
		org.openqa.selenium.Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		String str="";
		 String window1=driver.getWindowHandle();
		facebook.click();
		//au.windowhandles(window1);
		String url=driver.getCurrentUrl();
		driver.switchTo().window(window1);
		assertEquals("https://www.facebook.com/", url);
	}
		

}
