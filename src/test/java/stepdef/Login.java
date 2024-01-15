package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
	
	@And("Enter the Username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@And("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Then("Welcome page is displayed")
	public void verifyWelcome() {
		System.out.println(driver.getTitle());
	}
	
	@But("Error message is displayed")
	public void LoginFailed() {
		String msg=driver.findElement(By.xpath("//p[text()='following error occurred during login: User not found.']")).getText();
		System.out.println(msg);
	}
}
