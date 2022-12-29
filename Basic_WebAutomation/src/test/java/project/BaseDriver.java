package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
		WebDriver  driver;
		
		static String baseUrl1 = "https://itera-qa.azurewebsites.net/home/automation";
		static String baseUrl2 = "https://the-internet.herokuapp.com/javascript_alerts";
		static String baseUrl3 = "https://www.daraz.com.bd/";
		
		@BeforeSuite
		public void browser() {
			
			
			String medium = System.getProperty("medium", "chrome");
			
			if(medium.contains("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
		}
		
		@AfterSuite
		public void End() throws InterruptedException {
			
			driver.quit();
			Thread.sleep(3000);
		}
	}
