package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {
	public static void main(String[] args) throws InterruptedException, IOException{
		ChromeDriver driver=new ChromeDriver();
		
		//Launch ServiceNow application
		driver.get("https://dev206556.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//Login with valid credentials username as admin and password 
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Testleaf@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(10000);
		
		//Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		Shadow dom=new Shadow(driver);
		dom.findElementByXPath("//div[text()='All']").click();
		Thread.sleep(2000);
		
		Shadow filter=new Shadow(driver);
		filter.findElementByXPath("//input[@id='filter']").click();
		filter.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		filter.findElementByXPath("//a[@aria-label='Service Catalog']").click();
		Thread.sleep(4000);
		
		//Click on  mobiles
		driver.switchTo().frame("Mobiles");
		Shadow mob=new Shadow(driver);
		mob.findElementByXPath("//h2[text()='Mobiles']").click();
		//driver.findElement(By.xpath("//h2[normalize-space()='Mobiles']")).click();	//img[@alt='Mobiles']
//		driver.findElement(By.xpath("//input[@class='scSearchInput']")).click();
//		driver.findElement(By.xpath("//input[@class='scSearchInput']")).sendKeys("Apple iPhone 13 pro",Keys.ENTER);
		Thread.sleep(2000);
		
		//Select Apple iphone13pro
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		//Choose yes option in lost or broken iPhone
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
	
		//Enter phonenumber as 99 in original phonenumber field
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
		
		//Select Unlimited from the dropdown in Monthly data allowance
		WebElement dataallow=driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select data=new Select(dataallow);
		data.selectByVisibleText("Unlimited [add $4.00]");
		
		//Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		
		//Click on Order now option
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		Thread.sleep(4000);
		
		//Verify order is placed and copy the request number
		String orderno=driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println(orderno);
		
		//Take a Snapshot of order placed page
		TakesScreenshot snapshot=(TakesScreenshot)driver;
		File srcfile=driver.getScreenshotAs(OutputType.FILE);
		String despath="C:\\screenshots\\test.png";
		File dest=new File(despath);
		FileUtils.copyFile(srcfile, dest);
		
		//driver.close();
	}
}
