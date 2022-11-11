package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //load chrome page
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//load fb page
		driver.get("https://en-gb.facebook.com/");
		//click Create Account
		driver.findElement(By.linkText("Create New Account")).click();
		//enter name
		driver.findElement(By.name("firstname")).sendKeys("Surya");
		//enter surname
		driver.findElement(By.name("lastname")).sendKeys("Anu");
		//enter mobile number/mail id
		driver.findElement(By.name("reg_email__")).sendKeys("surya@gmail.com");
		//enter password
		driver.findElement(By.name("reg_passwd__")).sendKeys("SAbc@123");
		//select birthday
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select day = new Select(birthday); 
		day.selectByValue("16");
		//select month
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select month1 = new Select(month); 
		month1 .selectByValue("9");
		//select year
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select year1 = new Select(year); 
		year1 .selectByValue("1995");
		//select gender
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	

	}

}
