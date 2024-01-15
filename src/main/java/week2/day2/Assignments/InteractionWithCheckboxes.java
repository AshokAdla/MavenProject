package week2.day2.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class InteractionWithCheckboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		//Verify that the expected message is displayed.
		String text=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		Assert.assertEquals(text, "Checked");
		
		//Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		Thread.sleep(10000);
				
		//Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
		
		//Verify if the Checkbox is disabled.
		boolean res=driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']//span[@class='ui-chkbox-label ui-state-disabled']")).isEnabled();
		if(res) {
			System.out.println("Checkbox is Enabled");
		}else {
			System.out.println("Checkbox is Disabled");
		}
		
		//Select multiple options on the page (details may be needed).
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		List<WebElement> countries=driver.findElements(By.xpath("//ul[@role='group']"));
		for(WebElement s:countries) {
			System.out.println(s.getText());
		}
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active']"));

		//traverse through the list and select all checkboxes if they are enabled and displayed.
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
			{
                   System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
                        checkboxes.get(i).click();
			}
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		
		//Close the web browser when done.
		driver.close();
	}

}
