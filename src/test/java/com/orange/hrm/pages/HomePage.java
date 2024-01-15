package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;

public class HomePage {
	@FindBy(xpath="//span[text()='Admin']")
	WebElement adminlink;
	
	@FindBy(xpath="//img[@class='oxd-userdropdown-img']")
	WebElement image;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutBtn;
	
	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickOnAdminLink() {
		adminlink.click();
	}
	
	public void clickOnLogout() {
		image.click();
		logoutBtn.click();
	}

}
