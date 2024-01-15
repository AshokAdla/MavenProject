package week3.day2;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAmazonPrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> prices=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int pricescount=prices.size();
		List<Integer> vals=new ArrayList<Integer>();
		
		for(int i=0;i<pricescount;i++) {
			String priceval=prices.get(i).getText();
			
			vals.add(Integer.parseInt(priceval));
		
		}
		
		Collections.sort(vals);
		System.out.println(vals.get(0));
		int min=Collections.min(vals);
		System.out.println(min);
		int max=Collections.max(vals);
		System.out.println(max);
		
		
	}

}
