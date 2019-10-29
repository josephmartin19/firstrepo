package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium_Test1 {
WebDriver driver;


public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","chromedriver");
	driver = new ChromeDriver();
	driver.get("hptt://www.amazon.com");
}
	
	public static void main(String[] args) {
		Selenium_Test1 obj = new Selenium_Test1();
		obj.launchBrowser();
		
	}
}	
	

