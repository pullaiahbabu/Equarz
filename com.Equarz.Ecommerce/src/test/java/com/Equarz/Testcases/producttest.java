package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.productfunctionality;
import com.base.Testbase;

public class producttest extends Testbase {
	productfunctionality pf;
	public producttest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf=new productfunctionality (driver);
		
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf.validateProduct();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/panasonic-20l-solo-microwave-oven-nn-st26jmfdg-silver-51-auto-menus-C81NSM", url);
	}
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}


	
	
	

}
