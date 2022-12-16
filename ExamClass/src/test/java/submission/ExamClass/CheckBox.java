package submission.ExamClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends BaseDriver{
	
	@Test (priority = 0)
	public void openurl() throws InterruptedException {
		
		driver.get(baseUrl1);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test (priority = 1)
	public void radioButton() throws InterruptedException {
		
		WebElement gender = driver.findElement(By.id("male"));
		WebElement chkTuesday = driver.findElement(By.id("tuesday"));
		WebElement chkFriday = driver.findElement(By.id("friday"));
		
		gender.click();
		Thread.sleep(1000);
		
		chkTuesday.click();
		Thread.sleep(1000);
		
		chkFriday.click();
		Thread.sleep(3000);
	}
}
