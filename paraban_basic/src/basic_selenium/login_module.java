package basic_selenium;



import basic_selenium.open_a_site;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basic_selenium.constant;

public class login_module {
	

	@Test
	public void test() {
		
		constant.driverfun();
		constant.driver.findElement(By.className("input")).sendKeys(constant.userName);
		constant.driver.findElement(By.name("password")).click();
		constant.driver.findElement(By.name("password")).sendKeys(constant.passWord);
		constant.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		String balance = constant.driver.findElement(By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[3]")).getText();
		System.out.println("Available Balance: " + balance);
		
		
		//System.out.println("Button clicked");
	}
}
