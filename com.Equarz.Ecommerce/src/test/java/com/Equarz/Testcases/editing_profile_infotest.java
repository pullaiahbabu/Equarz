package com.Equarz.Testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.editing_profile_infofunctionality;
import com.base.Testbase;

public class editing_profile_infotest extends Testbase {
	editing_profile_infofunctionality ef;
	Login_Functionality lg;
	
	
	public editing_profile_infotest ()
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
		ef=new editing_profile_infofunctionality (driver);		
				
	}
	@Test()
	public void search() throws InterruptedException, AWTException
	{
		ef.editprofie();
		
	}

}
