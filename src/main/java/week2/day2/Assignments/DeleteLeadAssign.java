
package week2.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteLeadAssign {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		
		//Enter the user name and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//Click on CRm/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		//Click "leads."
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click "Find leads."
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		

		//Enter the phone number.
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("040");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9703086277");
		

		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//a[text()='Ashok']")).click();
		Thread.sleep(2000);
		
		//Capture the lead ID of the first resulting lead.
		String lead=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		String str[]=lead.split(" ");
		String strf = str[1].replaceAll("\\(.*?\\) ?", "");
		System.out.println(strf);
		
		//Click the "Delete" button.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click "Find leads" again.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Enter the captured lead ID.
		
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("040");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9703086277");
		
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Verify the presence of the message "No records to display" in the Lead List. This 
		//message confirms the successful deletion.
		String msg=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(msg);
		
		//Close the browser.
		driver.close();
		
		
	}

}
