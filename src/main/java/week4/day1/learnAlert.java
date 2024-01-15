package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		String enteredtext="Sample alert message";
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(3000);
		alt.sendKeys(enteredtext);
		alt.accept();
		String obtainedtext=driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(obtainedtext);
		
		String arr[]=obtainedtext.split(":");
		if(enteredtext.equals(arr[1].trim())) {
			System.out.println("Matched strings");
		}else {
			System.out.println("Unmatched strings");
		}
		
		
	}

}
