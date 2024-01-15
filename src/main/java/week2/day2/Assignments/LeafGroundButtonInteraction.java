package week2.day2.Assignments;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//Verify that the title of the page is ‘dashboard.’
		String title=driver.getTitle();
		if(title=="Dashboard") {				
			System.out.println(title);
		}
		
		driver.navigate().back();
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		boolean res=driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();
		if(res) {
			System.out.println("Button is disabled");
		}else {
			System.out.println("Button is enabled");
		}
		
		//Find and print the position of the button with the text ‘Submit.’
		WebElement location=driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'][normalize-space()='Submit'])[1]"));
		Point point=location.getLocation();
		System.out.println("X location: "+point.getX());
		System.out.println("Y location: "+point.getY());
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		String color=driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println(color);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		WebElement Image=driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'][normalize-space()='Submit'])[2]"));
		
        //Get width of element.
        int ImageWidth = Image.getSize().getWidth();
        System.out.println("Image width Is "+ImageWidth+" pixels");
        
        //Get height of element.
        int ImageHeight = Image.getSize().getHeight();        
        System.out.println("Image height Is "+ImageHeight+" pixels");
		
		//Close the browser window.
        driver.close();
		
		
	}

}
