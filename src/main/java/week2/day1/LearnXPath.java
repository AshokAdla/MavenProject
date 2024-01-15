package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXPath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.nykaa.com");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		WebElement username=driver.findElement(By.id("username"));
//		username.sendKeys("DemoCSR");
//		
//		//Input password
//		WebElement password=driver.findElement(By.id("password"));
//		password.sendKeys("crmsfa");
//		
//		//Click on submit
//		driver.findElement(By.className("decorativeSubmit")).click();
//		
//		//Click on CRM/SFA
//		driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
