package basic_selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class constant {
	
	
	
	public static String userName = "AK";
	public static String passWord = "TN123";
	public static String confmpassWord = "TN123";
	
	
	// driver and site import -> use as constant.driverfun to open the site and driver.
	public static WebDriver driver = new ChromeDriver();
	public static void driverfun(){
		System.setProperty("webDriver.chrome.driver", "G:/JOB_SWITCH/SELENIUM/chromedriver_win32");
		driver.get("http://parabank.parasoft.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
}
