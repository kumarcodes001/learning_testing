package basic_selenium;
import basic_selenium.constant;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_module {
	
	WebDriver driver = new ChromeDriver();
	
	
	@Before 
	public void ainto_site() {
		System.setProperty("webDriver.chrome.driver", "G:/JOB_SWITCH/SELENIUM/chromedriver_win32");
		
		driver.get("http://parabank.parasoft.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@Test
	public void test() throws InterruptedException {
		
		//banking_site


		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Arunkumar");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Palani");
		driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("23/F BRO NAGAR");
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Namma Ooru");
		driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("TN");
		driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("627425");
		driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("00123");
		//Creds ---> Locations -----------REGISTER-----------------------------------------
		
//		String userName = "AK";
//		String passWord = "TN123";
//		String confmpassWord = "TN123";
		
	
		driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys(constant.userName);
		driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys(constant.passWord);
		driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys(constant.confmpassWord);
		
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		
		//--------------------------------------------------------------------------------------
		
		//-> Login
		
		//driver.findElement(By.xpath(""))
		
		
		
		//---------------------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(30000);
		driver.quit();
	}
	

}
