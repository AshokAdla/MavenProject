package Marathon3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow_DeleteIncident {
	public static void main(String[] args) throws InterruptedException, IOException{
		ChromeDriver driver=new ChromeDriver();
		
		//Launch ServiceNow application
		driver.get("https://dev208767.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//Login with valid credentials username as admin and password 
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("vRyg1*5K/EpI");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(10000);
		
		//Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		Shadow dom=new Shadow(driver);
		dom.findElementByXPath("//div[text()='All']").click();
		Thread.sleep(2000);
		
		Shadow filter=new Shadow(driver);
		filter.findElementByXPath("//input[@id='filter']").click();
		filter.findElementByXPath("//input[@id='filter']").sendKeys("Incidents");
		Thread.sleep(2000);
		filter.findElementByXPath("//mark[text()='Incidents']").click();
		Thread.sleep(4000);
		
		WebElement frame=dom.findElementByXPath("//iframe[@id='gsft_main']");
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		Thread.sleep(2000);
		
		String incidentnumber=driver.findElement(By.xpath("//input[@aria-label='Number']")).getAttribute("value");
		System.out.println(incidentnumber);
		
		driver.findElement(By.xpath("//button[@name='lookup.incident.caller_id']")).click();
		Thread.sleep(5000);
		
		Set<String> winds = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(winds);
		driver.switchTo().window(lst.get(1));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Abel Tuter']")).click();
		
		driver.switchTo().window(lst.get(0));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@name='incident.short_description']")).sendKeys("First Incident");
		
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@aria-describedby='6c8d9ccf935f7110f710327efaba100f_describedby']")).sendKeys(incidentnumber,Keys.ENTER);
		Thread.sleep(5000);
		
		String obtincidentnumber=driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		
		if(obtincidentnumber.equals(incidentnumber)) {
			System.out.println("Incident numbers are matching");
		}else {
			System.out.println("Incident numbers are not matching");
		}
		
		//driver.close();
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//Click on  mobiles
//		driver.switchTo().frame("Mobiles");
//		Shadow mob=new Shadow(driver);
//		mob.findElementByXPath("//h2[text()='Mobiles']").click();
//		Thread.sleep(2000);
//		
//		//Select Apple iphone13pro
//		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
//		
//		//Choose yes option in lost or broken iPhone
//		driver.findElement(By.xpath("//label[text()='Yes']")).click();
//	
//		//Enter phonenumber as 99 in original phonenumber field
//		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
//		
//		//Select Unlimited from the dropdown in Monthly data allowance
//		WebElement dataallow=driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
//		Select data=new Select(dataallow);
//		data.selectByVisibleText("Unlimited [add $4.00]");
//		
//		//Update color field to SierraBlue and storage field to 512GB
//		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
//		
//		//Click on Order now option
//		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
//		Thread.sleep(4000);
//		
//		//Verify order is placed and copy the request number
//		String orderno=driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
//		System.out.println(orderno);
//		
//		//Take a Snapshot of order placed page
//		TakesScreenshot snapshot=(TakesScreenshot)driver;
//		File srcfile=driver.getScreenshotAs(OutputType.FILE);
//		String despath="C:\\screenshots\\test.png";
//		File dest=new File(despath);
//		FileUtils.copyFile(srcfile, dest);
//		
//		//driver.close();
	}
}
