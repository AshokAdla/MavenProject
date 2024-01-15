package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus_updated {
	public static void main(String[] args) throws InterruptedException {
		//01) Launch Firefox / Chrome / Safari / Edge 
				WebDriver driver=new ChromeDriver();

				//02) Load https://www.abhibus.com/
				driver.get("https://www.abhibus.com/");
				driver.manage().window().maximize();
				
				//Add implicitlyWait - driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				
				//03) Type "Chennai" in the FROM text box
				driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
				
				
				//04) Click the first option from the pop up box
				driver.findElement(By.xpath("//div[text()='Chennai']")).click();
				
				//05) Type "Bangalore" in the TO text box
				driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
				
				//06) Click the first option from the pop up box
				driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
				
				//07) Select tomorrow's date in the Date field and click on search button
				driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
				
				//08) Print the name of the first resulting bus (use .getText())
				String firstres=driver.findElement(By.xpath("(//h5[text()='Parveen Travels'])[1]")).getText();
				System.out.println(firstres);

				//09) Choose SLEEPER in the left menu from Bus Type
				driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
				
				//10) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
				String seatcount=driver.findElement(By.xpath("(//div[@class='text-grey'])[1]")).getText();
				System.out.println(seatcount);
				
				//11) Click Show Seats
				driver.findElement(By.xpath("(//button[text()='Show Seats'])[2]")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
				
				//12) Choose any one Available seat
				driver.findElement(By.xpath("(//span[text()='Available'])[1]")).click();
				
				//13) Select the first resulting checkbox from the Boarding Point and Dropping Point
				//driver.findElement(By.xpath("//input[@placeholder='Search Boarding Point']")).sendKeys("T. Nagar");
				
				driver.findElement(By.xpath("(//input[@placeholder='Search Boarding Point']//following::input)[1]")).click();
				Thread.sleep(4000);
				//driver.findElement(By.xpath("//p[text()='T. Nagar (Pickup Van-Bus)']")).click();
				
				driver.findElement(By.xpath("//input[@placeholder='Search Dropping Point']")).sendKeys("Anand Rao Circle");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//p[text()='Anand Rao Circle']")).click();
				
				//14) Print Seats Selected ,Total Fare
				driver.findElement(By.xpath("//span[text()='Continue']")).click();
				
				//15) Get the Title of the page(use .getTitle())
				String title=driver.getTitle();
				System.out.println(title);
				
				//16) Close the browser
				driver.close();

	}
}
