package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8901234560");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(3000);
			WebElement id = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]"));
			String text = id.getText();
			System.out.println(text);
			id.click();
			
		//	driver.findElement(By.xpath("//a[text()='10004']")).click();
			
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
                   String PopUp=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
                   if (PopUp.contains(PopUp)) {
				System.out.println("PopUp Message is Displayed");	
				}
                   else {
                	   System.out.println("Popup Message is not Displayed");
                   }
						driver.close();	
 
	}

}



			
		