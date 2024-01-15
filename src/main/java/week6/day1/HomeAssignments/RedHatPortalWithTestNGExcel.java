package week6.day1.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RedHatPortalWithTestNGExcel extends BaseClass {

	@Test(dataProvider="sendData")
	public void runRedHatPortal(String email, String phno) throws InterruptedException {
	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@label='Phone number']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[@id='regform-submit']")).click();
		Thread.sleep(5000);
		
		//Add additional locators
		
		
	}
	
	@DataProvider(name="sendData")
	public String[][] sendData(){
		ReadExcelData excelData=new ReadExcelData();
		String[][] readData=excelData.readData();
		return readData;
	}
}
