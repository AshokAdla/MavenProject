package com.orange.hrm.test;

import org.testng.annotations.Test;

import com.orange.hrm.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginToApplcnWithValidUsernamePassword() {
		LoginPage obj=new LoginPage();
		obj.loginToApplication("Admin", "admin123");
	}

}
