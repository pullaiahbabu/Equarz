package com.Equarz.Testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class LoginTest extends Testbase {
	
	 Login_Functionality lg;
	
	public LoginTest() {
		super();
		
	} 
	
	@BeforeMethod 
	public void initialization() {
		
		 Setup();  
		 lg=new  Login_Functionality(driver);
		 
		
	}
	@Test
	
	public void verifyurl() throws InterruptedException {
		
		lg.verifylogin();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/", url);
		
	}



}
