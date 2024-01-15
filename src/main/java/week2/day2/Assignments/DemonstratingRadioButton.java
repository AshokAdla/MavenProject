package week2.day2.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstratingRadioButton {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
		boolean rs=driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).isSelected();
		System.out.println(rs);
		
		//Identify the radio button that is initially selected by default.
		List<WebElement> radio=driver.findElements(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c']"));     //div[@class='card']//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c']
		boolean val=radio.get(0).isSelected();
		System.out.println(val);
		
		//Check and select the age group (21-40 Years) if not already selected.
		List<WebElement> agegroup=driver.findElements(By.xpath("//label[contains(text(),'Years')]"));
		for(int i=0;i<agegroup.size()-1;i++) {
			if(!(agegroup.get(i).isSelected())) {
				agegroup.get(i).click();
				if(agegroup.get(i).isSelected()) {
					System.out.println("true");
					break;
				}
			}
		}
		
		driver.close();
		
	}
	
}
