package week6.day1.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public RemoteWebDriver driver;
	
	@Parameters({"browser","url","uname","pwd"})
	@BeforeMethod
	public void beforeMethod(String browser, String url, String uname, String pwd) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new ChromeDriver();
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--disable-notifications");
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new ChromeDriver();
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--disable-notifications");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//button[@id='rh-registration-link']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8000));
		String page=driver.findElement(By.xpath("//h1[text()='Register for a Red Hat account']")).getText();
		if(page.equalsIgnoreCase("Register for a Red Hat account")) {
			System.out.println("Register for Red Hat Account Page is displayed");
		}else {
			System.out.println("Register for Red Hat Account Page is not displayed");
		}
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd,Keys.TAB);	
	}
	
	@AfterMethod
	public void tearup() {
		driver.close();
	}
}
