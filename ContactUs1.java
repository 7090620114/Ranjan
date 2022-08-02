package mobileworld1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs1 {
	@Test
    public void contact() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   	 WebDriver driver = new ChromeDriver();
	   	 driver.get("https://mobileworld.azurewebsites.net/");
	   	 driver.manage().window().maximize();
	    
	}
}
