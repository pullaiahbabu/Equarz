package com.Equarz.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.addadressanddeleteadress;
import com.Utils.addadressutils;
import com.base.Testbase;

public class addadressanddeleteadress_test extends Testbase {
	addadressanddeleteadress af;
	Login_Functionality lg;
	
	
	public addadressanddeleteadress_test()
	{
		super();
	}
	@BeforeClass
	public void login() throws InterruptedException
	{
		Setup();
		lg=new Login_Functionality(driver);
		lg.verifylogin();
		
	}
	@BeforeMethod
	public void initialize() 
	{
		
//		Setup();
//		lg=new Login_Functionality(driver);
//		lg.validateLogin();
		af=new 	addadressanddeleteadress (driver);		
				
	}
	@Test(priority=1,dataProvider = "setdata",dataProviderClass =addadressutils.class,description = "address added successfully")
	public void addaddress(String name,String phone,String city,String zipcode) throws InterruptedException 
	{
		af.addaddress(name,phone,city,zipcode);
		
	}
	@Test(priority=2,description = "address edited successfully")
	public void editaddress()
	{
		af.editaddress();
	}
	@Test(priority=3,description = "address deleted successfully")
	public void deleteaddress() throws Throwable
	{
		af.deleteaddress();
	}
	
	

}
