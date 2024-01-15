package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;

public class LoginPage {
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement userPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void loginToApplication(String username, String password) {
		userName.sendKeys(username);
		userPassword.sendKeys(password);
		loginBtn.click();
	}

}
