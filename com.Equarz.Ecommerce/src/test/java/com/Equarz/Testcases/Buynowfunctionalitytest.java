package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Buynowfunctionality;
import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class Buynowfunctionalitytest extends Testbase {
	Buynowfunctionality bf;
	Login_Functionality lg;
	
	
	public Buynowfunctionalitytest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.verifylogin();
		bf=new Buynowfunctionality (driver);		
				
	}
	@Test()
	public void addbuy () throws InterruptedException 
	{
		bf.addbuy();
		
	}
	@Test()
	public void buynow () throws InterruptedException
	{
		bf.buynow();
		
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}
	
	

}
