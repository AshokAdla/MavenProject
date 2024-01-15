package week2.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	private static final String Keys = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		
		//Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//Click on CRm/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
				
		//Click on the Leads Button.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click on Create Lead.
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("SS");
		
		//Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ashok");
		
		//Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("Adla");
		
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ashok");
		
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		
		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Lead Creation");
		
		//Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("ashokchakra1988@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement StPv=driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select sp=new Select(StPv);
		sp.selectByVisibleText("New York");
		
		
		//Click on the Create Button.
		driver.findElement(By.xpath("//input[@value=\"Create Lead\"]")).click();
		Thread.sleep(5000);
		
		//Click on the edit button.
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(3000);
		
		//Fill the Important Note Field with Any text.
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Imp Notes to be taken");
		
		//Click on the update button.
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(3000);
		
		//Get the Title of the Resulting Page.
		String title=driver.getTitle();
		System.out.println(title);
		
		//Close the browser window.
		driver.close();
		
		
	}

}
