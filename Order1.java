package mobileworld1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order1 {
	@Test
	public void orders() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   	 WebDriver driver = new ChromeDriver();
	   	 driver.get("https://mobileworld.azurewebsites.net/");
	}
}
