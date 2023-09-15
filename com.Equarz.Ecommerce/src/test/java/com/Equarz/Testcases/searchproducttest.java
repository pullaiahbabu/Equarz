package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.searchproductaddtocart;
import com.base.Testbase;

public class searchproducttest extends Testbase {
	
searchproductaddtocart cf;
	
	
	public searchproducttest()
	{
		super();
	}
	@BeforeMethod
	public void intialization()
	{
		Setup();
		cf= new searchproductaddtocart(driver);
		
	}
//	@Test(priority = 1)
//	public void validatelogin() throws InterruptedException
//	{
//		lg.Verifylogin();
//	
//	}
	@Test()
	public void verifyurl() throws InterruptedException {
		
		cf.Verifylogin();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/us-polo-assn-kids-boys-boys-shirts-C7anpx", url);
	}
	
	

}
