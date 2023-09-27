package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class Buynowfunctionality extends Testbase {
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	WebElement cat;
	@FindBy(xpath="//span[text()='Microwave oven']")
	WebElement subcat;
	@FindBy(xpath="//a[text()='Premium']")
	WebElement subsub;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/lg-20-l-solo-microwave-oven-ms2043db-black-laymMs']")
    WebElement product;
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;
	@FindBy(xpath="//i[@class='navbar-tool-icon czi-cart']")
	WebElement cart;
	@FindBy(xpath="//select[@class='form-control']")
	WebElement shipping;
	Utils ul;
	@FindBy(xpath="//a[@class='btn btn--primary pull-right']")
	WebElement checkout;
	@FindBy(xpath="//input[@id='same_as_shipping_address']")
	WebElement checkbox;
	@FindBy(xpath="//span[text()='Proceed payment']")
	WebElement payment;
	@FindBy(xpath="//img[@class='__mt-n-10']")
	WebElement cod;
	@FindBy(xpath="//div[@class='col-md-6']")
	WebElement msg;
	
	
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/pendrive-IPD16H']")
	WebElement prod;
	@FindBy(xpath="//span[text()='Buy now']")
	WebElement buynow;
	
	public Buynowfunctionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void addbuy() throws InterruptedException 
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(cat).build().perform();
		Thread.sleep(3000);
		ac.moveToElement(subcat).build().perform();
		subsub.click();		
		product.click();
		addtocart.click();
		cart.click();
		ul=new Utils();
		ul.dropdown(shipping, "2");
		checkout.click();
		checkbox.click();
		payment.click();
		cod.click();
		String print=msg.getText();
		assertEquals("Your order has been placed successfully! !",print);
		

	}
	public void buynow() throws InterruptedException 
	{
			
		prod.click();
		buynow.click();
		ul=new Utils();
		ul.dropdown(shipping, "4");
		checkout.click();
		checkbox.click();
		payment.click();
		cod.click();
		String print=msg.getText();
		assertEquals("Your order has been placed successfully! !",print);
		
	
	}	
	
	
	

}
