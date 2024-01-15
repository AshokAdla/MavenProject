package week2.day1;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Input username
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoCSR");
		
		//Input password
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		//Click on submit
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(source);
		dd.selectByIndex(4);// using index

		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mark = new Select(marketing);
		mark.selectByValue("CATRQ_AUTOMOBILE"); // the value attribute
		mark.selectByVisibleText("Car and Driver");// using black text
		
		Thread.sleep(2000);
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indus=new Select(industry);
		indus.selectByValue("Computer Software");
	
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership=new Select(owner);
		ownership.selectByVisibleText("S-Corporation");
		
		//Click on create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
//		driver1.close();
		
		
	}

}
