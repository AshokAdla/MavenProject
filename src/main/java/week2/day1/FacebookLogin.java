package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		
		//Enter the url
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Enter the mail id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Enter the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Click on Login 
		driver.findElement(By.name("login")).click();
		
		//Verify the link
		String linktext=driver.findElement(By.linkText("Find your account and log in.")).getText();
		System.out.println(linktext);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
