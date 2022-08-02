package mobileworld1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signup1 {
	@Test
	public void Signup() throws InterruptedException {
   	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   	 WebDriver driver = new ChromeDriver();
   	 driver.get("https://mobileworld.azurewebsites.net/");
   	 driver.manage().window().maximize();
     WebElement wel =	 driver.findElement(By.xpath("//h1[text()='Welcome To Our Mobile World!']"));
     Thread.sleep(2000);
     String wel1 = wel.getText();
     System.out.println(wel1);
   	 driver.findElement(By.xpath("//button[@type='submit']")).click();
   	 driver.findElement(By.xpath("//a[@href='signup.html']")).click();
     String reg= driver.findElement(By.xpath("//h1[.='Registration Form']")).getText();
	 System.out.println(reg);
   	 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ranjan");
   	 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("abcd");
   	 driver.findElement(By.xpath("//input[@type='Email']")).sendKeys("abcd@gmail.com");
   	 driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("abcd@123");
   	 driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12-07-2022");
   	 driver.findElement(By.cssSelector("div[class='col-md-2'] input[name='gender']")).click();
   	 driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567890");
   	 driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("abcdef");
   	 driver.findElement(By.xpath("//button[@type='submit']")).click();
   	 driver.switchTo().alert().accept();
   	 Thread.sleep(2000);
   	 driver.findElement(By.xpath("//button[@type='Submit']")).click();
   	 driver.switchTo().alert().accept();
   	 driver.findElement(By.id("username")).sendKeys("abcd@gmail.com");
   	 driver.findElement(By.name("password")).sendKeys("abcd@123");
   	 driver.findElement(By.xpath("//a[@type='submit']")).click();
   	 driver.quit(); 
  }

}
