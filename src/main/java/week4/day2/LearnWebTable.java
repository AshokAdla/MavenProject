package week4.day2;

import java.time.Duration;

import org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

public class LearnWebTable {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("Chennai Beach Jn",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).click();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("Coimbatore Jn",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
		Thread.sleep(4000);
		
		//WebElement trainnames=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		
		WebElement trainnames=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		
		//No.of rows
		List<WebElement> rows=trainnames.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		List<WebElement> cols=rows.get(1).findElements(By.tagName("td"));
		System.out.println(cols.size());
		
		//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[2]/td[2]/child::a[text()='PNBE ERS EXP']
		
		//One column data 
		for(int i=2;i<rows.size();i++) {
			//WebElement onerowdata=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tr/["+i+"]/td[2]/a"));
			
			WebElement onerowdata=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]"));
			
			System.out.println(onerowdata.getText());
		}
	}

}
