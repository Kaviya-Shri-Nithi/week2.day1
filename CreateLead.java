package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaviya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kaviya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("testing....");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaviya@gmail.com");
		
		WebElement eleDropdown =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd =new Select(eleDropdown);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String Title =driver.getTitle();
		System.out.println(Title);
		
		driver.close();
		Thread.sleep(50000);
		
		
	}

}
