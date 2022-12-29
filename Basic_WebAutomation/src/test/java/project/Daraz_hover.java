package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Daraz_hover extends BaseDriver{
	
	@Test (priority = 0)
	public void openurl() throws InterruptedException {
		
		driver.get(baseUrl3);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@Test (priority = 1)
	public void hoverNav() throws InterruptedException {
		
		WebElement autoMoto = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement ridingGear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		
		
		Actions navigation = new Actions(driver);
		
		navigation.moveToElement(autoMoto).perform();
		Thread.sleep(1000);
		
		navigation.moveToElement(ridingGear).perform();
		Thread.sleep(1000);
		
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		helmet.click();
		Thread.sleep(3000);
	}
}
