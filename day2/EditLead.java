package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//load chrome page
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Load testleaf page
				driver.get("http://leaftaps.com/opentaps/control/main");
				//enter username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//enter password
				 driver.findElement(By.id("password")).sendKeys("crmsfa");
				 //click login button
				 driver.findElement(By.className("decorativeSubmit")).click();
				 //Click crm/sfa link
				 driver.findElement(By.linkText("CRM/SFA")).click();
				 //Click Leads link
					driver.findElement(By.linkText("Leads")).click();
					//Click Find leads
					driver.findElement(By.linkText("Find Leads")).click();
					System.out.println(driver.getTitle());
					//Enter first name
					driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Surya");			
					//Click Find leads button
					driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
					Thread.sleep(3000);
					WebElement id = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]"));
					String text = id.getText();
					System.out.println(text);
		
					//driver.findElement(By.xpath("//a[text()='10004']")).click();
					System.out.println(driver.getTitle());
					//Click Edit
					driver.findElement(By.xpath("//a[text()='Edit']")).click();
					System.out.println(driver.getTitle());
					//Change the company name
					driver.findElement(By.id("updateLeadForm_companyName")).clear();
					//Click Update
					driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
					//Confirm the changed name appears
					driver.findElement(By.xpath("//input[@name='submitButton']")).click();
					System.out.println(driver.getTitle());
					//Close the browser
					driver.close();
			
		
	}}