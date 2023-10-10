package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.searchfunctionality;
import com.base.Testbase;

public class S_functionalitytest extends Testbase {
	 searchfunctionality bf;
	Login_Functionality lg;

	
	
	public S_functionalitytest ()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.verifylogin();
		bf=new  searchfunctionality(driver);		
				
	}
	@Test()
	public void search () throws InterruptedException 
	{
		bf.validatesearch();
		
	}
	@Test()
	public void searchdrop () throws InterruptedException 
	{
		bf.dropdownsearch();
		
	}
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}



	

}
