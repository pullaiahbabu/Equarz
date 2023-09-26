package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.wishlistfunctionality;
import com.base.Testbase;

public class wishfunctionalitytest extends Testbase {
	wishlistfunctionality pf;
	Login_Functionality lg;
	
	
	public  wishfunctionalitytest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg. verifylogin();
		pf=new wishlistfunctionality (driver);		
				
	}
	@Test()
	public void categorywishlist () throws InterruptedException 
	{
		pf.catwishlist();
		
	}
	
	@Test()
	public void searchwishlist() 
	{
		pf.searchwishlist();
	}
	@Test()
	public void bannerhwishlist() 
	{
		pf.bannerwishlist();
	}
	@Test()
	public void homehwishlist() 
	{
		pf.homewishlist();
	}
	@Test()
	public void dealswishlist() 
	{
		pf.dealswishlist();
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		

}
