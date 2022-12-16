package submission.ExamClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;



public class AlertAutomation extends BaseDriver{
	
	@Test (priority = 0)
	public void openurl() throws InterruptedException {
		
		driver.get(baseUrl2);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@Test (priority = 1)
	public void verify() throws InterruptedException {
		
		// JS Alert tested
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		
		jsAlert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		WebElement jsAlertResult = driver.findElement(By.xpath("//p[@id='result']"));
		String alertText = jsAlertResult.getText();
		
		assertEquals(alertText, "You successfully clicked an alert");
		
		
		// JS Confirm tested
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		
		jsConfirm.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		WebElement jsConfirmResult = driver.findElement(By.xpath("//p[@id='result']"));
		String confirmText = jsConfirmResult.getText();
		
		assertEquals(confirmText, "You clicked: Ok");
		
		
		// JS Prompt tested
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		
		jsPrompt.click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Prompt clicked");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		WebElement jsPromptResult = driver.findElement(By.xpath("//p[@id='result']"));
		String promptText = jsPromptResult.getText();
		
		assertEquals(promptText, "You entered: Prompt clicked");
		
		
	}
}
