package mobileworld1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs1 {
	@Test
    public void contact() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   	 WebDriver driver = new ChromeDriver();
	   	 driver.get("https://mobileworld.azurewebsites.net/");
	   	 driver.manage().window().maximize();
	   	 driver.findElement(By.xpath("//a[@href='mobile.html']")).click();
	     driver.findElement(By.id("navbarDropdown")).click();
	     driver.findElement(By.xpath("//li[@class='nav-item dropdown show']//div//a[2]")).click();
	     Set<String> windows = driver.getWindowHandles();
	     Iterator<String> it = windows.iterator();
	     String parentId = it.next();
	     String childId = it.next();
	     driver.switchTo().window(childId);
	     driver.manage().window().maximize();
	     WebElement T = driver.findElement(By.xpath("//h3[contains(.,'Contact us')]"));
	     Thread.sleep(2000);
	     String text =T.getText();
	     System.out.println(text+ " " +"Page is displayed");
	    
	}
}
