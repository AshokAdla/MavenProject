package week3.day2.HomeAssignments;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioHomeListInterface {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		String text=driver.findElement(By.xpath("//div[@aria-label='885 Items Found']")).getText();
		String arr[]=text.split(" ");
		System.out.println("Count of Items found: "+arr[0]);
		
		//Print list of brand products
		List<WebElement> brands=driver.findElements(By.xpath("//div[@class='brand']"));
		for(int i=0;i<brands.size();i++) {
			System.out.println(brands.get(i).getText());
		}
		
		//Print the list of names of bags
		List<WebElement> bags=driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(int i=0;i<bags.size();i++) {
			System.out.println(bags.get(i).getText());
		}
		
		
	}

}
