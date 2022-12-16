package submission.ExamClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selection extends BaseDriver{
	
	@Test (priority = 0)
	public void openurl() throws InterruptedException {
		
		driver.get(baseUrl1);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test (priority = 1)
	public void choice() throws InterruptedException {
		
		WebElement country = driver.findElement(By.xpath("//body/div[1]/div[4]/div[2]/div[1]/select[1]"));
		
		Select dropDown = new Select(country);
		
		dropDown.selectByValue("1");
		Thread.sleep(3000);
		
		
	}
}
