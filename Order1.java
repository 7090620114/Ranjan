package mobileworld1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order1 {
	@Test
	public void orders() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   	 WebDriver driver = new ChromeDriver();
	   	 driver.get("https://mobileworld.azurewebsites.net/");
	   	 driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[@href='mobile.html']")).click();
	     driver.findElement(By.xpath("(//a[@href='order.html'])[2]")).click();
	     Set<String> windows = driver.getWindowHandles();
	     Iterator<String> it = windows.iterator();
	     String parentId = it.next();
	     String childId = it.next();
	     driver.switchTo().window(childId);
	     driver.findElement(By.id("inputFirstName")).sendKeys("Ranjan");
	   	 driver.findElement(By.xpath("(//input[@id='inputFirstName'])[2]")).sendKeys("C L");
	   	 driver.findElement(By.id("inputEmail")).sendKeys("abcd@gmail.com");
	   	 driver.findElement(By.id("inputPassword")).sendKeys("abcd@123");
	   	 driver.findElement(By.id("flexRadioDefault1")).click();
	}
}
