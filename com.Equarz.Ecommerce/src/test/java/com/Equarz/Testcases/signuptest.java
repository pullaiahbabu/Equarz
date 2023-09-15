package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pageobjects.signupfunctionality;
import com.Utils.Utils;
import com.base.Testbase;

public class signuptest extends Testbase {
	
	signupfunctionality sf;
	
	public signuptest() {
		super();
		
	}

	@BeforeMethod
	
	public void initialization() {
		 Setup(); 
		  sf=new signupfunctionality(driver);
	}
	
	@Test(dataProvider = "setdata",dataProviderClass = Utils.class)
	
	public void verifyurl(String firstname,String lastname,String Email,String phonenumber,String password,String confirmpassword) throws InterruptedException {
		
		
		 sf.validatesignup(firstname,lastname,Email,phonenumber,password,confirmpassword);
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/customer/auth/login", url);
		
		
		
	}
}
