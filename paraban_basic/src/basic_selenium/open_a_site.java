package basic_selenium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_a_site {
	
	

	@Test
	public void test() {
		System.setProperty("webdriver.crhome.driver", "G:/JOB_SWITCH/SELENIUM/chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}

}
