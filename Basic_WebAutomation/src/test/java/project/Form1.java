package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Form1 extends BaseDriver{
	
	@Test (priority = 0)
	public void openurl() throws InterruptedException {
		
		driver.get(baseUrl1);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test (priority = 1)
	public void fill() throws InterruptedException {
		
		WebElement name = driver.findElement(By.id("name"));
		WebElement mobileNumber = driver.findElement(By.id("phone"));
		WebElement emailAddress = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement address = driver.findElement(By.id("address"));
		
		WebElement submit = driver.findElement(By.name("submit"));
		
		
		name.sendKeys("Asif");
		Thread.sleep(1000);
		
		mobileNumber.sendKeys("01884918233");
		Thread.sleep(1000);
		
		emailAddress.sendKeys("mycareer.asif@gmail.com");
		Thread.sleep(1000);
		
		password.sendKeys("123456789");
		Thread.sleep(1000);
		
		address.sendKeys("Mirpur, Dhaka");
		Thread.sleep(1000);
		
		submit.click();
		Thread.sleep(3000);
	}
}
