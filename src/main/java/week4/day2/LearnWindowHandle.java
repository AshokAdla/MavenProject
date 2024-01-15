package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

public class LearnWindowHandle {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		List<String> listofwindows=new ArrayList<String>(allwindows);
		
		String childtitle=driver.switchTo().window(listofwindows.get(1)).getTitle();
		System.out.println("Child title:" +childtitle);
		
		String parenttitle=driver.switchTo().window(listofwindows.get(0)).getTitle();
		System.out.println("Parent title:" +parenttitle);
		
		driver.switchTo().window(listofwindows.get(0)).close();
	}
}
