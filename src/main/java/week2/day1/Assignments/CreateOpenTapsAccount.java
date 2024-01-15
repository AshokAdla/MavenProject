package week2.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOpenTapsAccount {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//Launch browser and navigate to leaf taps page
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		
		//Enter the user name and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//Click on CRm/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		//Click on Accounts Tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on Create Account button
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//Enter an Account Name
		driver.findElement(By.id("accountName")).sendKeys("TestAccountTests");
		Thread.sleep(2000);
		String actname=driver.findElement(By.xpath("//input[@id=\"accountName\"]")).getText();
		
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		//Select "ComputerSoftware" as the industry
		WebElement software=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select sw=new Select(software);
		sw.selectByVisibleText("Computer Software");
		
		Thread.sleep(2000);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownership=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select owner=new Select(ownership);
		owner.selectByVisibleText("S-Corporation");
		
		Thread.sleep(2000);
		
		//Select "Employee" as the source using SelectByValue.
		WebElement source=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select src=new Select(source);
		src.selectByVisibleText("Employee");
		
		Thread.sleep(2000);
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement mktcampaign=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select campaign=new Select(mktcampaign);
		campaign.selectByIndex(5);
		
		Thread.sleep(2000);
		
		//Select "Texas" as the state/province using SelectByValue.
		WebElement stateorprovince=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select stateprov=new Select(stateorprovince);
		stateprov.selectByVisibleText("Texas");
		
		//Click the "Create Account" button.
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Verify that the account name is displayed correctly.
		String acctname=driver.findElement(By.xpath("//span[contains(text(),'TestAccount')]")).getText();
		String[] arr=acctname.split(" ");
		if(actname.equals(arr[0])) {
			System.out.println(actname+" - Account created and displayed correctly");
		}else {
			System.out.println(actname+" - Account is not displayed correctly");
		}
		
		//Close the browser window
		//driver.close();
		
		
		
	}

}
