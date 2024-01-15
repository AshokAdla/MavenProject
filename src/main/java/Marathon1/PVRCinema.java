package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinema {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//01) Launch the url https://www.pvrcinemas.com/
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().window().maximize();
	
		//02) Select the City -->Chennai
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
	
		//03) Click on Movie Library under hamburger button
		//driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		
		//04) Select the Genre-->Animation
		driver.findElement(By.xpath("//span[normalize-space()='Genre']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='ANIMATION']")).click();
		
		//05) Select the Language-->English
		driver.findElement(By.xpath("//span[normalize-space()='Language']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ng-star-inserted'][normalize-space()='ENGLISH']")).click();
		
		//06) Click on Apply
		
		
		//07) Click on first resulting animation movie
		driver.findElement(By.xpath("//section[@class='pvr-sec black-bg nowshowing-movies carousel-style-2']//div[@class='m-info']")).click();
		
		//08) Click proceed to book
		driver.findElement(By.xpath("//section[@class='pvr-sec black-bg nowshowing-movies carousel-style-2']//a[@class='btn btn-primary-white text-uppercase ng-star-inserted'][normalize-space()='Book Tickets']")).click();
		
		//09) Enter all fields cinema , Name, date, preferred show time, no of seats, food and beverages, Email and Mobile
		
		//(//div[@class='cinema-title'])[1]
		
		//h4[@class='title'][normalize-space()='PVR VR Chennai Anna Nagar']
		
		//(//span[@class='slot text-success'])[1]
				
		//button[text()='Accept']
		
		
		
		
		
		
		
		//10) Click on copy to self 
		
		//11) Click on Send Request

		//12) Click cancel 

		//13) Close the OTP dialog

		//14) Verify the title of the page
	}

}
