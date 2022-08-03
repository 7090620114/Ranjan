package mobileworld1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
	     driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7090620114");
	   	 driver.findElement(By.id(" address1")).sendKeys("abc(village),abc(post)");
	   	 driver.findElement(By.xpath(" //input[@placeholder='Main St']")).sendKeys("abc(tq)");
	   	 driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("abc");
	     WebElement state = driver.findElement(By.xpath("//select[@id='inputState']"));
	     Select S1 = new Select(state);
	     S1.selectByIndex(2);
	     driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("573218");
	   //  driver.findElement(By.xpath("//input[@rel='lenovo']")).click();
	     driver.findElement(By.xpath("//input[@rel='samsung']")).click();
	     driver.findElement(By.xpath("//input[@rel='samsung']")).click();
	     driver.findElement(By.xpath("//option[.='Samsung S21 FE ']")).click();
	     driver.switchTo().window(parentId);
	     WebElement text1 = driver.findElement(By.xpath("//td[.='Samsung Galaxy S21']"));
	     Thread.sleep(2000);
	     System.out.println("Mobile Name"+" " +text1.getText());
	     WebElement text2 =driver.findElement(By.xpath("(//td)[2]"));
	     Thread.sleep(2000);
	     System.out.println("Features of Mobile "+" " +text2.getText());
	     WebElement text3 =driver.findElement(By.xpath("(//td)[4]"));
	     Thread.sleep(2000);
	     System.out.println("Mobile price  :"+ text3.getText());
	     driver.switchTo().window(childId);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("1");
	     WebElement  count =driver.findElement(By.id("bought"));
	     Select S2 =new Select(count);
	     S2.selectByIndex(1);
	     driver.findElement(By.id("gridCheck1")).click();
	     driver.findElement(By.xpath("(//input[@id='gridCheck1'])[2]")).click();
	     driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	     WebElement T =   driver.findElement(By.xpath("//div[@class='modal-body']"));
	     Thread.sleep(2000);
	     String text = T.getText();
	     System.out.println(text);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
	     driver.quit();
	}
}
