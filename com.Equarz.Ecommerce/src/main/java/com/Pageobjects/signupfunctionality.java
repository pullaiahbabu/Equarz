package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class signupfunctionality extends Testbase {
	
	@FindBy(xpath="//input[@name='f_name']")
	WebElement fname;
	
	@FindBy(name="l_name")
	WebElement lname;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(name="con_password")
	WebElement confirmpassword;
	@FindBy(id="inputCheckd")
	WebElement checkbox;
	
	@FindBy(id="sign-up")
	WebElement signup;
	
	public signupfunctionality(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public homepage validatesignup(String firstname1,String lastname1,String Email1,String phonenumber1,String password1,String confirmpassword1) throws InterruptedException {
		
		fname.sendKeys(firstname1);
		lname.sendKeys(lastname1);
		email.sendKeys(Email1);
		phone.sendKeys(phonenumber1);
		password.sendKeys(password1);
		confirmpassword.sendKeys(confirmpassword1);
		checkbox.click();
		Thread.sleep(10000);
		
		signup.click();
		return new homepage();
		
		
		
	
	
	
	

	
		
	
		
	}
}
