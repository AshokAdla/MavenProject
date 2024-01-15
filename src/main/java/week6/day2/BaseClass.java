package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public RemoteWebDriver driver;
	public String filename;
	
	@Parameters({"url","uname","pwd","browser"})
	@BeforeMethod
	public void beforeMethod(String url,String uname,String pwd,String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--disable-notifications");
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--disable-notifications");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	public void tear() {
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException{
		ReadExcelData excelData=new ReadExcelData();
		String[][] readData=ReadExcelData.readData(filename);
		return readData;
	}
}
