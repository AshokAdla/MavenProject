package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadList {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
        System.out.println(crmsfa.getText());// Element verification
        crmsfa.click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
        // to handle drop down -- select tag
        // step:1 locate the drop doen ele
        // step:2 use select class by creating a object and pass argument as webelement
        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select dd = new Select(source);
        dd.selectByIndex(4
                );// using index
        WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select mark = new Select(marketing);
        /*
         * mark.selectByValue("CATRQ_AUTOMOBILE"); // the value attribute
         * mark.selectByVisibleText("Car and Driver");// using black text
         */            
        List<WebElement> options = mark.getOptions();
        System.out.println(options.size());
        options.get(8).click();
	}
}
