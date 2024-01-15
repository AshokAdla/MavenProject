package week2.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookAccountCreation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//Enter the First name.
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Simon");
		
		//Enter the Surname.
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("John");
		
		Thread.sleep(3000);
		//Enter the Mobile number or email address.	
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9012345678");
		
		
		//Enter the New password.
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("password@123");
		
		//Handle all three dropdowns in Date of birth
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select bday=new Select(day);
		bday.selectByValue("21");
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select bmonth=new Select(month);
		//bmonth.selectByValue("Mar");
		bmonth.selectByVisibleText("Mar");
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select byear=new Select(year);
		byear.selectByValue("2000");
		Thread.sleep(2000);
		
		//Select the radio button in Gender.
		WebElement radio=driver.findElement(By.xpath("//label[text()='Male']"));
		radio.click();

		//Click on Sign Up button
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}

}
