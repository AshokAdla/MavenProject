package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.iterators.ListIteratorWrapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {
	public static void main(String[] args) throws InterruptedException, IOException {
		// setTimeout(function(){debugger;},5000); - Copy and run this code in Console
		// to freeze DOM

		ChromeDriver driver = new ChromeDriver();
		// Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();

		// MouseHover on 'Brands'
		Actions act = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		act.moveToElement(brands);

		// MouseHover on 'Watches & Accessories'
		driver.findElement(By.xpath("(//div[@class='DesktopHeader__arrow'])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='Watches & Accessories']")).click();

		// Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("//div[text()='Featured brands']/following-sibling::div[text()='Casio']")).click();

		// Select sortby: New Arrivals
		WebElement sortby = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		sortby.click();
		Thread.sleep(2000);
		Select arrival = new Select(sortby);
		arrival.selectByVisibleText("New Arrivals");

		// choose men from catagories filter.
		driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
		
//		boolean box=driver.findElement(By.xpath("//a[@class='wzrkClose']")).isDisplayed();
//		if(box) {
//			driver.findElement(By.xpath("//a[@class='wzrkClose']")).click();
//		}
		
		// print all price of watches
		List<WebElement> allprices = driver.findElements(
				By.xpath("//div[@class='ProductDescription__discount ProductDescription__priceHolder']/h3"));

		for (int i = 1; i <= allprices.size()-1; i++) {
			WebElement priceval=(driver.findElement(By.xpath("(//div[@class='ProductDescription__discount ProductDescription__priceHolder']/h3)["+i+"]")));
			System.out.println(priceval.getText());
		}

		// click on the first resulting watch.
		
		WebElement firstelement=driver.findElement(By.xpath("(//div[@class='ProductDescription__discount ProductDescription__priceHolder']/h3)[1]"));
		driver.executeScript("arguments[0].click();", firstelement);

		// compare two price are similar
		
		Set<String> winds = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(winds);
		driver.switchTo().window(lst.get(1));
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//compare the prices from newly opened child window

		// Click on the first resulting contact.
		driver.findElement(By.xpath("(//div[@class=\"x-grid3-row   \"])[1]")).click();
		Thread.sleep(3000);

		// click Add to cart and get count from the cart icon.
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();

		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		Thread.sleep(5000);

		String quantity = driver.findElement(By.xpath("//div[contains(text(),'Quantity:')]")).getText();
		System.out.println(quantity);

		// Click on the cart
		driver.findElement(By.xpath("//div[text()='My Bag']")).click();

		// Take a snap of the resulting page//
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		String fileWithPath = "C:\\screenshots\\test.png";
		File destfile = new File(fileWithPath);
		FileUtils.copyFile(srcfile, destfile);

		// All the opened windows one by one.
		Set<String> handles = driver.getWindowHandles(); ;
        for (String handle: handles ) {
            driver.switchTo().window(handle);
            String windowTitle=driver.getTitle();
            if (windowTitle!=null) {
                driver.close();
            }
        }	
	}
}
